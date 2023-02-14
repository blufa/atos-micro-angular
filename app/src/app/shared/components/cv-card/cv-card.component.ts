import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'cvCardComponent',
  templateUrl: './cv-card.component.html',
  styleUrls: ['./cv-card.component.scss']
})
export class CvCardComponent {

  @Input() resume: any;
  @Output() delete: EventEmitter<number> = new EventEmitter();


  deleteResume() {
    this.delete.emit(this.resume.id);
  }

}
