import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class HttpService {
  private readonly basUrlApi: string = environment.apiBaseURL;
  private httpOptions: any = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
    constructor(private _http: HttpClient) { }

    getList(url: string): Observable<any> { return this._http.get(`${this.basUrlApi}/${url}`, this.httpOptions); }

    getSingle(url: string): Observable<any> { return this._http.get(`${this.basUrlApi}/${url}`, this.httpOptions); }

    addData(url: string, data: Object): Observable<any> { return this._http.post(`${this.basUrlApi}/${url}`, data, this.httpOptions); }

    updateData(url: string, data: Object): Observable<any> { return this._http.patch(`${this.basUrlApi}/${url}`, data, this.httpOptions); }

    deleteSingle(url: string): Observable<any> { return this._http.delete(`${this.basUrlApi}/${url}`, this.httpOptions); }
}
