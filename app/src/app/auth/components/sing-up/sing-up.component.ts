import { Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Component } from '@angular/core';
import { Button } from '../../../shared/interfaces/button';
import { NotificationService } from '../../../shared/services/notification.service';

@Component({
  selector: 'app-sing-up',
  templateUrl: './sing-up.component.html',
  styleUrls: ['./sing-up.component.scss']
})
export class SingUpComponent {
  emailPattern: string = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
  showPassword: boolean = false;
  singUpForm: FormGroup;
  button: Button

  constructor(
    private fb: FormBuilder,
    private notify: NotificationService,
    private route: Router
    ) { }

    ngOnInit(): void {
      this.singUpForm = this.fb.group({
        firstName: ['', Validators.required],
        lastName: ['', Validators.required],
        email: ['', [Validators.email, Validators.required, Validators.pattern(this.emailPattern)]],
        password: ['', [Validators.required, Validators.minLength(8), Validators.maxLength(50)]]
      });
      this.button = {
        func: ()=> this.onSubmit(),
        icon:'',
        params: [],
        showIcon: false,
        showTitle: true,
        title: "S'inscrire",
        type: 'submit',
        class: `bg-blue-500 rounded-[5px] px-4 py-2 text-white font-medium shadow-xl`,
      }
    }

    get firstName() { return this.singUpForm.get('firstName') as FormControl; }
    get lastName() { return this.singUpForm.get('lastName') as FormControl; }
    get email() { return this.singUpForm.get('email') as FormControl; }
    get password() { return this.singUpForm.get('password') as FormControl; }

  
    onShowPassword = () =>{
      this.showPassword = !this.showPassword
    }

   
  
    onSubmit = () => {
      if(this.singUpForm.valid) {}
    }

}
