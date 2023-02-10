import { AfterViewInit, Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';
import { User } from '../../interfaces/user';
import { Resume } from '../../interfaces/resume';
import { Experience } from '../../interfaces/experience';

@Component({
  selector: 'resumeComponent',
  templateUrl: './resume.component.html',
  styleUrls: ['./resume.component.scss']
})
export class ResumeComponent implements OnInit, AfterViewInit {
  @ViewChild('cont') elementView: ElementRef;
  contentHeight: number;
  style: {};
 
  @Input() resume: Resume;
  experience: Experience = {
    compagny: 'Le comapagny',
    accomplishment: ['acomplishment 1', 'acomplishment 2', 'acomplishment 3', 'acomplishment 4'],
    environment: ['environment 1', 'environment 2', 'environment 3'],
    projectDescription: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Enim hic quibusdam ab.",
    startDate: '02-2019',
    endDate: '12-2022'
  }
  
  constructor(){}

  ngOnInit(): void {
  }
  ngAfterViewInit() {
    this.contentHeight = this.elementView.nativeElement.offsetHeight;
    this.style = {'min-height':this.contentHeight+'px'};
}
}
