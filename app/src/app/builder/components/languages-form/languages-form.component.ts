import { Component, Input } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-languages-form',
  templateUrl: './languages-form.component.html',
  styleUrls: ['./languages-form.component.scss']
})
export class LanguagesFormComponent {
  @Input() form: FormArray;

  getControl(control: AbstractControl | null): FormControl {
    return control as FormControl;
  }

  addLanguage(): void {
    this.form.push(new FormGroup({
      name: new FormControl("", [Validators.required, Validators.minLength(2)]),
      level: new FormControl("BEGINNER", [Validators.required])
    }));
  }

  removeLanguage(index: number): void {
    this.form.removeAt(index);
  }
}
