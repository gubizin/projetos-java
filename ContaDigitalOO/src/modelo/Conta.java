package modelo;

public class Conta {
    // Definindo as características (atributos ou propriedades) da classe
    private String titular;
    private String agencia;
    private int numero;
    private double saldo;
    private double limite;
    private String gerente;
    
    public static int qtd_cliente;
    
    public Conta(){
        qtd_cliente++;
    }
    
    // Definindo outro construtor da classe, diferente do construtor padrão
    public Conta(String titular, String agencia, int numero, double saldo, String gerente){     
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.gerente = gerente;
        calculaLimite();                
    }
    
    // Definindo os métodos getts e setts para os atributos
    public int getNumero(){
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getGerente() {
        return gerente;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    // Definindo os comportamentos da classe (métodos)
    // Definição da assinatura de um método:
    public boolean preencheCliente(String titular, String agencia, int numero, double saldo, String gerente){        
        if(titular.isEmpty()){
            return false;
        }
        
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.gerente = gerente;
        calculaLimite();
        
        return true;
    }
    
    public void imprimeSaldo(){
        System.out.println("Titular: "+titular);       
        System.out.println("Saldo: R$"+saldo);        
    }
    
    public void mostraDados(){
        System.out.println("Titular: "+titular);
        System.out.println("Agencia: "+agencia);
        System.out.println("Numero: "+numero);
        System.out.println("Saldo: R$"+saldo);
        System.out.println("Limite: R$"+limite);
        System.out.println("Gerente: "+gerente);
    }
    
    private void calculaLimite(){
        limite = saldo + saldo * 0.05;
    }
}