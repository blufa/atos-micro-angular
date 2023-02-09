import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-work-experiences-form',
  templateUrl: './work-experiences-form.component.html',
  styleUrls: ['./work-experiences-form.component.scss']
})
export class WorkExperiencesFormComponent {
  workXCompanyControl: FormControl = new FormControl("", Validators.required);
  workXJobTitleControl: FormControl = new FormControl("", Validators.required);
  workXJobDescritionControl: FormControl = new FormControl("", Validators.required);
  workXstartDateControl: FormControl = new FormControl("", Validators.required);
  workXendDateControl: FormControl = new FormControl("", Validators.required);
  workXAccomp: FormControl = new FormControl("", Validators.required);
  workXEnv: FormControl = new FormControl("", Validators.required);
}
