import { Component, OnInit } from '@angular/core';
import { Person } from '../Person';
import { PersonDataService } from '../person-data.service';

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent implements OnInit {

  constructor(private personService:PersonDataService) { }



  ngOnInit(): void {
  }

  addPerson(person:Person){
    this.personService.addPerson(person)
  }

  

}
