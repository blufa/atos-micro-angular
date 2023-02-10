import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BuilderRoutingModule } from './builder-routing.module';
import { PersonalInformationFormComponent } from './personal-information-form/personal-information-form.component';
import { EducationFormComponent } from './education-form/education-form.component';
import { LeisuresFormComponent } from './leisures-form/leisures-form.component';
import { CertificationsFormComponent } from './certifications-form/certifications-form.component';
import { SkillsFormComponent } from './skills-form/skills-form.component';
import { ReferencesFormComponent } from './references-form/references-form.component';
import { LanguagesFormComponent } from './languages-form/languages-form.component';
import { ExperiencesFormComponent } from './experiences-form/experiences-form.component';
import { AwardsHonorsFormComponent } from './awards-honors-form/awards-honors-form.component';
import { LandingPageComponent } from './landing-page/landing-page.component';


@NgModule({
  declarations: [
    PersonalInformationFormComponent,
    EducationFormComponent,
    LeisuresFormComponent,
    CertificationsFormComponent,
    SkillsFormComponent,
    ReferencesFormComponent,
    LanguagesFormComponent,
    ExperiencesFormComponent,
    AwardsHonorsFormComponent, 
    LandingPageComponent
  ],
  imports: [
    CommonModule,
    BuilderRoutingModule
  ],
  exports:[LandingPageComponent]
})
export class BuilderModule { }
