import { User } from '../interfaces/user';
import { HttpService } from './http.service';
import { NotificationService } from './notification.service';
import { UserLoggedIn } from '../interfaces/user-logged-in';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import { tap, map, catchError } from 'rxjs/operators';

interface IResponse {
  status: number;
  data: UserLoggedIn,
  message: string;
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private readonly USER_INFOS = 'USER_INFOS';
  private readonly url = 'auth';

  constructor(
    private _http: HttpService,
    private _notify: NotificationService,
    private _router: Router
  ) { }

  login = (data: { login: string, password: string }): Observable<boolean> => {
    return this._http.addData(`${this.url}/login`, data)
      .pipe(
        tap((res: IResponse) => {
          this.doLoginUser(res.data);
          this._notify.success(`Bienvenue ${res.data.firstName} ${res.data.lastName} !`, "Success : ");
        }),
        map(() => true),
        catchError(error => {
          let message = 'Email ou mot de passe incorrect !'
          if (error.status === 0) {
            message = "Serveur indisponible, veillez contactez le support !";
          }
          else {
            message = error?.error?.error ? error?.error?.error : "Connexion échouée, u;ne erreur est survenue"
          }
          console.log(error);
          this._notify.error(message, "Erreur : ");
          return of(false);
        }));
  }

  logout = (): Observable<boolean> => {
    return this._http.addData(`${this.url}/logout`, {})
      .pipe(
        tap(() => {
          this.doLogoutUser();
          this._router.navigateByUrl('/').then()
        }),
        map(() => true),
        catchError(error => {
          console.log(error)
          return of(false);
        }));
  }

  isLoggedIn = (): boolean => { return !!this.getAccessToken(); }

  refreshToken = (): Observable<{ userId: string, accessToken: string, refreshToken: string }> => {
    return this._http.addData(`${this.url}/refresh`, { token: this.getRefreshToken() })
      .pipe(
        tap((res: { userId: string, accessToken: string, refreshToken: string }) => {
          this.storeAcessToken(res.accessToken);
        }));
  }

  getAccessToken = (): string | undefined => {
    return this.getUserLoggedIn()?.accessToken;
  }

  getRefreshToken = (): string | undefined => {
    return this.getUserLoggedIn()?.refreshToken;
  }

  getUserLoggedIn = (): UserLoggedIn | null => {
    const userInfos = localStorage.getItem(this.USER_INFOS);

    if (userInfos) {
      const user: UserLoggedIn = JSON.parse(userInfos);
      return user;
    }
    return null
  }

  private storeAcessToken = (accessToken: string): void => {
    const userInfos = localStorage.getItem(this.USER_INFOS);
    if (userInfos) {
      let user: UserLoggedIn = JSON.parse(userInfos);
      user = { ...user, accessToken: accessToken }
      localStorage.setItem(this.USER_INFOS, JSON.stringify(user));
    }
  }

  private doLoginUser = (user: UserLoggedIn): void => {
    localStorage.setItem(this.USER_INFOS, JSON.stringify(user));
  }

  private doLogoutUser = (): void => {
    localStorage.removeItem(this.USER_INFOS);
  }
}
