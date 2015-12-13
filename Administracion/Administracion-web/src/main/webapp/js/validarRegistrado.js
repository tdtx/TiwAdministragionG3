function validarR(){
	alert("inicio comprobacion");
    var contador = 0;
//    var mensaje = "";
    //Validado el campo nick de registrado
    var nickRegistrado = document.getElementById("nickR").value;
    var nickR = nickRegistrado.toString();
    if (nickR == null || nickR == "") {
//        mensaje = mensaje.concat("El campo Nick debe rellenarse" + '\n');
        document.getElementById("nickR").style.borderColor="red";
        document.getElementById("nickR").style.borderStyle="dotted";
    } else if (nickR.match(/[^a-zñÑA-Z\d-]/gi)){
//        mensaje = mensaje.concat("El Nick no puede contener símbolos, ni estar en blanco" + '\n');
        document.getElementById("nickR").style.borderColor="red";
        document.getElementById("nickR").style.borderStyle="dotted";      
    } else {
        document.getElementById("nickR").style.borderColor="green";
        document.getElementById("nickR").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    //Validado el campo nombre de registrado
    var nombreRegistrado = document.getElementById("nombreR").value;
    var nombreR = nombreRegistrado.toString();
    if (nombreR == null || nombreR == "") {
//        mensaje = mensaje.concat("El campo Nombre de registrado debe rellenarse" + '\n');
        document.getElementById("nombreR").style.borderColor="red";
        document.getElementById("nombreR").style.borderStyle="dotted";
    } else if (nombreR.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nombreR").style.borderColor="red";
        document.getElementById("nombreR").style.borderStyle="dotted";
//        mensaje = mensaje.concat("El nombre del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombreR").style.borderColor="green";
        document.getElementById("nombreR").style.borderStyle="dotted";
        contador = contador + 1;
    }


    //Validado el campo apellido 1 de registrado
    var apellido1Registrado = document.getElementById("apellido1R").value;
    var apellido1R = apellido1Registrado.toString();
    if (apellido1R == null || apellido1R == "") {
//        mensaje = mensaje.concat("El campo Apellido 1 de registrado debe rellenarse" + '\n');
        document.getElementById("apellido1R").style.borderColor="red";
        document.getElementById("apellido1R").style.borderStyle="dotted";
    } else if (apellido1R.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("apellido1R").style.borderColor="red";
        document.getElementById("apellido1R").style.borderStyle="dotted";
 //       mensaje = mensaje.concat("El apellido 1 del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("apellido1R").style.borderColor="green";
        document.getElementById("apellido1R").style.borderStyle="dotted";
        contador = contador + 1;
    }
    //Validado el campo apellido 2 de registrado
    var apellido2Registrado = document.getElementById("apellido2R").value;
    var apellido2R = apellido2Registrado.toString();
    if (apellido2R.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("apellido2R").style.borderColor="red";
        document.getElementById("apellido2R").style.borderStyle="dotted";
//        mensaje = mensaje.concat("El apellido 2 del registrado no puede contener símbolos" + '\n');
    } else {
        document.getElementById("apellido2R").style.borderColor="green";
        document.getElementById("apellido2R").style.borderStyle="dotted";
        contador = contador + 1;
    }

	   //Validado el campo correo de registrado
    var correoRegistrado = document.getElementById("correoR").value;
    var correoR = correoRegistrado.toString();
    if (!correoR.match(/\S+@\S+\.\S+/g)|| correoR == null || correoR == ""){
        document.getElementById("correoR").style.borderColor="red";
        document.getElementById("correoR").style.borderStyle="dotted";
//        mensaje = mensaje.concat("El campo correo no puede permanecer vacío" + '\n');
    } else {
        document.getElementById("correoR").style.borderColor="green";
        document.getElementById("correoR").style.borderStyle="dotted";
        contador = contador + 1;
    }

    
    
    if(contador == 5){
    } else{
        return false;
    }
}