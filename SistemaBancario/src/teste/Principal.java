package teste;

import modelo.Conta;
import modelo.ContaCorrente;
public class Principal {
    public static void main(String[] args){
        Conta c1 = new Conta();
        c1.setNome("Saulo");
        c1.setSaldo(100);
        
        c1.mostraDados();    
        
        c1.deposita(500);
        c1.saca(300);
        
        c1.mostraDados();
        
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNome("Gabriel");
        cc1.setLimite(200);
        cc1.setSaldo(100);
        cc1.mostraDados();
        
        cc1.saca(10);
        cc1.mostraDados();
    }
}
