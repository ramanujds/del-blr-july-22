import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {

  constructor() { }

  list:Array<string>=[];

  ngOnInit(): void {
  }

  addItems(username:string){
    this.list.push(username);
    console.log(this.list)
  }

  deleteItem(){
    this.list.pop();
  }

}
