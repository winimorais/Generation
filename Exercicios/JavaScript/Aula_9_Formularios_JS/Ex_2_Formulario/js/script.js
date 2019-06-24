// // Exercicio 1 a 

// let formulario = document.querySelector("form");

// formulario.onsubmit = function () {
//     if (formulario.name.value=="") {
//         alert("Digite um nome válido");
//         return false;
//     } // 1 if
//     if (formulario.email.value=="") {
//         alert("Digite um email válido")
//         return false;
//     }//2 if
//     if (formulario.message.value=="") {
//         alert("Digite uma mensagem válida")
//         return false;
//     }//3 if
// }//funcao

// // Exercicio 1 b

// formulario.onsubmit = function () {
//     if (formulario.password.value=="") {
//         alert("Digite uma senha");
//         return false;
//     } 
//     if (formulario.cpassword.value=="") {
//         alert("Confirme sua senha");
//         return false;
//     }
//     if (formulario.cpassword.value!==formulario.password.value) {
//         alert("Senhas diferentes")
//         return false;
//     }
// }

// function getFormvalue(formulario) {
//     let nomeCompleto = formulario.nome.value + " " + formulario.sobrenome.value
// }

// let ocultar = document.getElementById("ocultar");

// ocultar.onclick = function() {
//     alert("Conteúdo ficou oculto");

//     let formulario = document.querySelector("form");
//     formulario.innerHTML = "Funcionou!!";
// }

// let ocultar = document.getElementById("ocultar");
// ocultar.onclick = function() {
//     let formulario = document.querySelector("form");
//     let lista = "<ul>";

//     for (i = 0; i < formulario.elements.length; i++) {
//         lista += "<li>Nome: " + formulario.elements[i].name +
//         " - valor: " + formulario.elements[i].value + "</li>";
//     }

//     lista += "</ul>";

//     formulario.innerHTML = lista;
// }

let cor = document.querySelector("body");
let genero = document.querySelector(".genero")

genero.onclick = function () {
    if (genero.value=="male") {
        cor.style.background="blue";
    }
    if (genero.value=="female") {
        cor.style.background="red";
    }
    if (genero.value=="other") {
        cor.style.background="yellow"; 
    }
}


