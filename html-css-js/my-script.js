// document.write("Hello Guys")
// console.log("Hey dude")

// var num = prompt("Enter a number : ")
// if(num%2 == 0){
//     alert("Even");
// }
// else{
//     alert("Odd");
// }

// var x = confirm("Do you like Javascript?");
// if(x){
//     document.write("Thank you")
// }
// else{
//     document.write("You should learn it.. You will love it")
// }

function greet(){
    var input = document.getElementById("username");
    var username = input.value;
    var msg = document.getElementById("message");
    msg.innerHTML="Hello " + username;
 }
 
 function changeText(){
     var btn1 = document.getElementById("btn1");
     var option = document.getElementById("operation").value;
     btn1.innerHTML=option;
 
 }
 
 function add(){
     var num1 = parseInt(document.getElementById("num1").value);
     var num2 = parseInt(document.getElementById("num2").value);
     var option = document.getElementById("operation").value;
 
     var result = 0;
 switch(option){
     case "add":
         result = num1+num2;
         break;
     case "subtract":
         result=num1-num2;
         break;
     case "multiply":
         result=num1*num2;
         break;
     case "divide":
         result=num1/num2;
         break;
     default:
         alert("Wrong operation selected!!")
         break;
 
 }
 
     document.getElementById("output").value=result;
 
 }
 