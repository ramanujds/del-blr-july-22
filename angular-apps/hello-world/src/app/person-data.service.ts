import { Injectable } from '@angular/core';
import { Person } from './Person';

@Injectable({
  providedIn: 'root'
})
export class PersonDataService {

  personList:Array<Person>=[];

  constructor() { }

  addPerson(person:Person){
    this.personList.push(person)
  }

  deletePerson(personName:any){
    
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

