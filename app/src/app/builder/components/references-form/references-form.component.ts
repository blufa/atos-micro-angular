import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Button } from 'src/app/shared/interfaces/button';

@Component({
  selector: 'app-references-form',
  templateUrl: './references-form.component.html',
  styleUrls: ['./references-form.component.scss']
})
export class ReferencesFormComponent {
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

  fullNameControl: FormControl = new FormControl("", Validators.required);
  jobTitleControl: FormControl = new FormControl("", Validators.required);
  phoneNumberControl: FormControl = new FormControl("", Validators.required);
  emailControl: FormControl = new FormControl("", Validators.required);
  companyControl: FormControl = new FormControl("", Validators.required);
}
