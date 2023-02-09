import { Component, Input, OnInit } from '@angular/core';
import { Button } from '../../interfaces/button';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.scss']
})
export class ButtonComponent implements OnInit {
  @Input() btn: Button;
  @Input() disabled: boolean;

  ngOnInit(): void {
    if(!this.disabled){ this.disabled = false;}
  }

  callBack = (func: Function, params: Array<string>) => { func(...params.map(param=>param))}

}
