package ifma.sin.banco.entidades;

public class Funcionario {
    String nome;
    String cpf;
    String rg;
    double salario;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void aumento(){
        salario += salario*0.1;
    }
    
    public void mostraDados(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("RG: "+rg);
        System.out.println("Salario: "+salario);
    }
}
