import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-candidate-form',
  templateUrl: './candidate-form.component.html',
  styleUrls: ['./candidate-form.component.scss']
})
export class CandidateFormComponent {
  firstNameControl: FormControl = new FormControl("", Validators.required);
  lastNameControl: FormControl = new FormControl("", Validators.required);
  emailControl: FormControl = new FormControl("", Validators.required);
  addressControl: FormControl = new FormControl("", Validators.required);
  phoneNumberControl: FormControl = new FormControl("", Validators.required);
  dobControl: FormControl = new FormControl("", Validators.required);
  occupationControl: FormControl = new FormControl("", Validators.required);
  photoUrlControl: FormControl = new FormControl("", Validators.required);

  linkControl: FormControl = new FormControl("", Validators.required);
}
