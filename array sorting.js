// Perform sorting of an array in descending order.

const numbers = [5,7,2,6,4,1,9,3,4];

numbers.sort(function(a,b){
    return b-a;
});
console.log(numbers);
