package modelo;

public class ContaCorrente extends Conta{
    double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void saca(double valor){
        if(this.getSaldo() >= 0){
        double desconto = this.getSaldo()*0.01;
        double valorSaque = this.getSaldo() - valor - desconto;       
        this.setSaldo(valorSaque);
    }else{
            if(limite > 0){
                double desconto = limite*0.01;
                
            }
        }
    }
    public void deposita(double valor){
        double valorDeposito = this.getSaldo() + valor;
        this.setSaldo(valorDeposito);
    }
}
