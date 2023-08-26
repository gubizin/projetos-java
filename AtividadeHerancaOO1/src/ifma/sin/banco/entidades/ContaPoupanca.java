package ifma.sin.banco.entidades;

public class ContaPoupanca extends Conta {
    double rendimento;

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
    public void adicionaRendimento(){
        this.saldo += this.saldo*rendimento;
    }
    
    public void mostraDados(){
        System.out.println("Saldo (Poupanca) com rendimento mensal: R$"+this.saldo);
    }
}