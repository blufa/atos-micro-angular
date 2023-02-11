import { Component, Input } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-skills-form',
  templateUrl: './skills-form.component.html',
  styleUrls: ['./skills-form.component.scss']
})
export class SkillsFormComponent {
  @Input() form: FormArray;

  getControl(control: AbstractControl | null): FormControl {
    return control as FormControl;
  }

  addSkill(): void {
    this.form.push(new FormGroup({
      name: new FormControl("", [Validators.required, Validators.minLength(2)]),
      level: new FormControl("BEGINNER", [Validators.required])
    }));
  }

  removeSkill(index: number): void {
    this.form.removeAt(index);
  }
}
