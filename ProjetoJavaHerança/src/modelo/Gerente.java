package modelo;

public class Gerente extends Funcionario{
    private String nomeSecretaria;
	
    public Gerente(String nome, double salario,int numeroDeDependentes, String nomeSecretaria){
        super(nome, salario, numeroDeDependentes);
        this.nomeSecretaria = nomeSecretaria;
    }
    
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Nome da secretaria: "+nomeSecretaria);
    }
	
    public String getNomeSecretaria(){
        return nomeSecretaria;
    }

    public void setNomeSecretaria(String nomeSecretaria){
        this.nomeSecretaria = nomeSecretaria;
    }
	
}