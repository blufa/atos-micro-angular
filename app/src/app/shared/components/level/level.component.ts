import { Component, Input } from '@angular/core';

@Component({
  selector: 'levelComponent',
  templateUrl: './level.component.html',
  styleUrls: ['./level.component.scss']
})
export class LevelComponent {
  @Input() level: 'BEGINNER' | 'INTERMEDIATE' | 'ADVANCED'
}
