// function produto(a, b) {
//     return a * b;
// }
//     console.log(produto(10, 2));

// let nomeFuncao = function() {
//     console.log("Ola");
// }

// nomeFuncao();

// function a(callback) {
//     setTimeout(function() {
//         console.log("a vem primeiro");
//         callback();
//     }, 3000);
// }

// function b() {
//     console.log("b vem depois");
// }

// a(b);

// var numeros = [1, 2, ,3 ,4 ,5];
// numeros.forEach(function(value, index) {
//     console.log("No index: " + index + " tem o value: " + value);
// });

var array = [1, 2, 3];

let numeros = array.map(function(numero) {
    return numero * 2;
)}

console.log(numeros);
