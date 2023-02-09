import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-languages-form',
  templateUrl: './languages-form.component.html',
  styleUrls: ['./languages-form.component.scss']
})
export class LanguagesFormComponent {
  languageControl: FormControl = new FormControl("", Validators.required);
  languageLevelControl: FormControl = new FormControl("BEGINNER", Validators.required);
}
