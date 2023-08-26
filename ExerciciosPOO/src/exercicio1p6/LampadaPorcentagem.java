package exercicio1p6;

public class LampadaPorcentagem {
    int porcentagemDaLampada;
    
    public int setPorcentagemDaLampada(){
        return porcentagemDaLampada;
    }
    
    public void setPorcentagemDaLampada(int porcentagemDaLampada){
        this.porcentagemDaLampada = porcentagemDaLampada;
    }
    
    public void mostraPorcentagem(){
        if(porcentagemDaLampada >= 0 && porcentagemDaLampada <= 100){
        System.out.println("A lampada esta em "+porcentagemDaLampada+"%");
        }else{
            System.out.println("Valor invalido");
        }
    }
}