import { Component, Input } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-work-experiences-form',
  templateUrl: './work-experiences-form.component.html',
  styleUrls: ['./work-experiences-form.component.scss']
})
export class WorkExperiencesFormComponent {
  @Input() form: FormArray;

  workXCompanyControl: FormControl = new FormControl("", Validators.required);
  workXJobTitleControl: FormControl = new FormControl("", Validators.required);
  workXJobDescritionControl: FormControl = new FormControl("", Validators.required);
  workXstartDateControl: FormControl = new FormControl("", Validators.required);
  workXendDateControl: FormControl = new FormControl("", Validators.required);

  getControl(control: AbstractControl | null): FormControl {
    return control as FormControl;
  }

  addWorkExperience(): void {
    this.form.push(new FormGroup({
      company: new FormControl('', [Validators.required, Validators.minLength(2)]),
      jobTitle: new FormControl('', [Validators.required, Validators.minLength(3)]),
      jobDescription: new FormControl('', [Validators.required, Validators.minLength(20)]),
      startDate: new FormControl('', [Validators.required]),
      endDate: new FormControl('')
    }));
  }

  removeWorkExperience(index: number): void {
    this.form.removeAt(index);
  }
}
