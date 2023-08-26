package exercicio1p7;

public class LampadaVF {
    String estadoDaLampada;
    
    public void Acende(){
        estadoDaLampada = "aceso"; 
    }
    
    public void Apaga(){
        estadoDaLampada = "apagado";
    }
    
    public boolean estaLigada(){
        if(estadoDaLampada == "aceso"){
            return true;
        }else{
            return false;
        }
    }
}