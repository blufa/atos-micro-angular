import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpErrorResponse
} from '@angular/common/http';
import { BehaviorSubject, Observable, throwError } from 'rxjs';
import { AuthService } from '../services/auth.service';
import { Router } from '@angular/router';
import { catchError, filter, switchMap, take } from 'rxjs/operators';

@Injectable()
export class TokenInterceptor implements HttpInterceptor {

  private refreshingInProgress: boolean = false;
  private accessTokenSubject: BehaviorSubject<string> = new BehaviorSubject<string>('');

  constructor(
    private _authService: AuthService,
    private _router: Router
  ) { }

  intercept(req: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    const accessToken = this._authService.getAccessToken();

    if( accessToken !== null && accessToken !== undefined) {
      return next.handle(this.addAuthorizationHeader(req, accessToken)).pipe(
        catchError(err => {

          if (err instanceof HttpErrorResponse && err.status === 401) {
            const refreshToken = this._authService.getRefreshToken();

            if (refreshToken && accessToken != '') {
              return this.refreshToken(req, next);
            }
          }

          if ([403].includes(err.status) && this._authService.isLoggedIn()) {
            return this.logoutAndRedirect(err);
          }
          return throwError(()=>new err(err));
        })
      );
    }

    return next.handle(req);
  }

  private logoutAndRedirect(err: string): Observable<HttpEvent<any>> {
    this._authService.logout().subscribe(() => this._router.navigateByUrl('/login').then());
    return throwError(()=>new Error(err));
  }

  private addAuthorizationHeader(request: HttpRequest<any>, token: string): HttpRequest<any> {
    if (token) {
      return request.clone({ setHeaders: { Authorization: `Bearer ${token}` } });
    }
    return request;
  }

  private refreshToken(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    if (!this.refreshingInProgress) {
      this.refreshingInProgress = true;
      this.accessTokenSubject.next('');

      return this._authService.refreshToken().pipe(
        switchMap((res) => {
          this.refreshingInProgress = false;
          this.accessTokenSubject.next(res.accessToken);
          return next.handle(this.addAuthorizationHeader(request, res.accessToken));
        })
      );
    } else {
      return this.accessTokenSubject.pipe(
        filter(token => token !== null),
        take(1),
        switchMap(token => {
          return next.handle(this.addAuthorizationHeader(request, token));
        }));
    }
  }
}
