package modelo;

public class Conta {
    protected String nome;
    private String sobrenome;
    String titular;
    private String agencia;
    public String numero;
    private double saldo = 400;
    double limite = 100;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = titular;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getAgencia(){
        return agencia;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getLimite(){
        return limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    public void sacar(double valor1){
        if(saldo > 0 && limite > valor1){
            saldo -= valor1;
        }else{
            System.out.println("Não foi possível realizar o saque.");
        }
    }
    
    public void depositar(double valor2){
        if(saldo > -1){
            saldo += valor2;
            limite += valor2;
        }
    }
    
    public void imprimirExtrato(){
        System.out.println("Nome do titular: "+nome+" "+sobrenome);
        System.out.println("Agencia: "+agencia);
        System.out.println("Numero da conta: "+numero);
        System.out.println("Saldo: R$"+saldo);
        System.out.println("Limite: R$"+limite);
    }
    
}