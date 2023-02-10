import { User } from '../interfaces/user';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import { tap, catchError, map } from 'rxjs/operators';
import { HttpService } from './http.service';
import { NotificationService } from './notification.service';

interface IResponse {access_token: string, token_type: string, expires_in: number, user: User}

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private readonly ACCESS_TOKEN = 'ACCESS_TOKEN';
  private readonly REFRESH_TOKEN = 'REFRESH_TOKEN';
  private readonly USER_INFOS = 'USER_INFOS';
  private readonly url = 'auth';

  constructor(
    private _http: HttpService,
    private notify: NotificationService,
    private router: Router
  ) { }

  login = (data: { login: string, password: string }): Observable<boolean> => {
    return this._http.addData(`${this.url}/login`, data)
      .pipe(
        tap((res: IResponse) => {
          this.doLoginUser(res.user, res.access_token, res.access_token);
          this.notify.success(`Bienvenue ${res.user.firstName} ${res.user.lastName} !`, "Success : ");
        }),
        map(()=>true),
        catchError(error => {
          let message = 'Email ou mot de passe incorrect !'
          if(error.status === 0){ 
            message = "Serveur indisponible, veillez contactez le support !";
          }
          else{ 
            message = error?.error?.error ? error?.error?.error : "Connexion échouée, u;ne erreur est survenue"
          }
          console.log(error);
          this.notify.error(message, "Erreur : ");
          return of(false);
        }));
  }

  logout = (): Observable<boolean> => {
    return this._http.addData(`${this.url}/logout`,{})
      .pipe(
        tap(() => {
          this.doLogoutUser();
          this.router.navigateByUrl('/login').then()
        }),
        mapTo(true),
        catchError(error => {
          console.log(error)
          return of(false);
        }));
  }

  isLoggedIn = (): boolean => { return !!this.getAccessToken(); }

  refreshToken = (): Observable<IResponse> => {
    return this._http.addData(`${this.url}/refresh`, { token: this.getRefreshToken() })
      .pipe(
        tap((res: IResponse) => {
        this.storeAcessToken(res.access_token);
      }));
  }

  getAccessToken = (): string|null => { return localStorage.getItem(this.ACCESS_TOKEN); }

  getRefreshToken = (): string|null => { return localStorage.getItem(this.REFRESH_TOKEN); }

  getUserLoggedIn = (): User|null => {
    const userInfos = localStorage.getItem(this.USER_INFOS);

    if (userInfos) {
      const user: User = JSON.parse(userInfos);
      return user;
    }
     return null
  }

  private storeAcessToken = (access_token: string): void => { localStorage.setItem(this.ACCESS_TOKEN, access_token); }

  private doLoginUser = (user: User, access_token: string, refresh_token: string): void => {
    localStorage.setItem(this.ACCESS_TOKEN, access_token);
    localStorage.setItem(this.REFRESH_TOKEN, refresh_token);
    localStorage.setItem(this.USER_INFOS, JSON.stringify(user));
  }

  private doLogoutUser = (): void => {
    localStorage.removeItem(this.ACCESS_TOKEN);
    localStorage.removeItem(this.REFRESH_TOKEN);
    localStorage.removeItem(this.USER_INFOS);
  }
}
