import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { NotificationService } from '../../../shared/services/notification.service';
import { Router } from '@angular/router';
import { Button } from '../../../shared/interfaces/button';
import { AuthService } from '../../../shared/services/auth.service';

@Component({
  selector: 'app-sing-in',
  templateUrl: './sing-in.component.html',
  styleUrls: ['./sing-in.component.scss']
})
export class SingInComponent {
  emailPattern: string = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
  showPassword: boolean = false;
  singInForm: FormGroup;
  button: Button

  constructor(
    private fb: FormBuilder,
    private notify: NotificationService,
    private route: Router,
    private authService: AuthService,
    ) { }

    ngOnInit(): void {
      this.singInForm = this.fb.group({
        email: ['', [Validators.email, Validators.required, Validators.pattern(this.emailPattern)]],
        password: ['', [Validators.required, Validators.minLength(8), Validators.maxLength(50)]]
      });
      this.button = {
        func: ()=> this.onSubmit(),
        icon:'',
        params: [],
        showIcon: false,
        showTitle: true,
        title: "Se connecter",
        type: 'submit',
        class: `bg-blue-500 rounded-[5px] px-4 py-2 text-white font-medium shadow-xl`,
      }
    }

    get email() { return this.singInForm.get('email') as FormControl; }
    get password() { return this.singInForm.get('password') as FormControl; }

  
    onShowPassword = () =>{
      this.showPassword = !this.showPassword
    }
    onSubmit = () => {
      if(this.singInForm.valid){
        this.authService.login(this.singInForm.getRawValue())
                        .subscribe(
                          {
                            next: ()=> this.route.navigate(['/dashboard']),
                          }
                        )

      }
    }

}
