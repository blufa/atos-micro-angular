import { Component, Input } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-references-form',
  templateUrl: './references-form.component.html',
  styleUrls: ['./references-form.component.scss']
})
export class ReferencesFormComponent {

  @Input() form: FormArray;

  getControl(control: AbstractControl | null): FormControl {
    return control as FormControl;
  }

  addReference(): void {
    this.form.push(new FormGroup({
      fullName: new FormControl('', [Validators.required, Validators.minLength(5)]),
      phoneNumber: new FormControl('', [Validators.required, Validators.minLength(9), Validators.maxLength(12)]),
      email: new FormControl('', [Validators.required, Validators.email]),
      jobTitle: new FormControl('', [Validators.required, Validators.minLength(3)]),
      company: new FormControl('', [Validators.required, Validators.minLength(2)])
    }));
  }

  removeReference(index: number): void {
    this.form.removeAt(index);
  }
}
