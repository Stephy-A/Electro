function comprobarClave(){
    let pasw =document.formUsuario.pasw.value
    let pasw2 = document.formUsuario.pasw2.value
    
    if (pasw != pasw2){
        alert("La contraseña no coincide")
    }
}