import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-skills-form',
  templateUrl: './skills-form.component.html',
  styleUrls: ['./skills-form.component.scss']
})
export class SkillsFormComponent {
  skillNameControl: FormControl = new FormControl("", Validators.required);
  skillLevelControl: FormControl = new FormControl("BEGINNER", Validators.required);
}
