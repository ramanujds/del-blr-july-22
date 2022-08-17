import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Person } from './Person';

@Injectable({
  providedIn: 'root'
})
export class PersonApiService {

  constructor(private _personHttpClient:HttpClient) { }

  PERSON_API_URL="http://localhost:3000/persons";

  getAllPerson():Observable<Array<Person>>{
    return this._personHttpClient.get<Array<Person>>(this.PERSON_API_URL);
  }

  getPersonById(id:number):Observable<Person>{
    return this._personHttpClient.get<Person>(this.PERSON_API_URL+"/"+id);
  }

  addPerson(person:Person):Observable<Person>{
    return this._personHttpClient.post<Person>(this.PERSON_API_URL,person)
  }

}
