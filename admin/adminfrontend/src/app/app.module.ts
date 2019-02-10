import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormDashboardComponent } from './form-dashboard/form-dashboard.component';
import { NewFormFormatComponent } from './new-form-format/new-form-format.component';

@NgModule({
  declarations: [
    AppComponent,
    FormDashboardComponent,
    NewFormFormatComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
