import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-certifications-form',
  templateUrl: './certifications-form.component.html',
  styleUrls: ['./certifications-form.component.scss']
})
export class CertificationsFormComponent {
  certificateNameControl: FormControl = new FormControl("", Validators.required);
  certificateYearControl: FormControl = new FormControl("", Validators.required);
}
