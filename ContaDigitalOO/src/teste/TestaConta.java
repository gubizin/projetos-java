package teste;

import java.util.ArrayList;
import java.util.List;
import modelo.Conta;
public class TestaConta {
    public static void main(String[] args){
        List<Conta> listaContas = new ArrayList();
        System.out.println("Total de contas do banco: "+Conta.qtd_cliente);
        System.out.println();
        
        Conta c1 = new Conta();
        if(c1.preencheCliente("Francisco Linhares", "0001", 123234, 450, "Gabriel")){
            System.out.println("Cadastro realizado com sucesso");
            c1.imprimeSaldo();
            System.out.println();
            System.out.println("Total de contas do banco: "+Conta.qtd_cliente);
            System.out.println();
        }else{
            System.out.println("Erro ao cadastrar cliente\n");
            Conta.qtd_cliente--;
        }
                       
        Conta c2 = new Conta();    
        if(c2.preencheCliente("Mariana Silva", "0002", 676767, 1245.12, "Lucas")){
            System.out.println("Cadastro realizado com sucesso");
            c2.imprimeSaldo();
            System.out.println();
            System.out.println("Total de contas do banco: "+Conta.qtd_cliente);
            System.out.println();
        }else{       
            System.out.println("Erro ao cadastrar cliente\n");
        }
               
        Conta c3 = new Conta();         
        if(c3.preencheCliente("Danielle Coelho", "0003", 983265, 2543.74, "Gabriel")){
            System.out.println("Cadastro realizado com sucesso");
            c3.imprimeSaldo();
            System.out.println();
            System.out.println("Total de contas do banco: "+Conta.qtd_cliente);
            System.out.println();
        }else{       
            System.out.println("Erro ao cadastrar cliente\n");
        }
                       
        // Implementação do ArrayList para guardar as contas do banco
        System.out.println("=========================================\n");
        System.out.println("Dados das contas criadas no banco\n");
        listaContas.add(c1);
        listaContas.add(c2);
        listaContas.add(c3);
        
        for(Conta c: listaContas){
            c.mostraDados();
            System.out.print("\n");
        }
    }    
}