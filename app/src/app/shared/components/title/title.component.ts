import { Component, Input } from '@angular/core';

@Component({
  selector: 'titleComponent',
  templateUrl: './title.component.html',
  styleUrls: ['./title.component.scss']
})
export class TitleComponent {
 @Input() title: string
}
