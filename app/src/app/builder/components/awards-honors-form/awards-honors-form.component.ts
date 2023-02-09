import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-awards-honors-form',
  templateUrl: './awards-honors-form.component.html',
  styleUrls: ['./awards-honors-form.component.scss']
})
export class AwardsHonorsFormComponent {
  awardHonorNameControl: FormControl = new FormControl("", Validators.required);
  awardHonorYearControl: FormControl = new FormControl("", Validators.required);
}
