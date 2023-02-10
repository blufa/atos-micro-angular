import { Component, OnInit } from '@angular/core';
import { Link } from '../../interfaces/link';

@Component({
  selector: 'topbarComponent',
  templateUrl: './topbar.component.html',
  styleUrls: ['./topbar.component.scss']
})
export class TopbarComponent implements OnInit {
  links: Array<Link>;
  authLinks: Array<Link>;
  isAuth: boolean;
  constructor() {}

  ngOnInit(): void {
    this.isAuth = false;
    this.links = [
      {
        label: 'Acceuil',
        url: '',
        icon: 'bx bx-home-alt text-xl',
        visible: true,
      },
      {
        label: 'Mes Cvs',
        url: '',
        icon: 'bx bx-id-card text-xl',
        visible: true,
      },
    ]
    this.authLinks = [

      {
        label: 'Se connecter',
        url: 'auth/sing-in',
        icon: 'bx bx-log-in-circle text-xl',
        visible: true,
      },
      {
        label: 'S\'inscrire',
        url: 'auth/sing-up',
        icon: 'bx bx-user-plus text-xl',
        visible: true,
      },
      {
        label: 'Se déconnecter',
        url: '',
        icon: 'bx bx-log-out-circle text-xl',
        visible: false,
      },
    ]
  }
}
