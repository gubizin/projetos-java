package exercicio1p8;

import java.util.Scanner;
public class ContaBancariaSimplificada {
    String nomeDoCorrentista;
    float saldo;
    boolean contaEspecial;
    
    public String getNomeDoCorrentista(){
        return nomeDoCorrentista;
    }
    
    public void setNomeDoCorrentista(String nomeDoCorrentista){
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getContaEspecial(){
        return contaEspecial;
    }
    
    public void setContaEspecial(boolean contaEspecial){
        this.contaEspecial = contaEspecial;
    }
    
    public void abreConta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        nomeDoCorrentista = sc.nextLine();
        System.out.println("Saldo: ");
        saldo = sc.nextFloat();
        if(saldo < 0){
            saldo = 0;
        }
        System.out.println("A conta e especial?");
        contaEspecial = sc.nextBoolean();
    }
    
    public void deposita(float valor1){
        saldo += valor1;
    }
    
    public void retira(float valor2){
        if(contaEspecial == false){
            if(valor2 <= saldo){
                saldo -= valor2;
            }
        }else{
            saldo -= valor2;
        }
    }
    
    public void mostraDados(){
        System.out.println("\nNome do correntista: "+nomeDoCorrentista);
        System.out.println("Saldo: R$"+saldo);      
        }
    
    public void mostraDados(boolean mostraTipo){
        mostraDados();
        if(mostraTipo){
            if(contaEspecial){
            System.out.println("A conta e especial.");
        }else{
            System.out.println("A conta e comum.");
            }
        }
    }
}