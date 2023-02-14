import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpService } from '../../shared/services/http.service';

@Injectable({
  providedIn: 'root'
})
export class BuilderFormService {
  private readonly url = 'cv-service/api/v1';
  constructor(private _http: HttpService) { }

  getResume(id: string): Observable<any> {
    return this._http.getSingle(`${this.url}/resumes/${id}`);
  }

  saveResume(resume: any, id?: number) {
    if (id != undefined) {
      return this._http.addData(`${this.url}/resumes`, resume);
    } else {
      return this._http.updateData(`${this.url}/resumes/${id}`, resume);
    }
  }
}
