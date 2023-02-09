import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Button } from 'src/app/shared/interfaces/button';

@Component({
  selector: 'app-certifications-form',
  templateUrl: './certifications-form.component.html',
  styleUrls: ['./certifications-form.component.scss']
})
export class CertificationsFormComponent {
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

  certificateControl: FormControl = new FormControl("", Validators.required);
  yearControl: FormControl = new FormControl("", Validators.required);
}
