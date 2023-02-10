import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BuilderRoutingModule } from './builder-routing.module';
import { SharedModule } from '../shared/shared.module';
import { BuilderFormComponent } from './components/builder-form/builder-form.component';
import { CandidateFormComponent } from './components/candidate-form/candidate-form.component';
import { EducationFormComponent } from './components/education-form/education-form.component';
import { LeisuresFormComponent } from './components/leisures-form/leisures-form.component';
import { CertificationsFormComponent } from './components/certifications-form/certifications-form.component';
import { SkillsFormComponent } from './components/skills-form/skills-form.component';
import { ReferencesFormComponent } from './components/references-form/references-form.component';
import { LanguagesFormComponent } from './components/languages-form/languages-form.component';
import { ExperiencesFormComponent } from './components/experiences-form/experiences-form.component';
import { AwardsHonorsFormComponent } from './components/awards-honors-form/awards-honors-form.component';
import { WorkExperiencesFormComponent } from './components/work-experiences-form/work-experiences-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    BuilderFormComponent,
    CandidateFormComponent,
    EducationFormComponent,
    LeisuresFormComponent,
    CertificationsFormComponent,
    SkillsFormComponent,
    ReferencesFormComponent,
    LanguagesFormComponent,
    ExperiencesFormComponent,
    AwardsHonorsFormComponent,
    WorkExperiencesFormComponent,
  ],
  imports: [
    CommonModule,
    BuilderRoutingModule,
    SharedModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class BuilderModule { }
