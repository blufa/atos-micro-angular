import { Component, Input, OnInit } from '@angular/core';
import { AbstractControl, FormArray, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-candidate-form',
  templateUrl: './candidate-form.component.html',
  styleUrls: ['./candidate-form.component.scss']
})
export class CandidateFormComponent implements OnInit {

  @Input() form: FormGroup;

  firstNameControl: FormControl;
  lastNameControl: FormControl;
  emailControl: FormControl;
  addressControl: FormControl;
  phoneNumberControl: FormControl;
  dobControl: FormControl;
  occupationControl: FormControl;
  photoUrlControl: FormControl;
  externalLinks: FormArray;

  ngOnInit(): void {
    this.firstNameControl = this.form.get("firstName") as FormControl;
    this.lastNameControl = this.form.get("lastName") as FormControl;
    this.emailControl = this.form.get("email") as FormControl;
    this.addressControl = this.form.get("address") as FormControl;
    this.phoneNumberControl = this.form.get("phoneNumber") as FormControl;
    this.dobControl = this.form.get("dob") as FormControl;
    this.occupationControl = this.form.get("occupation") as FormControl;
    this.photoUrlControl = this.form.get("photoUrl") as FormControl;
    this.externalLinks = this.form.get("externalLinks") as FormArray;
  }

  getControl(link: AbstractControl): FormControl {
    return link as FormControl;
  }

  addExternalLink(): void {
    this.externalLinks.push(new FormControl('', Validators.minLength(8)))
  }

  removeExternalLink(index: number): void {
    this.externalLinks.removeAt(index);
  }
}
