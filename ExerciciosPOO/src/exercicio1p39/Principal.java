package exercicio1p39;

public class Principal {
    public static void main(String[] args){
        RegistroAcademico2 a1 = new RegistroAcademico2();
        a1.setNomeDoAluno("Gabriel Cutrim");
        a1.setNumeroDaMatricula("2022127350006");
        a1.setDataDeNascimento("18/12/2004");
        a1.setTurno("Diurno");
        a1.setÉBolsista("Sim");
        a1.setTipoDaBolsa(1);
        a1.bolsa30Porcento();
        a1.bolsa70Porcento();
        a1.bolsa100Porcento();
        a1.descontoTurno();
        a1.setAnoDaMatricula(2022);
        a1.mostraRegistro();
        
        RegistroAcademico2 a2 = new RegistroAcademico2();
        a2.setNomeDoAluno("Rosangela oliveira");
        a2.setNumeroDaMatricula("2022127350005");
        a2.setDataDeNascimento("30/11/1986");
        a2.setTurno("Noturno");
        a2.setÉBolsista("Não");
        a2.setTipoDaBolsa(3);
        a2.bolsa30Porcento();
        a2.bolsa70Porcento();
        a2.bolsa100Porcento();
        a2.descontoTurno();
        a2.setAnoDaMatricula(2022);
        a2.mostraRegistro();
    }
}

