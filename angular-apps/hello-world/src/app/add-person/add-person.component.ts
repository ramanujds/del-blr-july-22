import { Component, OnInit } from '@angular/core';
import { Person } from '../Person';

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent implements OnInit {

  constructor() { }

  personList:Array<Person>=[
    {
      personName:'Kumar',
      joinDate:new Date('2020-10-10'),
      salary:45000.0,
      email:'kumar@yahoo.com'
    },
    {
      personName:'Rohit',
      joinDate:new Date('2020-10-10'),
      salary:45000.0,
      email:'rohit@yahoo.com'
    },
    {
      personName:'Suraj',
      joinDate:new Date('2020-10-10'),
      salary:45000.0,
      email:'suraj@yahoo.com'
    }

  ];

  ngOnInit(): void {
  }

  addPerson(person:Person){
    this.personList.push(person)
  }

  deletePerson(personName:any){
    if(confirm("Sure to delete?")){
      // let index = this.personList.findIndex(p=>p.personName==personName);
      let index=-1;
      for(let person of this.personList){
        index++;
        if(person.personName==personName){
          break;
        }
      }
      this.personList.splice(index,1)
    }
  }

}
