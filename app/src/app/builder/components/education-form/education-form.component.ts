import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-education-form',
  templateUrl: './education-form.component.html',
  styleUrls: ['./education-form.component.scss']
})
export class EducationFormComponent {
  schoolNameControl: FormControl = new FormControl("", Validators.required);
  diplomaControl: FormControl = new FormControl("", Validators.required);
  startDateControl: FormControl = new FormControl("", Validators.required);
  endDateControl: FormControl = new FormControl("", Validators.required);
}
