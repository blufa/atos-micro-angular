import { Component, Input } from '@angular/core';
import { AbstractControl, FormArray, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-leisures-form',
  templateUrl: './leisures-form.component.html',
  styleUrls: ['./leisures-form.component.scss']
})
export class LeisuresFormComponent {

  @Input() form: FormArray;

  getControl(control: AbstractControl): FormControl {
    return control as FormControl;
  }

  addLeisure(): void {
    this.form.push(new FormControl("", [Validators.required, Validators.minLength(3)]));
  }

  removeLeisure(index: number): void {
    this.form.removeAt(index);
  }
}
