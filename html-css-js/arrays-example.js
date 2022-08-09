var arr = [10,20,30];
arr.push(50)
arr.push(100)

arr.splice(2,1);

// for(var i=0;i<arr.length;i++){
//     console.log(arr[i])
// }

// for(var item of arr){
//     console.log(item)
// }

arr.forEach(item => console.log(item))

