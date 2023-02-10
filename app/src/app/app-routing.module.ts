import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
<<<<<<< HEAD
import { LandingPageComponent } from './landing-page/landing-page.component';
=======
import { LandingPageComponent } from './components/landing-page/landing-page.component';
>>>>>>> 34bc652 (commit du 10-02-2023)

const routes: Routes = [
  { path: "", component: LandingPageComponent },
  { path: "auth", loadChildren: () => import("./auth/auth.module").then(m => m.AuthModule) },
  { path: "dashboard", loadChildren: () => import("./dashboard/dashboard.module").then(m => m.DashboardModule) },
  { path: "builder", loadChildren: () => import("./builder/builder.module").then(m => m.BuilderModule) },
  { path: "view", loadChildren: () => import("./view/view.module").then(m => m.ViewModule) },
  { path: '**', redirectTo: '/view', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
