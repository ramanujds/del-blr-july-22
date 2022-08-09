// class MyStudent implements Student{
//     studentId: number;
//     studentName:string;
//     phone:number;
//     showStudent():void{
//         console.log(this)
//     }
// }
var s1 = {
    studentId: 101,
    studentName: 'Gaurav',
    phone: 667788995544,
    showStudent: function () {
        console.log(this);
    }
};
s1.showStudent();
