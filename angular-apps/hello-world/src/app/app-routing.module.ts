import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPersonComponent } from './add-person/add-person.component';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { ViewPersonComponent } from './view-person/view-person.component';

const routes: Routes = [
  {
    path:'add-person',component:AddPersonComponent
  },
  {
    path:'view-person',component:ViewPersonComponent
  },
  {
    path:'view-person/:id',component:ViewDetailsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
