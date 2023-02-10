import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { InputTextComponent } from './components/input-text/input-text.component';
import { InputPasswordComponent } from './components/input-password/input-password.component';
import { ButtonComponent } from './components/button/button.component';
import { LayoutComponent } from './components/layout/layout.component';
import { FooterComponent } from './components/footer/footer.component';
import { ResumeComponent } from './components/resume/resume.component';
import { ExperienceComponent } from './components/experience/experience.component';
import { LevelComponent } from './components/level/level.component';
import { TopbarComponent } from './components/topbar/topbar.component';
import { SocialIconCircleComponent } from './components/social-icon-circle/social-icon-circle.component';

const sharedComponents = [
    InputTextComponent,
    InputPasswordComponent,
    ButtonComponent,
    LayoutComponent,
    ResumeComponent,
    ExperienceComponent,
    SocialIconCircleComponent
]

@NgModule({
  declarations: [
    FooterComponent,
    sharedComponents,
    LevelComponent,
    TopbarComponent,
  ],
  imports: [
    CommonModule,
    RouterModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
  ],
  exports: [
    sharedComponents,
    ReactiveFormsModule,
    FormsModule,
  ]
})
export class SharedModule { }
