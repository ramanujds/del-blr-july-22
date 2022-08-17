import { Component, OnInit } from '@angular/core';
import { Person } from '../Person';
import { PersonApiService } from '../person-api.service';
import { PersonDataService } from '../person-data.service';

@Component({
  selector: 'app-view-person',
  templateUrl: './view-person.component.html',
  styleUrls: ['./view-person.component.css']
})
export class ViewPersonComponent implements OnInit {

  constructor( private _personApiService:PersonApiService) { }
  personList:Array<Person>=[];
  person?:Person;

  selectedPerson?:Person;

  ngOnInit(): void {
    this._personApiService.getAllPerson().subscribe(
      data => {
        this.personList=data
      }

    )
  }

  selectPerson(person:Person){
    this.selectedPerson=person
  }
  
  searchPerson(id:any){
    this._personApiService.getPersonById(id).subscribe(
      data => {
        this.person=data
        this.personList=[];
        this.personList.push(this.person)
        console.log(this.person)
      },
      err=>{
        this.person=undefined;
        alert("No person with ID : "+id+" Found")
      }
    )
  }

  deletePerson(personName:any){
    if(confirm("Sure to delete?")){
      //this.dataService.deletePerson(personName)
    }
  }

}
