package exercicio1p9;

public class Principal {
    public static void main(String[] args){
        ContaBancariaSimplificada2 c1 = new ContaBancariaSimplificada2();    
        c1.abreConta();
        c1.deposita(0);
        c1.retira(600);
        c1.mostraDados();  
    }
}