/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author aluno
 */

    public class TesteClasseAbstrata {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();    
        ContaPoupanca cp = new ContaPoupanca();
        
        cc.setAgencia(1234);
        cc.setNumero(43569);
        cc.atualiza(0.02);
        
        cp.setAgencia(999);
        cp.setNumero(23233);
        cp.atualiza(0.002);
        
        cc.imprime();
        System.out.println("");
        cp.imprime();
    }
}

    

