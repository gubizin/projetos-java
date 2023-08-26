package exercicio1p5;

public class LampadaTresEstados {
    String estadoDaLampada;
    
    public void Acende(){
        estadoDaLampada = "aceso";     
    }
    
    public void Apaga(){
        estadoDaLampada = "apagado";
    }
    
    public void Meia(){
        estadoDaLampada = "meia-luz";
    }
    
    public void mostraEstado(){
        if(estadoDaLampada == "aceso"){
            System.out.println("A lampada esta acesa");
        }else{
            if(estadoDaLampada == "apagado"){
                System.out.println("A lampada esta apagada");
            }else{
                if(estadoDaLampada == "meia-luz"){
                    System.out.println("A lampada esta meio acesa");
                }
            }
        }
    }
}
