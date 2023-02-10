import { AfterViewInit, Component, OnInit, ViewChild, ElementRef } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit, AfterViewInit {

  @ViewChild('createcv') createcv: ElementRef;
  divheight: number;
  style: {};
  ngAfterViewInit() {
    this.divheight = this.createcv.nativeElement.offsetHeight;
    this.style = { 'max-height': this.divheight + 'px', 'height': this.divheight + 'px', 'min-height': this.divheight + 'px' };
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

}
