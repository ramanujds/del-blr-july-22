import { Component, OnInit } from '@angular/core';
import { Person } from './Person';

@Component({
  selector: 'hello-world',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'my-first-angular-app';

  count=100;
  personName:string='';
  person?:Person;

  date:Date = new Date();

  ngOnInit(){

    // setInterval(()=>{
    //   this.date = new Date()
    // },1000)

  }
  

  showMessage(){
    alert("Bye..")
    let value = (<HTMLInputElement>(document.getElementById('id'))).value;
  }

  printName(username:string){
    this.personName=username;
  }

  printPerson(personName:string,age:any,email:string){
    this.person=new Person(personName,email,age);
    console.log(this.person)
  }

}
