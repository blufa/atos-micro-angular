import { Component, Input } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'inputPasswordComponent',
  templateUrl: './input-password.component.html',
  styleUrls: ['./input-password.component.scss']
})
export class InputPasswordComponent {
  showPassword: boolean;
  @Input() label: string;
  @Input() name: string;
  @Input() class: string;
  @Input() placeholder: string;
  @Input() readonly: boolean
  @Input() control: FormControl
  constructor() { }

  ngOnInit(): void {
    this.showPassword = false;
    if(!this.placeholder){ this.placeholder = ''; }
    if(!this.readonly){ this.readonly = false }
    if(!this.class){ this.class = '' }
  }

  onShowPassword = () =>{
    this.showPassword = !this.showPassword
  }
}
