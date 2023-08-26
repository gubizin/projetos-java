package exercicio1p7;

public class Principal {
    public static void main(String[] args){
        LampadaVF estado = new LampadaVF();
        
        estado.Apaga();
        System.out.println(estado.estaLigada());
    }
}