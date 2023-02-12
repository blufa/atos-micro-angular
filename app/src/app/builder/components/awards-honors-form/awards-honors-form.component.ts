import { Component, Input } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-awards-honors-form',
  templateUrl: './awards-honors-form.component.html',
  styleUrls: ['./awards-honors-form.component.scss']
})
export class AwardsHonorsFormComponent {
  @Input() form: FormArray;

  getControl(control: AbstractControl | null): FormControl {
    return control as FormControl;
  }

  addAwardHonor(): void {
    this.form.push(new FormGroup({
      name: new FormControl("", [Validators.required, Validators.minLength(3)]),
      year: new FormControl('', [Validators.required, Validators.minLength(4), Validators.maxLength(4), Validators.min(1900), Validators.max(new Date().getFullYear())])
    }));
  }

  removeAwardHonor(index: number): void {
    this.form.removeAt(index);
  }
}
