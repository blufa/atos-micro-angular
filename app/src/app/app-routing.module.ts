import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LandingPageComponent } from './components/landing-page/landing-page.component';
import { IsAuthGuard } from './shared/guards/is-auth.guard';
import { AuthGuard } from './shared/guards/auth.guard';

const routes: Routes = [
  { path: "", component: LandingPageComponent },
  { 
    path: "auth",
    loadChildren: () => import("./auth/auth.module").then(m => m.AuthModule),
    canActivate: [IsAuthGuard]
  },
  { 
    path: "dashboard",
    loadChildren: () => import("./dashboard/dashboard.module").then(m => m.DashboardModule),
    //canActivate: [AuthGuard]
  },
  { 
    path: "builder",
    loadChildren: () => import("./builder/builder.module").then(m => m.BuilderModule),
    canActivate: [AuthGuard]
  },
  { path: "view", loadChildren: () => import("./view/view.module").then(m => m.ViewModule) },
  { path: '**', redirectTo: '/view', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
