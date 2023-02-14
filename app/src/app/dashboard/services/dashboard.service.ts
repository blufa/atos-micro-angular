import { Injectable } from '@angular/core';
import { HttpService } from '../../shared/services/http.service';
import { Resume } from '../../shared/interfaces/resume';
import { Observable } from 'rxjs';
import { ListOptions } from '../../shared/interfaces/list';
import { AuthService } from '../../shared/services/auth.service';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {
  private readonly url = 'cv-service/api/v1';
  constructor(private _http: HttpService, private authService: AuthService) { }

 /*  getResumesByUser(options: ListOptions): Observable<Resume>{
    const search = options.search || '';
    const page = options.page || 1;
    const limit = options.limit || 10;
    const userLoggedIn = this.authService.getUserLoggedIn();
    return this._http.getList(`${this.url}/${userLoggedIn.}?page=${page}&limit=${limit}&search=${search}`);
  } */

  getResumesByUser(): Observable<Resume>{
    const userLoggedIn = this.authService.getUserLoggedIn();
    return this._http.getList(`${this.url}/${userLoggedIn?.userId}`);
  }

  getResumes() {
    return this._http.getList(`${this.url}/resumes`);
  }

  deleteResumeByid(id: number) { 
    return this._http.deleteSingle(`${this.url}/resumes/${id}`);
  }
  updateResumeByid(id: number, resume: Resume) {
    return this._http.updateData(`${this.url}/resumes/${id}`, resume)
  }
}
