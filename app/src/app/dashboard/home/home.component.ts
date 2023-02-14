import { AfterViewInit, Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { Resume } from 'src/app/shared/interfaces/resume';
import { DashboardService } from '../services/dashboard.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {

  resumes: Resume[] = [];

  @ViewChild('createcv') createcv: ElementRef;
  divheight: number;
  style: {};
 

  constructor(private dashboardService: DashboardService) {
    this.getResumes();
  }

  // ngAfterViewInit() {
  //   this.divheight = this.createcv.nativeElement.offsetHeight;

  //   if (this.divheight > 0) {
  //     this.style = { 'max-height': this.divheight + 'px', };
  //   } else {
  //     this.style = { 'height': '600px!important', };
  //   }
  // }
  
  getResumes() {
    this.dashboardService.getResumes().subscribe(
      (res) => {
        this.resumes =  res as Resume[];
      }
    )
  }

  deleteResumeByid(id: number) {
    this.dashboardService.deleteResumeByid(id).subscribe(
     ( res )=> {
      this.getResumes();
    })
  }

}
