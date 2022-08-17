import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Person } from '../Person';
import { PersonApiService } from '../person-api.service';
import { PersonDataService } from '../person-data.service';

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent  {

  constructor(private _personApiService:PersonApiService, private _router:Router) { }




  addPerson(person:Person){
    this._personApiService.addPerson(person).subscribe(
      data=>{
        console.log(data)
        this._router.navigate(['/view-person'])
      }
    )
  }
  

}
