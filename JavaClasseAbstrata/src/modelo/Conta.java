/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aluno
 */
    public abstract class Conta {
    private int agencia;
    private int numero;
    private double taxa;
    
    // na classe abstrata, definimos apenas a assinatura de um método abstrato.
    public abstract void atualiza(double taxa);
    
    // na classe abstrata, definimos um método comum como em qualquer
    // outra classe
    public void imprime(){
        System.out.println("Agencia: " agencia  
                            "\nNúmero da conta: "   numero  
                            "\nTaxa: "   taxa);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
    

