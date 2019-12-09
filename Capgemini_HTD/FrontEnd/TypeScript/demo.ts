//string
let myName : string = 'pournima'
// myName = 123 //error-we cannot change datatype 


//any
let company; //implicitly it wil be considered as 'any'
company =123;
company = 'capgemini'
company = true


//union
let age : string | number; //only string and number type data can accept
age : 'twenty five';
age : 25;


//tuple
let details : [string,number,number]
details = ['pournima',12312,123123]

//arrays
let mobile = ['dell','hp','samsung',12313,true] //accept any type of data in array coz we didnt specify the data type
let laptop : string[]  = ['dell','hp','acer','mac'] //accept only string type value in array
//let addr : string[] | number = ['ganesh','mumbradevi',133112] //accept only string and number type data in array


//function
function add (a : number,b:string):string {
    return a+b;
}