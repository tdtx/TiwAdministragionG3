package filtros;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class validacionesJava {
    
    //Constructor para el init del servlet

    public validacionesJava () {
        super();
    }
    
    //Metodos de validacion
    
    public boolean sinNumero(String dato) { 
        if (dato == " " || dato == null || dato.trim() ==" " || dato.trim() ==null){        
            return false;
        }else if (!dato.trim().matches("^[A-ZÂÁÉÍÓÚáéíóúüçÜÇa-zÃ¡©³º±§¼+][\\s[A-ZÂÁÉÍÓÚáéíóúüçÜÇa-zÃ¡©³º±§¼]+]*$")) {
            return false;
        }else{
            return true;
        }
    }
    
    public boolean sinRestriccion(String dato) {
        if (dato == " " || dato == null || dato.trim() == " " || dato.trim() == null){      
            return false;
        }else{
            return true;
        }
    
    }
    
    public boolean soloNumero(String dato, int size) {
        if (dato == " " || dato == null || dato.trim() ==" " || dato.trim() ==null){        
            return false;
        }else{
            Pattern datoPattern = Pattern.compile("(\\d{1,"+size+"})");
            Matcher aux = datoPattern.matcher(dato);
            if(!aux.matches()){
                return false;
            }else{
                if (dato.length() >= size) {
                    return true;
                }
                return false;
            }
        }
    }   
    
    public boolean soloNumeroIgual(String dato, int size, int longPermitida) {
        if (dato == " " || dato == null){       
            return false;
        }else{
            Pattern datoPattern = Pattern.compile("(\\d{1,"+size+"})");
            Matcher aux = datoPattern.matcher(dato);
            if(!aux.matches()){
                return false;
            }else if(longPermitida != size && longPermitida != 0){
                return false;
            } else{
                return true;
            }
        }
    }   


    public boolean soloEmail(String dato) {
        if (dato == " " || dato == null){       
            return false;
        }else if(!dato.trim().matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")){
            return false;             
        }else{
            return true;
        }
    }

    public boolean cif(String dato){
        if (dato == " " || dato == null || dato.trim() ==" " || dato.trim() ==null){
            return false; 
        } else if (!dato.trim().matches("^[A-Za-z0-9+]*$")) {
            return false;
        }else{
            return true;
        }
    }
    public boolean precio (String dato){
        if (dato == " " || dato == null || dato.trim() ==" " || dato.trim() ==null){        
            return false;
        }else{
            Pattern datoPattern = Pattern.compile("^[+]?\\d+(\\.{0,1}(\\d+?))?$");
            Matcher aux = datoPattern.matcher(dato);
            if (aux.matches()){
                return true;
            } else {
                return false;
            }
        }
    }
    public boolean stringIguales (String dato1, String dato2){
        if (dato1.equals(dato2)){
            return true;
        } else {
            return false;
        }
    }
}
