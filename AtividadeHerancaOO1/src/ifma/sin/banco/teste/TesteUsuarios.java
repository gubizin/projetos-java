package ifma.sin.banco.teste;

import ifma.sin.banco.entidades.Cliente;
import ifma.sin.banco.entidades.Conta;
import ifma.sin.banco.entidades.ContaCorrente;
import ifma.sin.banco.entidades.ContaPoupanca;
import ifma.sin.banco.entidades.Funcionario;
import ifma.sin.banco.entidades.Gerente;
import ifma.sin.banco.entidades.Assistente;
public class TesteUsuarios {
    public static void main(String[] args){
        Cliente c1 = new Cliente();
        c1.setNome("Gabriel Cutrim");
        c1.setRg("123456789");
        c1.setAnoNasc(2002);
        c1.mostraDados();
        
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setTitular(c1);
        cc1.setNumConta(123456);
        cc1.setSaldo(1000);
        cc1.setLimite(600);
        cc1.saca(500);
        cc1.deposita(0);
        cc1.transfere(0);
        cc1.mostraDados();
        
        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setTitular(c1);
        cp1.setSaldo(500);
        cp1.setRendimento(0.02);
        cp1.adicionaRendimento();
        cp1.mostraDados();
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Lucas Moura");
        f1.setCpf("987654321");
        f1.setRg("654321");
        f1.setSalario(1212.54);
        f1.aumento();
        f1.mostraDados();
        
        Gerente g1 = new Gerente();
        g1.setNome("Maria Clara");
        g1.setNivelGerencia("da Reposicao");
        g1.setCpf("159753852");
        g1.setRg("753741");
        g1.setSalario(2504.78);
        g1.aumento();
        g1.mostraDados();
        
        Assistente a1 = new Assistente();
        a1.setNome("Alan Carvalho");
        a1.setNivelAssistente("Administrativo");
        a1.setTurno("Noturno");
        a1.setCpf("369852147");
        a1.setRg("456987");
        a1.setSalario(2100.47);
        a1.aumento();
        a1.mostraDados();
    }
}
