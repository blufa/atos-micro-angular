import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Button } from 'src/app/shared/interfaces/button';

@Component({
  selector: 'app-experiences-form',
  templateUrl: './experiences-form.component.html',
  styleUrls: ['./experiences-form.component.scss']
})
export class ExperiencesFormComponent {
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

  companyControl: FormControl = new FormControl("", Validators.required);
  jobTitleControl: FormControl = new FormControl("", Validators.required);
  description: FormControl = new FormControl("", Validators.required);
  accomplishments: FormControl = new FormControl("", Validators.required);
  environment: FormControl = new FormControl("", Validators.required);
  startDate: FormControl = new FormControl("", Validators.required);
  endDate: FormControl = new FormControl("", Validators.required);
}
