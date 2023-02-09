import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { Button } from 'src/app/shared/interfaces/button';

@Component({
  selector: 'app-skills-form',
  templateUrl: './skills-form.component.html',
  styleUrls: ['./skills-form.component.scss']
})
export class SkillsFormComponent {
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

  skillControl: FormControl = new FormControl("", Validators.required);
  levelControl: FormControl = new FormControl("", Validators.required);
}
