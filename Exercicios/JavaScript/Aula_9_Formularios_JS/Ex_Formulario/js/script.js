// Exercicio 1 a 

let formulario = document.querySelector("form");

formulario.onsubmit = function () {
    if (formulario.name.value=="") {
        alert("Digite um nome válido");
        return false;
    } // 1 if
    if (formulario.email.value=="") {
        alert("Digite um email válido")
        return false;
    }//2 if
    if (formulario.message.value=="") {
        alert("Digite uma mensagem válida")
        return false;
    }//3 if
}//funcao

// Exercicio 1 b

formulario.onsubmit = function () {
    if (formulario.password.value=="") {
        alert("Digite uma senha");
        return false;
    } 
    if (formulario.cpassword.value=="") {
        alert("Confirme sua senha");
        return false;
    }
    if (formulario.cpassword.value!==formulario.password.value) {
        alert("Senhas diferentes")
        return false;
    }
}
