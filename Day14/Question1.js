var operator = "divide";
var a = 2, b=4;
switch(operator){
    case'sum':
      console.log("the sum of a and b is:"+a+b);
    break;    
    case'difference':
      console.log("the differnce  of a and b is:"+a-b); 
    break;   
    case'multiply':
      console.log("the multiplication of a and b is:"+(a*b)); 
    break;   
    case'divide':
      console.log("the division of a and b is:"+(a/b)); 
    break;   
    default:
        console.log("Please enter valid data");  
}
