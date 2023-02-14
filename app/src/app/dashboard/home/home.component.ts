import { AfterViewInit, Component, OnInit, ViewChild, ElementRef } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {

  @ViewChild('createcv') createcv: ElementRef;
  divheight: number;
  style: {};

  // ngAfterViewInit() {
  //   this.divheight = this.createcv.nativeElement.offsetHeight;

  //   if (this.divheight > 0) {
  //     this.style = { 'max-height': this.divheight + 'px', };
  //   } else {
  //     this.style = { 'height': '600px!important', };
  //   }
  // }

}
