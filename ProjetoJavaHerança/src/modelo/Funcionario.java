package modelo;

public class Funcionario {
    private String nome;
    private double salario;
    private int numeroDeDependentes;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes){
        this.numeroDeDependentes = numeroDeDependentes;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumeroDeDependentes(){
        return numeroDeDependentes;
    }
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, double salario, int numeroDeDependentes){
        this.nome = nome;
        this.salario = salario;
        this.numeroDeDependentes = numeroDeDependentes;
    }
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void exibeDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario: R$"+salario);
        System.out.println("Numero de dependentes: "+numeroDeDependentes);
    }
}