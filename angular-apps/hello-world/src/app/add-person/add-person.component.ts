import { Component, OnInit } from '@angular/core';
import { Person } from '../Person';

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  addPerson(person:any){
    console.log(person)
  }

}
