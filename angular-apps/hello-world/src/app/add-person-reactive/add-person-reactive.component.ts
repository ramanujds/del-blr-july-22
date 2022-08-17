import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { validateJoinDate } from '../date-check-validator';

@Component({
  selector: 'app-add-person-reactive',
  templateUrl: './add-person-reactive.component.html',
  styleUrls: ['./add-person-reactive.component.css']
})
export class AddPersonReactiveComponent implements OnInit {

  constructor(private fBuilder:FormBuilder) { }

  // personForm:FormGroup = new FormGroup(
  //   {
  //     personName:new FormControl(''),
  //     email:new FormControl(''),
  //     salary:new FormControl(''),
  //     joinDate:new FormControl('')
  //   }
  // )

  personForm:any;

  ngOnInit(): void {
    this.personForm=this.fBuilder.group({
      personName:['',[Validators.required,Validators.minLength(3),Validators.pattern('[A-Za-z\\s]+')]],
      email:[''],
      salary:[''],
      joinDate:['',[validateJoinDate]],
      addressForm:this.fBuilder.group({
        area:[''],
        city:[''],
        pincode:['']
      })
    })
  }

}
