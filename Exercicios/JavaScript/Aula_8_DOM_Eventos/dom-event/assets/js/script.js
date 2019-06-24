let btnCumprimentar = document.getElementById("btnCumprimentar");
btnCumprimentar.onclick = function() {
    alert("olá");
} // 2

let btnAlterarFundo = document.getElementById("btnAlterarFundo");
btnAlterarFundo.onclick = function() {
    document.body.style.background = "green";
} // 3

let imgXadrez = document.getElementById("imgXadrez");
imgXadrez.onmouseover = function(event) { // 9
    console.log(event.clientX); // 9
    console.log(event.clientY); // 9
    console.log("estou vendo a imagem");
} // 4

let imgKasparov = document.getElementById("imgKasparov");
imgKasparov.addEventListener("click", function() {
    console.log("estou clicando na imagem");
}); // 5

function alterarFundo() {
    this.style.background = "red";
}
document.body.addEventListener("click", alterarFundo); // 6
document.body.removeEventListener("click", alterarFundo); // 7

let formulario = document.querySelector("form");
formulario.addEventListener("click", function(event) {
    event.preventDefault();
    alert("não é possível enviar");
}); // 8

// Timers

setTimeout(function() {
    alert('tempo esgotado!');
}, 10000); // 1

setInterval(function() {
    alert('hora do intervalo');
}, 5000); // 2




















































/*
let btnCumprimentar = document.querySelector("#btnCumprimentar");
btnCumprimentar.addEventListener("click", function() {
    alert("olá");
}); // 2

let btnAlterarFundo = document.querySelector("#btnAlterarFundo");
btnAlterarFundo.addEventListener("click", function() {
    let corpo = document.querySelector("body");
    corpo.style.backgroundColor = "red";
}); // 3

let imgXadrez = document.querySelector("#imgXadrez");
imgXadrez.addEventListener("mouseover", function(event) {
    console.log(event.clientX); // 9
    console.log(event.clientY); // 9
    console.log("estou vendo a imagem");
}); // 4

let imgKasparov = document.querySelector("#imgKasparov");
imgKasparov.addEventListener("click", function() {
    console.log("estou clicando na imagem");
}); // 5

let corpo = document.querySelector("body");
corpo.addEventListener("click", function() {
    this.style.backgroundColor = "red";
}); // 6

// TODO
/*
let novoCorpo = document.querySelector("body");
novoCorpo.removeEventListener("click", function() {
    // this.style.backgroundColor = none;
}); // 7

let formulario = document.querySelector("form");
formulario.addEventListener("click", function(event) {
    event.preventDefault();
}); // 8

// 9 - Resposta no 4

// Timers

setTimeout(function() {
    alert("tempo esgotado!");
}, 10000); // 1

setInterval(function() {
    alert("hora do intervalo");
}, 5000); // 2

/*
let corpo = document.querySelector("body");

corpo.addEventListener("keypress", function(event) {
    let tecla = event.keyCode;
    if (tecla == 13) {
        alert("Você clicou Enter!");
    }
});

let btnHello = document.getElementById("btnHello");

btnHello.addEventListener("click", function(event) {
    console.log(event);
});

btnHello.addEventListener("click", function(event) {
    console.log(event.clientX);
    console.log(event.clientY);
});

// elemento = document.querySelector("#btnHello")
document.querySelector("#btnHello").addEventListener("click", function() {
    console.log(this);
});

let btnHello = document.getElementById("btnHello");

btnHello.onclick = function() {
    alert("Hello!");
}

function clicar() {
    alert("Ai! Você clicou em mim!");
}

btnHello.addEventListener("click", clicar);
*/