import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ViewRoutingModule } from './view-routing.module';
import { ResumeViewComponent } from './resume-view/resume-view.component';
import { SharedModule } from '../shared/shared.module';


@NgModule({
  declarations: [
    ResumeViewComponent
  ],
  imports: [
    CommonModule,
    ViewRoutingModule,
    SharedModule
  ]
})
export class ViewModule { }
