package exercicio1p38;

public class RegistroAcademico {
    String nomeDoAluno;
    String numeroDaMatricula;
    String dataDeNascimento;
    String éBolsista;
    int tipoDaBolsa;
    int anoDaMatricula;
    double mensalidade = 400;
    
    public String getNomeDoAluno(){
        return nomeDoAluno;
    }
    
    public void setNomeDoAluno(String nomeDoAluno){
        this.nomeDoAluno = nomeDoAluno;
    }
    
    public String getNumeroDaMatricula(){
        return numeroDaMatricula;
    }
    
    public void setNumeroDaMatricula(String numeroDaMatricula){
        this.numeroDaMatricula = numeroDaMatricula;
    }
    
    public String getDataDeNascimento(){
        return dataDeNascimento;
    }
    
    public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getÉBolsista(){
        return éBolsista;
    }
    
    public void setÉBolsista(String éBolsista){
        this.éBolsista = éBolsista;
    }
    
    public int getTipoDaBolsa(){
        return tipoDaBolsa;
    }
    
    public void setTipoDaBolsa(int tipoDaBolsa){
        this.tipoDaBolsa = tipoDaBolsa;
    }
    
    public int getAnoDaMatricula(){
        return anoDaMatricula;
    }
    
    public void setAnoDaMatricula(int anoDaMatricula){
        this.anoDaMatricula = anoDaMatricula;
    }
    
    public void bolsa30Porcento(){
        if(éBolsista == "Sim"){
            if(tipoDaBolsa == 1){
                mensalidade -= (mensalidade * 0.3);
            }
        }
    }
    
    public void bolsa70Porcento(){
        if(éBolsista == "Sim"){
            if(tipoDaBolsa == 2){
                mensalidade -= (mensalidade * 0.7);
            }
        }
    }
    
    public void bolsa100Porcento(){
        if(éBolsista == "Sim"){
            if(tipoDaBolsa == 3){
                mensalidade -= mensalidade;
            }
        }
    }
    
    public void mostraRegistro(){
        System.out.println("Nome do aluno: "+nomeDoAluno);
        System.out.println("Numero da matricula: "+numeroDaMatricula);
        System.out.println("Data de nascimento: "+dataDeNascimento);
        if(éBolsista == "Sim"){
            System.out.println("O aluno eh bolsista");
        }else{
            System.out.println("O aluno nao eh bolsista");
        }
        System.out.println("Ano da matricula: "+anoDaMatricula);
        if(mensalidade == 0){
            System.out.println("O aluno possui bolsa 100%");
        }else{
        System.out.println("Mensalidade: R$"+mensalidade+"\n");
        }
    }   
}