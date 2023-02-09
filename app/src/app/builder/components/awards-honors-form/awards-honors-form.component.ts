import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Button } from 'src/app/shared/interfaces/button';

@Component({
  selector: 'app-awards-honors-form',
  templateUrl: './awards-honors-form.component.html',
  styleUrls: ['./awards-honors-form.component.scss']
})
export class AwardsHonorsFormComponent {
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

  nameControl: FormControl = new FormControl("", Validators.required);
  yearControl: FormControl = new FormControl("", Validators.required);
}
