import { Component, Input, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'inputTextComponent',
  templateUrl: './input-text.component.html',
  styleUrls: ['./input-text.component.scss']
})
export class InputTextComponent implements OnInit {
  @Input() type: string = '';
  @Input() label: string = '';
  @Input() name: string = '';
  @Input() class: string = '';
  @Input() placeholder: string = '';
  @Input() readonly: boolean = false
  @Input() control: FormControl = new FormControl();

  ngOnInit(): void {
    if(!this.type){this.type = "text"}
    if(!this.placeholder){this.placeholder = ''}
    if(!this.readonly){this.readonly = false}
    if(!this.class){this.class = ''}
  }
}
