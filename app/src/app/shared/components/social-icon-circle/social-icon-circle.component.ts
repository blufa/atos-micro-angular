import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'socialIconCircleComponent',
  templateUrl: './social-icon-circle.component.html',
  styleUrls: ['./social-icon-circle.component.scss']
})
export class SocialIconCircleComponent implements OnInit {
 
  @Input() icon: string;
  @Input() classes: string

  ngOnInit(): void {
  }


}
