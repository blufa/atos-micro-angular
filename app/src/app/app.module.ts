import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ToastrModule } from 'ngx-toastr';

import { AppRoutingModule } from './app-routing.module';
<<<<<<< HEAD
import { LandingPageComponent } from './components/landing-page/landing-page.component';
=======
import { AppComponent } from './app.component';
import { BuilderModule } from './builder/builder.module';
import { DashboardRoutingModule } from './dashboard/dashboard-routing.module';
import { LandingPageComponent } from './landing-page/landing-page.component';
>>>>>>> refs/remotes/origin/develop
import { SharedModule } from './shared/shared.module';
import { AppComponent } from './components/app/app.component';
import { HearderComponent } from './components/hearder/hearder.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingPageComponent,
<<<<<<< HEAD
    HearderComponent
=======
>>>>>>> refs/remotes/origin/develop
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ToastrModule.forRoot(),
    SharedModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
