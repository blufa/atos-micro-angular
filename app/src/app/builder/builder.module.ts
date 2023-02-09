import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BuilderRoutingModule } from './builder-routing.module';
import { PersonalInformationFormComponent } from './components/personal-information-form/personal-information-form.component';
import { EducationFormComponent } from './components/education-form/education-form.component';
import { LeisuresFormComponent } from './components/leisures-form/leisures-form.component';
import { CertificationsFormComponent } from './components/certifications-form/certifications-form.component';
import { SkillsFormComponent } from './components/skills-form/skills-form.component';
import { ReferencesFormComponent } from './components/references-form/references-form.component';
import { LanguagesFormComponent } from './components/languages-form/languages-form.component';
import { ExperiencesFormComponent } from './components/experiences-form/experiences-form.component';
import { AwardsHonorsFormComponent } from './components/awards-honors-form/awards-honors-form.component';
import { SharedModule } from '../shared/shared.module';
import { BuilderFormComponent } from './components/builder-form/builder-form.component';


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
    BuilderFormComponent
  ],
  imports: [
    CommonModule,
    BuilderRoutingModule,
    SharedModule
  ]
})
export class BuilderModule { }
