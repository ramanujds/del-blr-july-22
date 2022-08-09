// // let fun = ()=> {

// //     const x = 10;
// //     if(x>5){
// //         let y=20;
// //     }
// //     x=30;
// //     console.log(x);
// //     console.log(y);

// // }

// // fun();

// let date = new Date();

// // setInterval(()=>{
// //     date=new Date();
// //     console.log(date);
// // },5000);

// let items = new Array();

// items.push(10,20,30,40,50);

// items.filter(item=>item%20==0)
//         .map(item=>item*item)
//         .forEach(item=>console.log(item))


// // let add = function(a,b){
// //     return a+b;
// // }

// let add = (a,b) => { 
//         let s = a+b;
//         return s;
// };

// let sum = add(5,10);

// console.log(sum)

// let printer = x =>{
//         while(x>0){
//                 console.log('Hello World');
//                 x--;
//         }
// }

// printer(5);


// average = function(...nums){
//         let sum = 0;
//         for(let n of nums){
//                 sum+=n;
//         }
//         return sum/nums.length;
// }

// avg = average(20,30,50,60,10,70);

// console.log(avg)



// let arr = [10,20,30,40,60,70]
// let [p,q,...r] = arr;

// console.log(r)

let fun = function(a,b=0){
        return a+b;
}

let sum = fun(10,30);

console.log(sum)

let username = 'tushar';

username = 10;