package TesteHeranca;
import modelo.Funcionario;

public class TesteHeranca {
    public static void main(String args[]){
    Funcionario f1 = new Funcionario();
    f1.Funcionario("Rosangela", 100, 2);
    f1.exibeDados();
    
    Funcionario f2 = new Funcionario();
    
    Gerente g1 = new Gerente();
    f2 = new Gerente();
    
    g1.setNome("Rosangela");
    g1.setSalario(1000000);
    

}
}