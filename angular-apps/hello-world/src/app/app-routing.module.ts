import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPersonComponent } from './add-person/add-person.component';
import { ViewPersonComponent } from './view-person/view-person.component';

const routes: Routes = [
  {
    path:'add-person',component:AddPersonComponent
  },
  {
    path:'view-person',component:ViewPersonComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
