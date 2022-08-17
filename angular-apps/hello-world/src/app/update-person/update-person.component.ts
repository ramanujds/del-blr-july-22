import { Component, Input, OnInit } from '@angular/core';
import { Person } from '../Person';

@Component({
  selector: 'app-update-person',
  templateUrl: './update-person.component.html',
  styleUrls: ['./update-person.component.css']
})
export class UpdatePersonComponent implements OnInit {

@Input()
person?:Person;

  constructor() { }

  ngOnInit(): void {
  }

}
