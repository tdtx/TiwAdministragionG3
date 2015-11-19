function validarM(formulario){
    var contador = 0;
  //  var mensaje = "";
    //Validado el campo nick de matriculado
    var nickMatriculado = document.getElementById("nickM").value;
    var nickM = nickMatriculado.toString();
    if (nickM == null || nickM == "") {
//        mensaje = mensaje.concat("El campo Nick debe rellenarse" + '\n');
        document.getElementById("nickM").style.borderColor="red";
        document.getElementById("nickM").style.borderStyle="dotted";
    } else if (nickM.match(/[^a-zñÑA-Z\d-]/gi)){
  //      mensaje = mensaje.concat("El Nick no puede contener símbolos, ni estar en blanco" + '\n');
        document.getElementById("nickM").style.borderColor="red";
        document.getElementById("nickM").style.borderStyle="dotted";      
    } else {
        document.getElementById("nickM").style.borderColor="green";
        document.getElementById("nickM").style.borderStyle="dotted";
        contador = contador + 1;
    }


    //Validado el campo nombre de matriculado
    var nombreMatriculado = document.getElementById("nombreM").value;
    var nombreM = nombreMatriculado.toString();
    if (nombreM == null || nombreM == "") {
    //    mensaje = mensaje.concat("El campo Nombre de matriculado debe rellenarse" + '\n');
        document.getElementById("nombreM").style.borderColor="red";
        document.getElementById("nombreM").style.borderStyle="dotted";
    } else if (nombreM.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("nombreM").style.borderColor="red";
        document.getElementById("nombreM").style.borderStyle="dotted";
      //  mensaje = mensaje.concat("El nombre del matriculado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("nombreM").style.borderColor="green";
        document.getElementById("nombreM").style.borderStyle="dotted";
        contador = contador + 1;
    }


    //Validado el campo apellido 1 de matriculado
    var apellido1Matriculado = document.getElementById("apellido1M").value;
    var apellido1M = apellido1Matriculado.toString();
    if (apellido1M == null || apellido1M == "") {
//        mensaje = mensaje.concat("El campo Apellido 1 de matriculado debe rellenarse" + '\n');
        document.getElementById("apellido1M").style.borderColor="red";
        document.getElementById("apellido1M").style.borderStyle="dotted";
    } else if (apellido1M.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("apellido1M").style.borderColor="red";
        document.getElementById("apellido1M").style.borderStyle="dotted";
//        mensaje = mensaje.concat("El apellido 1 del matriculado no puede contener símbolos, ni estar en blanco" + '\n');
    } else {
        document.getElementById("apellido1M").style.borderColor="green";
        document.getElementById("apellido1M").style.borderStyle="dotted";
        contador = contador + 1;
    }
    //Validado el campo apellido 2 de matriculado
    var apellido2Matriculado = document.getElementById("apellido2M").value;
    var apellido2M = apellido2Matriculado.toString();
    if (apellido2M.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("apellido2M").style.borderColor="red";
        document.getElementById("apellido2M").style.borderStyle="dotted";
//        mensaje = mensaje.concat("El apellido 2 del matriculado no puede contener símbolos" + '\n');
    } else {
        document.getElementById("apellido2M").style.borderColor="green";
        document.getElementById("apellido2M").style.borderStyle="dotted";
        contador = contador + 1;
    }

	   //Validado el campo correo de matriculado
    var correoMatriculado = document.getElementById("correoM").value;
    var correoM = correoMatriculado.toString();
    if (correoM.match(/[^\w\d.@-_ñÑ&#/]/g)|| correoM == null || correoM == ""){
        document.getElementById("correoM").style.borderColor="red";
        document.getElementById("correoM").style.borderStyle="dotted";
//        mensaje = mensaje.concat("El campo correo no puede permanecer vacío" + '\n');
    } else {
        document.getElementById("correoM").style.borderColor="green";
        document.getElementById("correoM").style.borderStyle="dotted";
        contador = contador + 1;
    }
    //Validado el campo fecha de matriculado
	var fechaNcMatriculado = document.getElementById("fechaNcM").value;
	var fechaNcM = fechaNcMatriculado.toString();
	    hoy=new Date() 
	    var array_fecha = fechaNcM.split("/") 
	    var ano 
	    ano = parseInt(array_fecha[2]); 
	    var mes 
	    mes = parseInt(array_fecha[1]); 
	    var dia 
	    dia = parseInt(array_fecha[0]); 
	    edad=hoy.getYear()- ano - 1; 
	    if (array_fecha.length!=3) {
	    	 document.getElementById("fechaNcM").style.borderColor="red";
	         document.getElementById("fechaNcM").style.borderStyle="dotted";
//	         mensaje = mensaje.concat("La fecha no tiene el formato dd/mm/aaaa" + '\n');
	    }else if (isNaN(ano)) {
	    	 document.getElementById("fechaNcM").style.borderColor="red";
	         document.getElementById("fechaNcM").style.borderStyle="dotted";
//	         mensaje = mensaje.concat("El año es incorrecto" + '\n');
	    }else if (isNaN(mes)) {
	    	 document.getElementById("fechaNcM").style.borderColor="red";
	         document.getElementById("fechaNcM").style.borderStyle="dotted";
//	         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
	    }else if (isNaN(dia)) {
	    	 document.getElementById("fechaNcM").style.borderColor="red";
	         document.getElementById("fechaNcM").style.borderStyle="dotted";
//	         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
	    }else if (ano<=99) {
	        ano +=1900 
	    }else if (hoy.getMonth() + 1 - mes < 0) {
	    	 document.getElementById("fechaNcM").style.borderColor="red";
	         document.getElementById("fechaNcM").style.borderStyle="dotted";
//	         mensaje = mensaje.concat("Eres menor de edad por mes" + '\n');
	    }else if (hoy.getMonth() + 1 - mes > 0) {
	    	 document.getElementById("fechaNcM").style.borderColor="green";
	         document.getElementById("fechaNcM").style.borderStyle="dotted";
	         contador = contador + 1;
	    }else if (hoy.getUTCDate() - dia >= 0) {
		   	 document.getElementById("fechaNcM").style.borderColor="red";
	         document.getElementById("fechaNcM").style.borderStyle="dotted";
//	         mensaje = mensaje.concat("Eres menor de edad por dia" + '\n');
	    }else{
	    	document.getElementById("fechaNcM").style.borderColor="red";
	         document.getElementById("fechaNcM").style.borderStyle="dotted";
//	         mensaje = mensaje.concat("La fecha no tiene el formato dd/mm/aaaa" + '\n');
	    }

	  //Validado el campo telefono
		var telefonoMatriculado = document.getElementById("telefonoM").value;
		var telefonoM = telefonoMatriculado.toString();
		var telfLong = telefonoM.length;
		if (telefonoM == null || telefonoM == "") {
//			mensaje = mensaje.concat("El campo telefono  debe rellenarse" + '\n');
			document.getElementById("telefonoM").style.borderColor="red";
			document.getElementById("telefonoM").style.borderStyle="dotted";
		} else if (telefonoM.match(/[\D]/gi)){
			document.getElementById("telefonoM").style.borderColor="red";
			document.getElementById("telefonoM").style.borderStyle="dotted";
//			mensaje = mensaje.concat("El campo telefono no puede contener letras ni estar en blanco" + '\n');
		} else if (telfLong < 9){
			document.getElementById("telefonoM").style.borderColor="red";
			document.getElementById("telefonoM").style.borderStyle="dotted";
//			mensaje = mensaje.concat("El campo telefono debe tener al menos 9 dígitos" + '\n');
		} else{	
			document.getElementById("telefonoM").style.borderColor="green";
			document.getElementById("telefonoM").style.borderStyle="dotted";
			contador = contador + 1;
		}
	    //Validado el campo genero
	    var generoMatriculado = document.getElementById("generoM").value;
	    var generoM = generoMatriculado.toString();
	    if (generoM == null || generoM == "") {
//	        mensaje = mensaje.concat("El campo genero debe rellenarse" + '\n');
	        document.getElementById("generoM").style.borderColor="red";
	        document.getElementById("generoM").style.borderStyle="dotted";
	    } else if (generoM=="Hombre" || generoM=="Mujer" ){
	        document.getElementById("generoM").style.borderColor="green";
	        document.getElementById("generoM").style.borderStyle="dotted";
	        contador = contador + 1;    
	    } else {
//	        mensaje = mensaje.concat("El campo genero debe rellenarse con Hombre o Mujer" + '\n');
	        document.getElementById("generoM").style.borderColor="red";
	        document.getElementById("generoM").style.borderStyle="dotted";
	    }
	  //Validado el campo calle
		var calleMatriculado = document.getElementById("calleM").value;
		var calleM = calleMatriculado.toString();
		if (calleM.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| calleM == null || calleM == ""){
			document.getElementById("calleM").style.borderColor="red";
			document.getElementById("calleM").style.borderStyle="dotted";
//			mensaje = mensaje.concat("El campo calle no puede permanecer vacío, y puede estar formado tanto por letras como por números" + '\n');
		} else {
			document.getElementById("calleM").style.borderColor="green";
			document.getElementById("calleM").style.borderStyle="dotted";
			contador = contador + 1;
		}

		//Validado el campo localidad
		var localidadMatriculado = document.getElementById("localidadM").value;
		var localidadM = localidadMatriculado.toString();

		if (localidadM == null || localidadM == "") {
//			mensaje = mensaje.concat("El campo localidad debe rellenarse" + '\n');
			document.getElementById("localidadM").style.borderColor="red";
			document.getElementById("localidadM").style.borderStyle="dotted";
		} else if (localidadM.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)){
			document.getElementById("localidadM").style.borderColor="red";
			document.getElementById("localidadM").style.borderStyle="dotted";
//			mensaje = mensaje.concat("El campo localidad no puede contener números ni símbolos ni estar en blanco" + '\n');
		} else {
			document.getElementById("localidadM").style.borderColor="green";
			document.getElementById("localidadM").style.borderStyle="dotted";
			contador = contador + 1;
		}

		//Valido el campo 'codigo postal'
		var cpMatriculado = document.getElementById("cpM").value;
		var cpM = cpMatriculado.toString();
		var cpLong = cpM.length;
		if (cpM.match(/[\D]/g)|| cpM == null || cpM == ""){
			document.getElementById("cpM").style.borderColor="red";
			document.getElementById("cpM").style.borderStyle="dotted";
//			mensaje = mensaje.concat("El campo Codigo postal no puede permanecer vacío y sólo puede estar formado por números" + '\n');
		} else if(cpLong != 5){
			document.getElementById("cpM").style.borderColor="red";
			document.getElementById("cpM").style.borderStyle="dotted";
//			mensaje = mensaje.concat("El campo Codigo postal debe estar formado por 5 dígitos" + '\n');
		} else {
			document.getElementById("cpM").style.borderColor="green";
			document.getElementById("cpM").style.borderStyle="dotted";
			contador = contador + 1;
		}

		//Validado el campo provincia
		var provinciaMatriculado = document.getElementById("provinciaM").value;
		var provinciaM = provinciaMatriculado.toString();
		if (provinciaM == null || provinciaM == "") {
//			mensaje = mensaje.concat("El campo Provincia debe rellenarse" + '\n');
			document.getElementById("provinciaM").style.borderColor="red";
			document.getElementById("provinciaM").style.borderStyle="dotted";
		} else if (provinciaM.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
			document.getElementById("provinciaM").style.borderColor="red";
			document.getElementById("provinciaM").style.borderStyle="dotted";
//			mensaje = mensaje.concat("El campo Provincia no puede contener números ni símbolos ni estar en blanco" + '\n');
		} else {
			document.getElementById("provinciaM").style.borderColor="green";
			document.getElementById("provinciaM").style.borderStyle="dotted";
			contador = contador + 1;
		}
		//Validado el campo pais
		var paisMatriculado = document.getElementById("paisM").value;
		var paisM = paisMatriculado.toString();
		if (paisM == null || paisM == "") {
//			mensaje = mensaje.concat("El campo País debe rellenarse" + '\n');
			document.getElementById("paisM").style.borderColor="red";
			document.getElementById("paisM").style.borderStyle="dotted";
		} else if (paisM.match(/[^\sa-zA-Z-ñÑáéíóúüÁÉÍÓÚÇÜç]/gi)){
			document.getElementById("paisM").style.borderColor="red";
			document.getElementById("paisM").style.borderStyle="dotted";
//			mensaje = mensaje.concat("El campo País no puede contener números ni símbolos ni estar en blanco" + '\n');
		} else {
			document.getElementById("paisM").style.borderColor="green";
			document.getElementById("paisM").style.borderStyle="dotted";
			contador = contador + 1;
		}
		  //Validado el campo dni
		var dniMatriculado = document.getElementById("dniM").value;
		var dniM = dniMatriculado.toString();
		  var expresion_regular_dni		 
		  expresion_regular_dni = /^\d{8}[a-zA-Z]$/;		 
		  if(expresion_regular_dni.test (dniM) == true){
			  document.getElementById("dniM").style.borderColor="green";
				document.getElementById("dniM").style.borderStyle="dotted";
				contador = contador + 1;
		  }else{
			  document.getElementById("dniM").style.borderColor="red";
				document.getElementById("dniM").style.borderStyle="dotted";
//				mensaje = mensaje.concat("El formato del DNI es incorrecto, el formato es 8 digito +1 letra sin espacio" + '\n');
		   }
		   //Validado el campo cupon
		    var cuponMatriculado = document.getElementById("cuponM").value;
		    var cuponM = cuponMatriculado.toString();
		    if (cuponM == null || cuponM == "") {
//		        mensaje = mensaje.concat("El campo cupon debe rellenarse" + '\n');
		        document.getElementById("cuponM").style.borderColor="red";
		        document.getElementById("cuponM").style.borderStyle="dotted";
		    } else if (cuponM=="Si" || cuponM=="No" ){
		        document.getElementById("cuponM").style.borderColor="green";
		        document.getElementById("cuponM").style.borderStyle="dotted";
		        contador = contador + 1;    
		    } else {
//		        mensaje = mensaje.concat("El campo cupon debe rellenarse con Si o No)" + '\n');
		        document.getElementById("cuponM").style.borderColor="red";
		        document.getElementById("cuponM").style.borderStyle="dotted";
		    }
		    //Validado el campo precio
		    var precioMatriculado = document.getElementById("precioM").value;
		    var precioM = precioMatriculado.toString();
		    if (precioM == null || precioM == "") {
//		        mensaje = mensaje.concat("El campo precio  debe rellenarse." + '\n');
		        document.getElementById("precioM").style.borderColor="red";
		        document.getElementById("precioM").style.borderStyle="dotted";
		    } else if (precioM.match(/[^\d.]/gi)){
		        document.getElementById("precioM").style.borderColor="red";
		        document.getElementById("precioM").style.borderStyle="dotted";
//		        mensaje = mensaje.concat("El campo precio  no puede contener letras ni estar en blanco." + '\n');
		    } else {
		        document.getElementById("precioM").style.borderColor="green";
		        document.getElementById("precioM").style.borderStyle="dotted";
		        contador = contador + 1;
		    }
		    //Validado el campo logro
		    var logroMatriculado = document.getElementById("logroM").value;
		    var logroM = logroMatriculado.toString();
		    if (logroM == null || logroM == "") {
//		        mensaje = mensaje.concat("El campo logro debe rellenarse" + '\n');
		        document.getElementById("logroM").style.borderColor="red";
		        document.getElementById("logroM").style.borderStyle="dotted";
		    } else if (logroM.match(/[^a-zñÑA-Z\d-]/gi)){
//		        mensaje = mensaje.concat("El logro no puede contener símbolos, ni estar en blanco" + '\n');
		        document.getElementById("logroM").style.borderColor="red";
		        document.getElementById("logroM").style.borderStyle="dotted";      
		    } else {
		        document.getElementById("logroM").style.borderColor="green";
		        document.getElementById("logroM").style.borderStyle="dotted";
		        contador = contador + 1;
		    }
		    //Validado el campo crusos
		    var cursosMatriculados = document.getElementById("cursosM").value;
		    var cursosM = cursosMatriculados.toString();
		    if (cursosM == null || cursosM == "") {
//		        mensaje = mensaje.concat("El crusos logro debe rellenarse" + '\n');
		        document.getElementById("cursosM").style.borderColor="red";
		        document.getElementById("cursosM").style.borderStyle="dotted";
		    } else if (cursosM.match(/[^a-zñÑA-Z\d-]/gi)){
//		        mensaje = mensaje.concat("El crusos no puede contener símbolos, ni estar en blanco" + '\n');
		        document.getElementById("cursosM").style.borderColor="red";
		        document.getElementById("cursosM").style.borderStyle="dotted";      
		    } else {
		        document.getElementById("cursosM").style.borderColor="green";
		        document.getElementById("cursosM").style.borderStyle="dotted";
		        contador = contador + 1;
		    }

    if(contador == 18){
        alert("Usuario matriculado con éxito");
    } else{
 //       alert(mensaje);
        return false;
    }
}