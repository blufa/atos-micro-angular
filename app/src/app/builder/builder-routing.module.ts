import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuilderFormComponent } from './components/builder-form/builder-form.component';

const routes: Routes = [
  {
    path: "",
    component: BuilderFormComponent
  },
  {
    path: ":resumeId",
    component: BuilderFormComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BuilderRoutingModule { }
