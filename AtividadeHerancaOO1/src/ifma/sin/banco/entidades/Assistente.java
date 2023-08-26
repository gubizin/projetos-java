package ifma.sin.banco.entidades;

public class Assistente extends Funcionario{
    String nivelAssistente;
    String turno;

    public String getNivelAssistente() {
        return nivelAssistente;
    }
    
    public String getTurno(){
        return turno;
    }

    public void setNivelAssistente(String nivelAssistente) {
        this.nivelAssistente = nivelAssistente;
    }
    
    public void setTurno(String turno){
        this.turno = turno;
    }
    
    public void aumento(){
        if(("Tecnico").equals(nivelAssistente)){
            this.salario += salario*0.1;
        }else{
            if(("Administrativo").equals(nivelAssistente)&&("Noturno").equals(turno)){
                this.salario += this.salario*0.15;
            }
        }
    }
    
    public void mostraDados(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("RG: "+rg);
        System.out.println("Salario: "+salario);
        System.out.println("Cargo: Assistente "+nivelAssistente);
    }
}