import { Component, Input } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-certifications-form',
  templateUrl: './certifications-form.component.html',
  styleUrls: ['./certifications-form.component.scss']
})
export class CertificationsFormComponent {

  @Input() form: FormArray;

  certificateNameControl: FormControl = new FormControl("", Validators.required);
  certificateYearControl: FormControl = new FormControl("", Validators.required);

  getControl(certification: AbstractControl | null): FormControl {
    return certification as FormControl;
  }

  addCertification(): void {
    this.form.push(new FormGroup({
      name: new FormControl('', [Validators.required, Validators.minLength(3)]),
      year: new FormControl('', [Validators.required, Validators.minLength(4), Validators.maxLength(4), Validators.min(1900), Validators.max(new Date().getFullYear())])
    }));
  }

  removeCertification(index: number): void {
    this.form.removeAt(index);
  }
}
