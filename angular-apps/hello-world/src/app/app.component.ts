import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'hello-world',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'my-first-angular-app';

  count=100;
  personName:string='';

  date:Date = new Date();

  ngOnInit(){

    setInterval(()=>{
      this.date = new Date()
    },1000)

  }
  

  showMessage(){
    alert("Bye..")
  }

  printName(username:string){
    this.personName=username;
  }

}
