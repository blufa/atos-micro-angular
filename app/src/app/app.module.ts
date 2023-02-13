import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ToastrModule } from 'ngx-toastr';

import { AppRoutingModule } from './app-routing.module';
import { LandingPageComponent } from './components/landing-page/landing-page.component';
import { SharedModule } from './shared/shared.module';
import { AppComponent } from './components/app/app.component';
import { HearderComponent } from './components/hearder/hearder.component';

@NgModule({
  declarations: [
    AppComponent,
    LandingPageComponent,
    HearderComponent
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
