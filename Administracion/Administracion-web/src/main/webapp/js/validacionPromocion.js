function validarPromo(){
    var contador = 0;
    alert("validacion promo");
    var promocionC = document.getElementById("PromocionC").value;
    var promo = promocionC.toString();
    if (promo == null || promo == "") {
        document.getElementById("PromocionC").style.borderColor="red";
        document.getElementById("PromocionC").style.borderStyle="dotted";
    } else if (promo.match(/[^\d.]/gi) || promo<5 || promo>30){
        document.getElementById("PromocionC").style.borderColor="red";
        document.getElementById("PromocionC").style.borderStyle="dotted";
    } else {
        document.getElementById("PromocionC").style.borderColor="green";
        document.getElementById("PromocionC").style.borderStyle="dotted";
        contador = contador + 1;
    }
    
    
    if(contador == 1){
        alert("Promocion aplicada");
    } else{
        return false;
    }
}