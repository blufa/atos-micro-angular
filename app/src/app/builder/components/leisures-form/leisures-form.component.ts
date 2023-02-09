import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Button } from 'src/app/shared/interfaces/button';

@Component({
  selector: 'app-leisures-form',
  templateUrl: './leisures-form.component.html',
  styleUrls: ['./leisures-form.component.scss']
})
export class LeisuresFormComponent {
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

  leisuresControl: FormControl = new FormControl("", Validators.required);
}

