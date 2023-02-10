import { Component, Input } from '@angular/core';
import { Experience } from '../../interfaces/experience';

@Component({
  selector: 'experienceComponent',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.scss']
})
export class ExperienceComponent {
  @Input() experience: Experience;
  environments: Array<string> = [
    'Ubuntu', 'Nginx', 'Nodejs', 'Angular', 'Spring boot'
  ];
}
