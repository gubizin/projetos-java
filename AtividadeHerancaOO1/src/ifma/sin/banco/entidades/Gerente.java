package ifma.sin.banco.entidades;

public class Gerente extends Funcionario{
    String nivelGerencia;

    public String getNivelGerencia() {
        return nivelGerencia;
    }

    public void setNivelGerencia(String nivelGerencia) {
        this.nivelGerencia = nivelGerencia;
    }
    
    public void aumento(){
        this.salario += this.salario*0.15;
    }
    
    public void mostraDados(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("RG: "+rg);
        System.out.println("Salario: "+salario);
        System.out.println("Cargo: Gerente "+nivelGerencia);
    }
}