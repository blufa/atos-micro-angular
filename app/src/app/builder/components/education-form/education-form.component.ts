import { Component, Input } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-education-form',
  templateUrl: './education-form.component.html',
  styleUrls: ['./education-form.component.scss']
})
export class EducationFormComponent {

  @Input() form: FormArray;

  addEducation(): void {
    this.form.push(new FormGroup({
      schoolName: new FormControl('', [Validators.required, Validators.minLength(3)]),
      diploma: new FormControl('', [Validators.required, Validators.minLength(3)]),
      startDate: new FormControl('', [Validators.required]),
      endDate: new FormControl('')
    }))
  }

  removeEducation(index: number): void {
    this.form.removeAt(index);
  }

  getControl(control: AbstractControl | null): FormControl {
    return control as FormControl;
  }
}
