import { Component, OnInit } from '@angular/core';
import { PersonDataService } from '../person-data.service';

@Component({
  selector: 'app-view-person',
  templateUrl: './view-person.component.html',
  styleUrls: ['./view-person.component.css']
})
export class ViewPersonComponent implements OnInit {

  constructor(public dataService:PersonDataService) { }

  ngOnInit(): void {
  }


  deletePerson(personName:any){
    if(confirm("Sure to delete?")){
      this.dataService.deletePerson(personName)
    }
  }

}
