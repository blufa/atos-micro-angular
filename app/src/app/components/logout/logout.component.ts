import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/shared/services/auth.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.scss']
})
export class LogoutComponent implements OnInit {
  style: {};

  constructor(private authService: AuthService, private route: Router) { }

  ngOnInit(): void {
    this.authService.logout().subscribe({next: (res) => console.log(res)});
  }
}
