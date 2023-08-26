package modelo;

public class Funcionario {
	private String nome; 
	private double salario;
	private int numeroDeDependentes;
        
         public Funcionario(){
         }
        public Funcionario(String nome, double salario, int numeroDeDependentes= numeroDeDependentes){
            this.nome = nome;
            this.salario = salario;
            this.numeroDeDependentes = numeroDeDependentes;
            
            
        }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) {
        this.numeroDeDependentes = numeroDeDependentes;
        
         }
        
        
        public  Funcionario(String nome, double salario, int numeroDeDependente){
            this.nome = nome;
            this.salario = salario;
            this.numeroDeDependentes = numeroDeDependente;
        }
            
            public void exibeDados(){
                System.out.println ("Nome:" + nome);
                System.out.println ("Salario:"+salario);
                System.out.println ("numeroDeDependentes: "+numeroDeDependentes);
                
            }
}