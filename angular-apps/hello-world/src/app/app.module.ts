import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GreetComponent } from './greet/greet.component';
import { FooterComponent } from './footer/footer.component';
import { AddPersonComponent } from './add-person/add-person.component';
import { ShortenPipe } from './shorten.pipe';
import { ViewPersonComponent } from './view-person/view-person.component';
import { GitUserComponent } from './git-user/git-user.component';
import { AppStyleDirective } from './app-style.directive';
import { UpdatePersonComponent } from './update-person/update-person.component';
import { AddPersonReactiveComponent } from './add-person-reactive/add-person-reactive.component';
import { HeaderComponent } from './header/header.component';
import { ViewDetailsComponent } from './view-details/view-details.component';

@NgModule({
  declarations: [
    AppComponent,
    GreetComponent,
    FooterComponent,
    AddPersonComponent,
    ShortenPipe,
    ViewPersonComponent,
    GitUserComponent,
    AppStyleDirective,
    UpdatePersonComponent,
    AddPersonReactiveComponent,
    HeaderComponent,
    ViewDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
