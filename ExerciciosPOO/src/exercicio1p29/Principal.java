package exercicio1p29;

public class Principal {
    public static void main(String[] args){
        Empregado p1 = new Empregado();
        p1.setNome("Gabriel");
        p1.setDepartamento("Gestao de custos");
        p1.setHorasTrabalhadasNormais(30);
        p1.setHorasExtras(5);
        p1.setSalarioPorHoraNormal(133.65);
        p1.setSalarioPorHoraExtra(56.35);
        p1.calculaSalarioHorasNormais();
        p1.calculaSalarioHorasExtras();
        p1.mostraDados();
        
        Empregado p2 = new Empregado();
        p2.setNome("Lucas");
        p2.setDepartamento("Diretoria");
        p2.setHorasTrabalhadasNormais(30);
        p2.setHorasExtras(5);
        p2.setSalarioPorHoraNormal(133.65);
        p2.setSalarioPorHoraExtra(56.35);
        p2.calculaSalarioHorasNormais();
        p2.calculaSalarioHorasExtras();
        p2.mostraDados();
    }
}