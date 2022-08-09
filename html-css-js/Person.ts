export abstract class Person{
    //  private personName:string;
    //  private age:number;
    //  private email:string;

    //  constructor(personName:string, age:number, email:string){
    //     this.personName=personName;
    //     this.age=age;
    //     this.email=email;
    //  }

    constructor(public personName:string='Karan', public age?:number,public email?:string){}

     public abstract showPersonInfo():void;
     
}
// let p1:Person = new Person();
// console.log(p1)



export class Employee extends Person{
    
    salary:number|undefined;
    constructor(personName:string='Karan',  age?:number, email?:string, salary?:number){
        super(personName,age,email);
        this.salary=salary;
    }

    public showPersonInfo(): void {
        console.log("Name : "+this.personName);
        console.log("Age : "+this.age);
        console.log("Email : "+this.email);
        console.log("Salary : "+this.salary)
    }
}

let p1:Person = new Employee('Javed',28,'javed@yahoo.com',65200.0);

p1.showPersonInfo();

