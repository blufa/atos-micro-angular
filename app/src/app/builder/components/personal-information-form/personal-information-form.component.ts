import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Button } from 'src/app/shared/interfaces/button';

@Component({
  selector: 'app-personal-information-form',
  templateUrl: './personal-information-form.component.html',
  styleUrls: ['./personal-information-form.component.scss']
})
export class PersonalInformationFormComponent {
  nextBtn: Button = {
    title: "Next",
    icon: "",
    showIcon: false,
    showTitle: true,
    type: "",
    func: () => {
      return false;
    },
    params: []
  }

  backBtn: Button = {
    title: "Back",
    icon: "",
    showIcon: false,
    showTitle: true,
    type: "",
    func: () => {
      return false;
    },
    params: []
  }

  firstNameControl: FormControl = new FormControl("", Validators.required);
  lastNameControl: FormControl = new FormControl("", Validators.required);
  address: FormControl = new FormControl("", Validators.required);
  phoneNumber: FormControl = new FormControl("", Validators.required);
  occupation: FormControl = new FormControl("", Validators.required);
  photoURL: FormControl = new FormControl("", Validators.required);
  contactLinks: FormControl = new FormControl("", Validators.required);
}
