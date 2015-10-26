function validarR(formulario){
    var contador = 0;
    var mensaje = "";
    //Validado el campo nick de registrado
    var nickRegistrado = document.getElementById("nickR").value;
    var nickR = nickRegistrado.toString();
    if (nickR == null || nickR == "") {
        mensaje = mensaje.concat("El campo Nick debe rellenarse" + '\n');
        document.getElementById("nickR").style.borderColor="red";
        document.getElementById("nickR").style.borderStyle="dotted";
    } else if (nickR.match(/[^a-zñÑA-Z\d-]/gi)){
        mensaje = mensaje.concat("El Nick no puede contener símbolos, ni estar en blanco" + '\n');
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
        mensaje = mensaje.concat("El campo Nombre de registrado debe rellenarse" + '\n');
        document.getElementById("nombreR").style.borderColor="red";
        document.getElementById("nombreR").style.borderStyle="dotted";
    } else if (nombreR.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nombreR").style.borderColor="red";
        document.getElementById("nombreR").style.borderStyle="dotted";
        mensaje = mensaje.concat("El nombre del registrado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombreR").style.borderColor="green";
        document.getElementById("nombreR").style.borderStyle="dotted";
        contador = contador + 1;
    }


    //Validado el campo apellido 1 de registrado
    var apellido1Registrado = document.getElementById("apellido1R").value;
    var apellido1R = apellido1Registrado.toString();
    if (apellido1R == null || apellido1R == "") {
        mensaje = mensaje.concat("El campo Apellido 1 de registrado debe rellenarse" + '\n');
        document.getElementById("apellido1R").style.borderColor="red";
        document.getElementById("apellido1R").style.borderStyle="dotted";
    } else if (apellido1R.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("apellido1R").style.borderColor="red";
        document.getElementById("apellido1R").style.borderStyle="dotted";
        mensaje = mensaje.concat("El apellido 1 del registrado no puede contener símbolos, ni estar en blanco" + '\n');
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
        mensaje = mensaje.concat("El apellido 2 del registrado no puede contener símbolos" + '\n');
    } else {
        document.getElementById("apellido2R").style.borderColor="green";
        document.getElementById("apellido2R").style.borderStyle="dotted";
        contador = contador + 1;
    }

	   //Validado el campo correo de registrado
    var correoRegistrado = document.getElementById("correoR").value;
    var correoR = correoRegistrado.toString();
    if (correoR.match(/[^\w\d.@-_ñÑ&#/]/g)|| correoR == null || correoR == ""){
        document.getElementById("correoR").style.borderColor="red";
        document.getElementById("correoR").style.borderStyle="dotted";
        mensaje = mensaje.concat("El campo correo no puede permanecer vacío" + '\n');
    } else {
        document.getElementById("correoR").style.borderColor="green";
        document.getElementById("correoR").style.borderStyle="dotted";
        contador = contador + 1;
    }
    //Validado el campo fecha de registrado
	var fechaNcRegistrado = document.getElementById("fechaNcR").value;
	var fechaNcR = fechaNcRegistrado.toString();
	    hoy=new Date() 
	    var array_fecha = fechaNcR.split("/") 
	    var ano 
	    ano = parseInt(array_fecha[2]); 
	    var mes 
	    mes = parseInt(array_fecha[1]); 
	    var dia 
	    dia = parseInt(array_fecha[0]); 
	    edad=hoy.getYear()- ano - 1; 
	    if (array_fecha.length!=3) {
	    	 document.getElementById("fechaNcR").style.borderColor="red";
	         document.getElementById("fechaNcR").style.borderStyle="dotted";
	         mensaje = mensaje.concat("La fecha no tiene el formato dd/mm/aaaa" + '\n');
	    }else if (isNaN(ano)) {
	    	 document.getElementById("fechaNcR").style.borderColor="red";
	         document.getElementById("fechaNcR").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El año es incorrecto" + '\n');
	    }else if (isNaN(mes)) {
	    	 document.getElementById("fechaNcR").style.borderColor="red";
	         document.getElementById("fechaNcR").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
	    }else if (isNaN(dia)) {
	    	 document.getElementById("fechaNcR").style.borderColor="red";
	         document.getElementById("fechaNcR").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
	    }else if (ano<=99) {
	        ano +=1900 
	    }else if (hoy.getMonth() + 1 - mes < 0) {
	    	 document.getElementById("fechaNcR").style.borderColor="red";
	         document.getElementById("fechaNcR").style.borderStyle="dotted";
	         mensaje = mensaje.concat("Eres menor de edad" + '\n');
	    }else if (hoy.getMonth() + 1 - mes > 0) {
	    	 document.getElementById("fechaNcR").style.borderColor="green";
	         document.getElementById("fechaNcR").style.borderStyle="dotted";
	         contador = contador + 1;
	    }else if (hoy.getUTCDate() - dia >= 0) {
		   	 document.getElementById("fechaNcR").style.borderColor="red";
	         document.getElementById("fechaNcR").style.borderStyle="dotted";
	         mensaje = mensaje.concat("Eres menor de edad por dia" + '\n');
	    }else{
	    	document.getElementById("fechaNcR").style.borderColor="red";
	         document.getElementById("fechaNcR").style.borderStyle="dotted";
	         mensaje = mensaje.concat("La fecha no tiene el formato dd/mm/aaaa" + '\n');
	    }

     
    if(contador == 6){
        alert("Usuario registrado con éxito");
    } else{
        alert(mensaje);
        return false;
    }
}