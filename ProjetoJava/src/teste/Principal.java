package teste;

import java.util.Scanner;
import modelo.Cliente;
import modelo.Conta;
import modelo.Aleatorio;

public class Principal {
    public static void main(String[] args){
        System.out.println("Praticando o uso de classes em OO");
        
        Cliente cliente = new Cliente();
        
        //preenchendo campos do objeto cliente
        cliente.setNome("Gabriel");
        
        //recuperando campos do objeto cliente
        System.out.println(cliente.getNome());
        
        Cliente cl1 = new Cliente();
        cl1.setNome("Gabriel");
        cl1.setSobrenome("Cutrim Silva");
        cl1.setCpf("123456789-00");
        cl1.setEndereco("Rua das Flores");
        cl1.setRenda(1200);
        
        
        Conta c1 = new Conta();
        c1.setNome("Gabriel");
        c1.setSobrenome("Cutrim Silva");
        c1.setAgencia("0001");
        c1.setNumero("123456-01");
        c1.setSaldo(500);
        c1.setLimite(0);
        c1.sacar(450);
        c1.depositar(0);
        c1.imprimirExtrato();
        
        Aleatorio n1 = new Aleatorio();
        n1.Aleatorio();
        n1.imprimeNumero();
    }
}