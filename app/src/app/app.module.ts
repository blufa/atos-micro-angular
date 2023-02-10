import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ToastrModule } from 'ngx-toastr';

import { AppRoutingModule } from './app-routing.module';
<<<<<<< HEAD
import { AppComponent } from './app.component';
import { BuilderModule } from './builder/builder.module';
import { DashboardRoutingModule } from './dashboard/dashboard-routing.module';
import { LandingPageComponent } from './landing-page/landing-page.component';
=======
import { LandingPageComponent } from './components/landing-page/landing-page.component';
>>>>>>> 34bc652 (commit du 10-02-2023)
import { SharedModule } from './shared/shared.module';
import { AppComponent } from './components/app/app.component';
import { HearderComponent } from './components/hearder/hearder.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingPageComponent,
<<<<<<< HEAD
=======
    HearderComponent
>>>>>>> 34bc652 (commit du 10-02-2023)
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ToastrModule.forRoot(),
    BuilderModule,
    DashboardRoutingModule,
    SharedModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
