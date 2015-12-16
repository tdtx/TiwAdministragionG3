function validarC(formulario){
    var contador = 0;
	
	
//Validado el campo titulo de curso
    var tituloCurso = document.getElementById("tituloC").value;
    var tituloC = tituloCurso.toString();
    if (tituloC == null || tituloC == "") {
        document.getElementById("tituloC").style.borderColor="red";
    } else if (tituloC.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("tituloC").style.borderColor="red";
        document.getElementById("tituloC").style.borderStyle="dotted";
    } else {
        document.getElementById("tituloC").style.borderColor="green";
        document.getElementById("tituloC").style.borderStyle="dotted";
        contador = contador + 1;
    }
	 
 
    
  /*  
  //Validado el campo nombre del profesor
    var profesorCurso = document.getElementById("profesorC").value;
    var profesorC = profesorCurso.toString();
    if (profesorC == null || profesorC == "") {
        document.getElementById("profesorC").style.borderColor="red";
        document.getElementById("profesorC").style.borderStyle="dotted";
    } else if (profesorC.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
        document.getElementById("profesorC").style.borderColor="red";
        document.getElementById("profesorC").style.borderStyle="dotted";
    } else {
        document.getElementById("profesorC").style.borderColor="green";
        document.getElementById("profesorC").style.borderStyle="dotted";
        contador = contador + 1;
    }
	*/   
    
 //aqui validariamos la imagen   
    
 
    
//Validado el campo descripcion
	var descripcionCurso = document.getElementById("descripcionC").value;
	var descripcionC = descripcionCurso.toString();
	if (descripcionC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| descripcionC == null || descripcionC == ""){
		document.getElementById("descripcionC").style.borderColor="red";
		document.getElementById("descripcionC").style.borderStyle="dotted";
	} else {
		document.getElementById("descripcionC").style.borderColor="green";
		document.getElementById("descripcionC").style.borderStyle="dotted";
		contador = contador + 1;
	}
	
	
	
	
//Validado el campo numeros de horas
	var nHorasCurso = document.getElementById("horasC").value;
	var nHorasC = nHorasCurso.toString();
	var cpLong = nHorasC.length;
	if (nHorasC.match(/[\D]/g)|| nHorasC == null || nHorasC == ""){
		document.getElementById("horasC").style.borderColor="red";
		document.getElementById("horasC").style.borderStyle="dotted";
	} else if(cpLong > 4){
		document.getElementById("horasC").style.borderColor="red";
		document.getElementById("horasC").style.borderStyle="dotted";
	}else if(cpLong < 2){
		document.getElementById("horasC").style.borderColor="red";
		document.getElementById("horasC").style.borderStyle="dotted";
	} else {
		document.getElementById("horasC").style.borderColor="green";
		document.getElementById("horasC").style.borderStyle="dotted";
		contador = contador + 1;
	}
	  
	
	
//Validado el campo temario
	var temarioCurso = document.getElementById("temarioC").value;
	var temarioC = temarioCurso.toString();
	if (temarioC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| temarioC == null || temarioC == ""){
		document.getElementById("temarioC").style.borderColor="red";
		document.getElementById("temarioC").style.borderStyle="dotted";
	} else {
		document.getElementById("temarioC").style.borderColor="green";
		document.getElementById("temarioC").style.borderStyle="dotted";
		contador = contador + 1;
	}
	  
	
	
	
 /*  
    
//Validado el campo certificado
    var certificadoCurso = document.getElementById("certificadoC").value;
    var certificadoC = certificadoCurso.toString();
    if (certificadoC == null || certificadoC == "") {
        document.getElementById("certificadoC").style.borderColor="red";
        document.getElementById("certificadoC").style.borderStyle="dotted";
    } else if (certificadoC=="Si" || certificadoC=="No" ){
        document.getElementById("certificadoC").style.borderColor="green";
        document.getElementById("certificadoC").style.borderStyle="dotted";
        contador = contador + 1;    
    } else {
        document.getElementById("certificadoC").style.borderColor="red";
        document.getElementById("certificadoC").style.borderStyle="dotted";
    }
	  
 
*/    
//Validado el campo categoria
	var categoriaCursos = document.getElementById("categoriaC").value;
	var categoriaC = categoriaCursos.toString();
	if (categoriaC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| categoriaC == null || categoriaC == ""){
		document.getElementById("categoriaC").style.borderColor="red";
		document.getElementById("categoriaC").style.borderStyle="dotted";
	} else {
		document.getElementById("categoriaC").style.borderColor="green";
		document.getElementById("categoriaC").style.borderStyle="dotted";
		contador = contador + 1;
	}


 /*
	
//Validado el campo destacado
	    var destacadoCursos = document.getElementById("destacadoC").value;
	    var destacadoC = destacadoCursos.toString();
	    if (destacadoC == null || destacadoC == "") {
	        document.getElementById("destacadoC").style.borderColor="red";
	        document.getElementById("destacadoC").style.borderStyle="dotted";
	    } else if (destacadoC=="Si" || destacadoC=="No" ){
	        document.getElementById("destacadoC").style.borderColor="green";
	        document.getElementById("destacadoC").style.borderStyle="dotted";
	        contador = contador + 1;    
	    } else {
	        document.getElementById("destacadoC").style.borderColor="red";
	        document.getElementById("destacadoC").style.borderStyle="dotted";
	    }



	    
	    
//Validado el campo validado
	      var validadoCursos = document.getElementById("validadoC").value;
	      var validadoC = validadoCursos.toString();
	      if (validadoC == null || validadoC == "") {
	          document.getElementById("validadoC").style.borderColor="red";
	          document.getElementById("validadoC").style.borderStyle="dotted";
	      } else if (validadoC=="Si" || validadoC=="No" ){
	          document.getElementById("validadoC").style.borderColor="green";
	          document.getElementById("validadoC").style.borderStyle="dotted";
	          contador = contador + 1;    
	      } else {
	          document.getElementById("validadoC").style.borderColor="red";
	          document.getElementById("validadoC").style.borderStyle="dotted";
	      }

*/
     
	      
//Validado el campo precio
	        var precioCursos = document.getElementById("precioC").value;
	        var precioC = precioCursos.toString();
	        if (precioC == null || precioC == "") {
	            document.getElementById("precioC").style.borderColor="red";
	            document.getElementById("precioC").style.borderStyle="dotted";
	        } else if (precioC.match(/[^\d.]/gi)){
	            document.getElementById("precioC").style.borderColor="red";
	            document.getElementById("precioC").style.borderStyle="dotted";
	        } else {
	            document.getElementById("precioC").style.borderColor="green";
	            document.getElementById("precioC").style.borderStyle="dotted";
	            contador = contador + 1;
	        }


	        
	        
	/*        
	        
//Validado el campo tipos de ofertas
	      	var tOfertaCursos = document.getElementById("tOfertaC").value;
	      	var tOfertaC = tOfertaCursos.toString();
	      	if (tOfertaC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| tOfertaC == null || tOfertaC == ""){
	      		document.getElementById("tOfertaC").style.borderColor="red";
	      		document.getElementById("tOfertaC").style.borderStyle="dotted";
	      	} else {
	      		document.getElementById("tOfertaC").style.borderColor="green";
	      		document.getElementById("tOfertaC").style.borderStyle="dotted";
	      		contador = contador + 1;
	      	}

	      	
	      	
	      	
//Validado el campo dificultad
	        var dificultadCursos = document.getElementById("nivelC").value;
	        var dificultadC = dificultadCursos.toString();
	        if (dificultadC == null || dificultadC == "") {
	            document.getElementById("nivelC").style.borderColor="red";
	            document.getElementById("nivelC").style.borderStyle="dotted";
	        } else if (dificultadC=="Alto" || dificultadC=="Medio" || dificultadC=="Bajo"){
	            document.getElementById("nivelC").style.borderColor="green";
	            document.getElementById("nivelC").style.borderStyle="dotted";
	            contador = contador + 1;    
	        } else {
	            document.getElementById("nivelC").style.borderColor="red";
	            document.getElementById("nivelC").style.borderStyle="dotted";
	        }

*/	
    
/*//Validado el campo secciones
	var seccionesCursos = document.getElementById("seccionesC").value;
	var seccionesC = seccionesCursos.toString();
	if (seccionesC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| seccionesC == null || seccionesC == ""){
		document.getElementById("seccionesC").style.borderColor="red";
		document.getElementById("seccionesC").style.borderStyle="dotted";
	} else {
		document.getElementById("seccionesC").style.borderColor="green";
		document.getElementById("seccionesC").style.borderStyle="dotted";
		contador = contador + 1;
	}
	 
	
	
	
	
//Validado el campo lecciones
	var leccionesCursos = document.getElementById("leccionesC").value;
	var leccionesC = leccionesCursos.toString();
	if (leccionesC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| leccionesC == null || leccionesC == ""){
		document.getElementById("leccionesC").style.borderColor="red";
		document.getElementById("leccionesC").style.borderStyle="dotted";
	} else {
		document.getElementById("leccionesC").style.borderColor="green";
		document.getElementById("leccionesC").style.borderStyle="dotted";
		contador = contador + 1;
	}
	  
	
	
	
//Validado el campo material
	var materialCursos = document.getElementById("materialC").value;
	var materialC = materialCursos.toString();
	if (materialC.match(/[^\s\da-zA-Z-º/ñÑáéíóúüÁÉÍÓÚÇÜç]/g)|| materialC == null || materialC == ""){
		document.getElementById("materialC").style.borderColor="red";
		document.getElementById("materialC").style.borderStyle="dotted";
	} else {
		document.getElementById("materialC").style.borderColor="green";
		document.getElementById("materialC").style.borderStyle="dotted";
		contador = contador + 1;
	}
    
	   
	
//Validado el campo notificaciones
    var notificacionesCurso = document.getElementById("notificacionesC").value;
    var notificacionesC = notificacionesCurso.toString();
    if (notificacionesC == null || notificacionesC == "") {
        document.getElementById("notificacionesC").style.borderColor="red";
        document.getElementById("notificacionesC").style.borderStyle="dotted";
    } else if (notificacionesC=="Si" || notificacionesC=="No" ){
        document.getElementById("notificacionesC").style.borderColor="green";
        document.getElementById("notificacionesC").style.borderStyle="dotted";
        contador = contador + 1;    
    } else {
        document.getElementById("notificacionesC").style.borderColor="red";
        document.getElementById("notificacionesC").style.borderStyle="dotted";
    }

    
    
    
//Validado el campo calificaciones
    var calificacionesCurso = document.getElementById("calificacionesC").value;
    var calificacionesC = calificacionesCurso.toString();
    if (calificacionesC == null || calificacionesC == "") {
        document.getElementById("calificacionesC").style.borderColor="red";
        document.getElementById("calificacionesC").style.borderStyle="dotted";
    } else if (calificacionesC=="Si" || calificacionesC=="No" ){
        document.getElementById("calificacionesC").style.borderColor="green";
        document.getElementById("calificacionesC").style.borderStyle="dotted";
        contador = contador + 1;    
    } else {
        document.getElementById("calificacionesC").style.borderColor="red";
        document.getElementById("calificacionesC").style.borderStyle="dotted";
    }

	  
    
    */
    
	   

	   
	
	
	

    /*Validado el campo fecha de inicio
	var fechaIniCursos = document.getElementById("fechaIniC").value;
	var fechaIniC = fechaIniCursos.toString();
	    hoy=new Date() 
	    var array_fecha = fechaIniC.split("/") 
	    var ano 
	    ano = parseInt(array_fecha[2]); 
	    var mes 
	    mes = parseInt(array_fecha[1]); 
	    var dia 
	    dia = parseInt(array_fecha[0]); 
	    if (array_fecha.length!=3) {
	    	 document.getElementById("fechaIniC").style.borderColor="red";
	         document.getElementById("fechaIniC").style.borderStyle="dotted";
	         mensaje = mensaje.concat("La fecha de inicio no tiene el formato dd/mm/aaaa" + '\n');
	    }else if (isNaN(ano)) {
	    	 document.getElementById("fechaIniC").style.borderColor="red";
	         document.getElementById("fechaIniC").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El año es incorrecto" + '\n');
	    }else if (isNaN(mes)) {
	    	 document.getElementById("fechaIniC").style.borderColor="red";
	         document.getElementById("fechaIniC").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
	    }else if (isNaN(dia)) {
	    	 document.getElementById("fechaIniC").style.borderColor="red";
	         document.getElementById("fechaIniC").style.borderStyle="dotted";
	         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
	    }else if (ano - hoy.getYear()+1 >= 0) {
	    	if (mes - hoy.getMonth()+1 >= 0) {
	    		if (dia - hoy.getUTCDate() >= 0 || mes - hoy.getMonth()+1 >= 1 || ano - hoy.getYear()+1 >= 1) {
	    		 	 document.getElementById("fechaIniC").style.borderColor="green";
	    	         document.getElementById("fechaIniC").style.borderStyle="dotted";
	    	         contador = contador + 1;
				}else {
				   	 document.getElementById("fechaIniC").style.borderColor="red";
			         document.getElementById("fechaIniC").style.borderStyle="dotted";
			         mensaje = mensaje.concat("dia menor, el plazo de inicio de matriculacion tiene que ser mayor al dia actual" + '\n');
				
				}
	    	}else{
		    	 document.getElementById("fechaIniC").style.borderColor="red";
		         document.getElementById("fechaIniC").style.borderStyle="dotted";
		         mensaje = mensaje.concat("mes menor" + '\n');
				}
	    }else{
	    	document.getElementById("fechaIniC").style.borderColor="red";
	         document.getElementById("fechaIniC").style.borderStyle="dotted";
	         mensaje = mensaje.concat("año menor" + '\n');
	    }*/
	    /*Validado el campo fecha de fin
		var fechaFInCursos = document.getElementById("fechaFInC").value;
		var fechaFInC = fechaFInCursos.toString();
		    hoyF=new Date() 
		    var array_fechaF = fechaFInC.split("/") 
		    var anoF 
		    anoF = parseInt(array_fechaF[2]); 
		    var mesF 
		    mesF = parseInt(array_fechaF[1]); 
		    var diaF 
		    diaF = parseInt(array_fechaF[0]); 
		    if (array_fechaF.length!=3) {
		    	 document.getElementById("fechaFInC").style.borderColor="red";
		         document.getElementById("fechaFInC").style.borderStyle="dotted";
		         mensaje = mensaje.concat("La fecha de fin no tiene el formato dd/mm/aaaa" + '\n');
		    }else if (isNaN(anoF)) {
		    	 document.getElementById("fechaFInC").style.borderColor="red";
		         document.getElementById("fechaFInC").style.borderStyle="dotted";
		         mensaje = mensaje.concat("El año es incorrecto" + '\n');
		    }else if (isNaN(mesF)) {
		    	 document.getElementById("fechaFInC").style.borderColor="red";
		         document.getElementById("fechaFInC").style.borderStyle="dotted";
		         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
		    }else if (isNaN(diaF)) {
		    	 document.getElementById("fechaFInC").style.borderColor="red";
		         document.getElementById("fechaFInC").style.borderStyle="dotted";
		         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
		    }else if (anoF - ano >= 0) {
		    	if (mesF - mes >= 0) {
		    		if (diaF - hoyF.getUTCDate() >= 0 || mesF - mes >= 1 || anoF - ano >= 1) {
		    		 	 document.getElementById("fechaFInC").style.borderColor="green";
		    	         document.getElementById("fechaFInC").style.borderStyle="dotted";
		    	         contador = contador + 1;
					}else {
					   	 document.getElementById("fechaFInC").style.borderColor="red";
				         document.getElementById("fechaFInC").style.borderStyle="dotted";
				         mensaje = mensaje.concat("dia menor" + '\n');	
					}
		    	}else{
			    	 document.getElementById("fechaFInC").style.borderColor="red";
			         document.getElementById("fechaFInC").style.borderStyle="dotted";
			         mensaje = mensaje.concat("mes menor" + '\n');
					}
		    }else{
		    	document.getElementById("fechaFInC").style.borderColor="red";
		         document.getElementById("fechaFInC").style.borderStyle="dotted";
		         mensaje = mensaje.concat("año menor" + '\n');
		    }
*/

    
    
    
    
    
    
    
//Validado el campo nombre del asociado
	        /*		    var asociadoCursos = document.getElementById("asociadoC").value;
		    var asociadoC = asociadoCursos.toString();
		    if (asociadoC == null || asociadoC == "") {
		        document.getElementById("asociadoC").style.borderColor="red";
		        document.getElementById("asociadoC").style.borderStyle="dotted";
		    } else if (asociadoC.match(/[^\s\da-zA-ZñáéíóúüçÁÉÍÓÚÇÜÑ&@-]/gi)){
		        document.getElementById("asociadoC").style.borderColor="red";
		        document.getElementById("asociadoC").style.borderStyle="dotted";
		    } else {
		        document.getElementById("asociadoC").style.borderColor="green";
		        document.getElementById("asociadoC").style.borderStyle="dotted";
		        contador = contador + 1;
		    }
	
		  Validado el campo nombre del cierre curso
		    var cierreCursoCursos = document.getElementById("cierreCursoC").value;
			var cierreCursoC = cierreCursoCursos.toString();
			    hoyC=new Date() 
			    var array_fechaF = cierreCursoC.split("/") 
			    var anoC 
			    anoC = parseInt(array_fechaF[2]); 
			    var mesC 
			    mesC = parseInt(array_fechaF[1]); 
			    var diaC 
			    diaC = parseInt(array_fechaF[0]); 
			    if (array_fechaF.length!=3) {
			    	 document.getElementById("cierreCursoC").style.borderColor="red";
			         document.getElementById("cierreCursoC").style.borderStyle="dotted";
			         mensaje = mensaje.concat("La fecha de fin no tiene el formato dd/mm/aaaa" + '\n');
			    }else if (isNaN(anoC)) {
			    	 document.getElementById("cierreCursoC").style.borderColor="red";
			         document.getElementById("cierreCursoC").style.borderStyle="dotted";
			         mensaje = mensaje.concat("El año es incorrecto" + '\n');
			    }else if (isNaN(mesC)) {
			    	 document.getElementById("cierreCursoC").style.borderColor="red";
			         document.getElementById("cierreCursoC").style.borderStyle="dotted";
			         mensaje = mensaje.concat("El mes es incorrecto" + '\n');
			    }else if (isNaN(diaC)) {
			    	 document.getElementById("cierreCursoC").style.borderColor="red";
			         document.getElementById("cierreCursoC").style.borderStyle="dotted";
			         mensaje = mensaje.concat("El dia es incorrecto" + '\n');
			    }else if (anoC - ano >= 0) {
			    	if (mesC - mes >= 0) {
			    		if (diaC - dia >= 0 || mesC - mes >= 1 || anoC - ano >= 1) {
			    		 	 document.getElementById("cierreCursoC").style.borderColor="green";
			    	         document.getElementById("cierreCursoC").style.borderStyle="dotted";
			    	         contador = contador + 1;
						} else {
						   	 document.getElementById("cierreCursoC").style.borderColor="red";
					         document.getElementById("cierreCursoC").style.borderStyle="dotted";
					         mensaje = mensaje.concat("dia menor" + '\n');	
						}
			    	}else{
				    	 document.getElementById("cierreCursoC").style.borderColor="red";
				         document.getElementById("cierreCursoC").style.borderStyle="dotted";
				         mensaje = mensaje.concat("mes menor" + '\n');
						}
			    }else{
			    	document.getElementById("cierreCursoC").style.borderColor="red";
			         document.getElementById("cierreCursoC").style.borderStyle="dotted";
			         mensaje = mensaje.concat("año menor" + '\n');
			    }*/

			   
		    
		    
		    
/*		    
		    
//Validado el campo peticion eliminar
		    var peticionECursos = document.getElementById("peticionEC").value;
		    var peticionEC = peticionECursos.toString();
		    if (peticionEC == null || peticionEC == "") {
//		        mensaje = mensaje.concat("El campo peticion de eliminacion de curso debe rellenarse" + '\n');
		        document.getElementById("peticionEC").style.borderColor="red";
		        document.getElementById("peticionEC").style.borderStyle="dotted";
		    } else if (peticionEC=="Si" || peticionEC=="No" ){
		        document.getElementById("peticionEC").style.borderColor="green";
		        document.getElementById("peticionEC").style.borderStyle="dotted";
		        contador = contador + 1;    
		    } else {
//		        mensaje = mensaje.concat("El campo peticion eliminacion de curso debe rellenarse con Si o NO)" + '\n');
		        document.getElementById("peticionEC").style.borderColor="red";
		        document.getElementById("peticionEC").style.borderStyle="dotted";
		    }

		    
		    
//Validado el campo id
		  	var idCurso = document.getElementById("idC").value;
		  	var idC = idCurso.toString();
		  	var cpLong = idC.length;
		  	if (idC.match(/[\D]/g)|| idC == null || idC == ""){
		  		document.getElementById("idC").style.borderColor="red";
		  		document.getElementById("idC").style.borderStyle="dotted";
		  	} else if(cpLong != 4){
		  		document.getElementById("idC").style.borderColor="red";
		  		document.getElementById("idC").style.borderStyle="dotted";
		  	} else {
		  		document.getElementById("idC").style.borderColor="green";
		  		document.getElementById("idC").style.borderStyle="dotted";
		  		contador = contador + 1;
		  	}
		      
	*/	  			    
		    
    if(contador == 6){
        alert("Modificado correctamente");
    } else{
        return false;
    }
}