package ifma.sin.banco.entidades;

public class ContaCorrente extends Conta {
    double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void saca(double valor){
        if(valor <= limite){
            this.saldo -= valor + 0.20;
        }else{
            System.out.println("Saldo insuficiente ou limite excedido");
        }
    }
    
    public void transfere(double valor){
        if(valor <= limite){
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente ou limite excedido");
        }
    }
    
    public void mostraDados(){
        System.out.println("Saldo (Corrente): R$"+this.saldo);
    }
}
