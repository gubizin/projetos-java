package teste;

import modelo.Funcionario;
import modelo.Gerente;
public class TesteHerança {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        f1.Funcionario("Gabriel", 1254.25, 1);
        f1.exibeDados();
        
        Gerente g1 = new Gerente();
        g1.setNomeSecretaria("Paula Tejano");
        g1.exibeDados();
    }
}
