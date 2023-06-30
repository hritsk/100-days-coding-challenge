let array = [10, 5, 20, 15, 25, 15, 30, 30, 10];


let birthdaycandel = array[0]; 
let count = 1; 

for (let i = 1; i < array.length; i++) {
    if (array[i] > birthdaycandel) {
        birthdaycandel = array[i];
        count = 1; 
    } else if (array[i] === birthdaycandel) {
        count++; 
    }
}

console.log("Birthday Candels height:", birthdaycandel);
console.log("Count:", count);