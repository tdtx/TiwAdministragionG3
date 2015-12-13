function validarRegistrado(){	
    var contador = 0;
  //Validado el campo nick de registrado
    var nickRegistrado = document.getElementById("nickR").value;
    var nickRe = nickRegistrado.toString();
    if (nickRe == null || nickRe == "") {
        document.getElementById("nickR").style.borderColor="red";
    } else if (nickRe.match(/[^a-zñÑA-Z\d-]/gi)){
        document.getElementById("nickR").style.borderColor="red";
    } else {
        document.getElementById("nickR").style.borderColor="green";
        contador = contador + 1;
    }
    
    
    
//Validado el campo nombre de registrado
    var nombreRegistrado = document.getElementById("nombreR").value;
    var nombreRe = nombreRegistrado.toString();
    if (nombreRe == null || nombreRe == "") {
        document.getElementById("nombreR").style.borderColor="red";
    } else if (nombreRe.match(/[^a-zñÑA-Z\d-]/gi)){
        document.getElementById("nombreR").style.borderColor="red";
//        mensaje = mensaje.concat("El nombre del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombreR").style.borderColor="green";
        contador = contador + 1;
    }


    
    
//Validado el campo apellido 1 de registrado
    var apellido1Registrado = document.getElementById("apellido1R").value;
    var apellido1Re = apellido1Registrado.toString();
    if (apellido1Re == null || apellido1Re == "") {
        document.getElementById("apellido1R").style.borderColor="red";
    } else if (apellido1Re.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ]/gi)){
        document.getElementById("apellido1R").style.borderColor="red";
    } else {
        document.getElementById("apellido1R").style.borderColor="green";
        contador = contador + 1;
    }
    
    
    
    
//Validado el campo apellido 2 de registrado
    var apellido2Registrado = document.getElementById("apellido2R").value;
    var apellido2Re = apellido2Registrado.toString();
    if (apellido2Re.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ]/gi)){
        document.getElementById("apellido2R").style.borderColor="red";
    } else {
        document.getElementById("apellido2R").style.borderColor="green";
        contador = contador + 1;
    }
    
    
    
    
    
//Validado el campo correo de registrado
    var correoRegistrado = document.getElementById("correoR").value;
    var correoRe = correoRegistrado.toString();
    if (!correoRe.match(/\S+@\S+\.\S+/g)|| correoRe == null || correoRe == ""){
        document.getElementById("correoR").style.borderColor="red";
    } else {
        document.getElementById("correoR").style.borderColor="green";
        contador = contador + 1;
    }

   
    
alert("contadoooor   "+contador);
    if(contador == 5){
    } else{
      alert("maaal");
        return false;
    }
}