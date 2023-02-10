import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { InputTextComponent } from './components/input-text/input-text.component';
import { InputPasswordComponent } from './components/input-password/input-password.component';
import { ButtonComponent } from './components/button/button.component';
import { CvCardComponent } from './components/cv-card/cv-card.component';
import { LayoutComponent } from './components/layout/layout.component';
import { FooterComponent } from './components/footer/footer.component';
import { HeaderComponent } from './components/header/header.component';

const sharedComponents = [
    InputTextComponent,
    InputPasswordComponent,
    ButtonComponent,
    CvCardComponent,
    LayoutComponent,
    FooterComponent,
    HeaderComponent
]

@NgModule({
  declarations: [
    sharedComponents
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
