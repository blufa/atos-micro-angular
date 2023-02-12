import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class BuilderFormService {

  constructor(private http: HttpClient) { }

  getResume(id: string): Observable<any> {
    return this.http.get(`${environment.apiBaseURL}/resumes/${id}`);
  }

  saveResume(resume: any, id?: number) {
    if (id != undefined) {
      return this.http.post(`${environment.apiBaseURL}/resumes`, resume);
    } else {
      return this.http.put(`${environment.apiBaseURL}/resumes/${id}`, resume);
    }
  }
}
