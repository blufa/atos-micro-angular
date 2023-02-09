import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-references-form',
  templateUrl: './references-form.component.html',
  styleUrls: ['./references-form.component.scss']
})
export class ReferencesFormComponent {
  refFullNameControl: FormControl = new FormControl("", Validators.required);
  refPhoneNumberControl: FormControl = new FormControl("", Validators.required);
  refEmailControl: FormControl = new FormControl("", Validators.required);
  refJobTitleControl: FormControl = new FormControl("", Validators.required);
  refCompanyControl: FormControl = new FormControl("", Validators.required);
}
