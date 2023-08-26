package exercicio1p29;

public class Empregado {
    String nome;
    String departamento;
    int horasTrabalhadasNormais;
    int horasExtras;
    double salarioPorHoraNormal;
    double salarioPorHoraExtra;
    double salarioHorasNormais;
    double salarioHorasExtras;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public int getHorasTrabalhadasNormais(){
        return horasTrabalhadasNormais;
    }
    
    public void setHorasTrabalhadasNormais(int horasTrabalhadasNormais){
        this.horasTrabalhadasNormais = horasTrabalhadasNormais;
    }
    
    public int getHorasExtras(){
        return horasExtras;
    }
    
    public void setHorasExtras(int horasExtras){
        this.horasExtras = horasExtras;
    }
    
    public double getSalarioPorHoraNormal(){
        return salarioPorHoraNormal;
    }
    
    public void setSalarioPorHoraNormal(double salarioPorHoraNormal){
        this.salarioPorHoraNormal = salarioPorHoraNormal;
    }
    
    public double getSalarioPorHoraExtra(){
        return salarioPorHoraExtra;
    }
    
    public void setSalarioPorHoraExtra(double salarioPorHoraExtra){
        this.salarioPorHoraExtra = salarioPorHoraExtra;
    }
    
    public void calculaSalarioHorasNormais(){
        if(departamento == "Diretoria"){
            salarioHorasNormais = (horasTrabalhadasNormais * salarioPorHoraNormal) + (salarioPorHoraNormal * 0.1);
        }else{
            salarioHorasNormais = horasTrabalhadasNormais * salarioPorHoraNormal;
        }
    }
    
    public void calculaSalarioHorasExtras(){
        if(departamento == "Diretoria"){
            salarioHorasExtras = (horasExtras * salarioPorHoraExtra) + (salarioPorHoraExtra * 0.1);
            }else{
                salarioHorasExtras = horasExtras * salarioPorHoraExtra;
        }
    }
    
    public void mostraDados(){
        System.out.println("Nome do empregado: "+nome);
        System.out.println("Departamento: "+departamento);
        System.out.println("Salario por horas normais: R$"+salarioHorasNormais);
        System.out.println("Salario por horas extras: R$"+salarioHorasExtras);
        System.out.println("\n");
    }
}