import { Component } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-leisures-form',
  templateUrl: './leisures-form.component.html',
  styleUrls: ['./leisures-form.component.scss']
})
export class LeisuresFormComponent {
  leisureControl: FormControl = new FormControl("", Validators.required);
}
