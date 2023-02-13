import { Component } from '@angular/core';
import { Resume } from '../../shared/interfaces/resume';

@Component({
  selector: 'app-resume-view',
  templateUrl: './resume-view.component.html',
  styleUrls: ['./resume-view.component.scss']
})
export class ResumeViewComponent {
  resume: Resume = {
    user: {
      firstName: 'John',
      lastName: 'Doe',
      email: 'envkt@example.com',
      address: '123 Main Street',
      occupation: 'Full stack developer',
      phoneNumber: '123 00 99 87',
      dob: '00-00-000',
      photo:'../../../../assets/images/profile.png'
    },
    skills: [],
    awardshonors: [],
    educations: [],
    languages: [],
    leisure: [],
    experiences: []
  };
}
