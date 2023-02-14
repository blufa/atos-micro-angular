import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpService } from '../../shared/services/http.service';

@Injectable({
  providedIn: 'root'
})
export class BuilderFormService {
  private readonly url = 'api/v1';
  constructor(private _http: HttpService) { }

  getResume(id: string): Observable<any> {
    return this._http.getSingle(`${this.url}/resume/${id}`);
  }

  saveResume(resume: any, id?: string) {
    if (id == undefined) {
      return this._http.addData(`${this.url}/resume`, resume);
    } else {
      return this._http.updateData(`${this.url}/resume/${id}`, resume);
    }
  }
}
