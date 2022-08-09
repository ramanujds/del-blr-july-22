import { Person, Employee } from "../Person";


interface Student{
    studentId:number;
    studentName:string;
    phone:number;
    showStudent():void;
}

let s1:Student = {
    studentId:101,
    studentName:'Gaurav',
    phone:667788995544,
    showStudent() {
        console.log(this)
    }
}
s1.showStudent();


// class MyStudent implements Student{
//     studentId: number;
//     studentName:string;
//     phone:number;

//     showStudent():void{
//         console.log(this)
//     }
// }

let p:Person = new Employee();