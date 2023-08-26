package exercicio1p8;

public class Principal {
    public static void main(String[] args){
        ContaBancariaSimplificada c1 = new ContaBancariaSimplificada();    
        c1.abreConta();
        c1.deposita(500);
        c1.retira(250);
        c1.mostraDados();
        c1.mostraDados(true);
    }
}