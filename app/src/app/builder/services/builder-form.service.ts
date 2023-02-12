import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { HttpService } from '../../shared/services/http.service';

@Injectable({
  providedIn: 'root'
})
export class BuilderFormService {

  constructor(private _http: HttpService) { }

  getResume(id: string): Observable<any> {
    return this._http.getSingle(`${environment.apiBaseURL}/resumes/${id}`);
  }

  saveResume(resume: any, id?: number) {
    if (id != undefined) {
      return this._http.addData(`${environment.apiBaseURL}/resumes`, resume);
    } else {
      return this._http.updateData(`${environment.apiBaseURL}/resumes/${id}`, resume);
    }
  }
}
