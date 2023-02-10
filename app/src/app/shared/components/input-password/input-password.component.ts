import { Component, Input } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-input-password',
  templateUrl: './input-password.component.html',
  styleUrls: ['./input-password.component.scss']
})
export class InputPasswordComponent {
  showPassword: boolean = false;
  @Input() label: string = '';
  @Input() name: string = '';
  @Input() class: string = '';
  @Input() placeholder: string = '';
  @Input() readonly: boolean =  false
    @Input() control: FormControl = new FormControl();
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
