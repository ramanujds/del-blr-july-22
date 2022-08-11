import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GreetComponent } from './greet/greet.component';
import { FooterComponent } from './footer/footer.component';
import { AddPersonComponent } from './add-person/add-person.component';
import { ShortenPipe } from './shorten.pipe';
import { ViewPersonComponent } from './view-person/view-person.component';

@NgModule({
  declarations: [
    AppComponent,
    GreetComponent,
    FooterComponent,
    AddPersonComponent,
    ShortenPipe,
    ViewPersonComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
