package ifma.sin.banco.entidades;

public class Conta {
    Cliente titular;
    int numConta;
    double saldo;

    public Cliente getTitular() {
        return titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void saca(double valor){
        if(valor >= saldo){
            saldo = 0;
        }else{
            saldo -= valor;
        }
    }
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    public void transfere(double valor){
        if(valor >= saldo){
            saldo = 0;
        }else{
            saldo -= valor;
        }
    }
    
    public void mostraDados(){
        System.out.println("Titular: "+titular);
        System.out.println("Nº da conta: "+numConta);
        System.out.println("Saldo: "+saldo);
    }
}
