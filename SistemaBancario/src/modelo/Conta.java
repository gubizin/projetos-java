package modelo;

public class Conta{
    String nome;
    private double saldo;
    boolean contaEspecial;
    
    public String getNome(){
        return nome;
    } 
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public boolean getContaEspecial(){
        return contaEspecial;
    }
    
    public void setContaEspecial(boolean contaEspecial){
        this.contaEspecial = contaEspecial;
    }
    
    public void saca(double valor){
        this.saldo -= valor;
    }
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void mostraDados(){
        System.out.println("\nNome: "+nome);
        System.out.println("Saldo: R$"+saldo);      
    }
}