package teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Aluno;
import modelo.Aula;
import modelo.Disciplina;
import modelo.Professor;

public class AulaTeste{
    public static void main(String[] args) {
        
        // criando os objetos alunos
        Aluno a1 = new Aluno();
        a1.setMatricula("548CD3");
        a1.setNome("Francisco");
        a1.setNota1(8);
        a1.setNota2(6);
        
        Aluno a2 = new Aluno();
        a2.setMatricula("8989EW12");
        a2.setNome("Mariana");
        a2.setNota1(9);
        a2.setNota2(4);
        
        Aluno a3 = new Aluno();
        a3.setMatricula("JKJK898");
        a3.setNome("Paola");
        a3.setNota1(5.6);
        a3.setNota2(9);
        
        // criando a disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setNome("História");
        disciplina.setEmenta("História da Grécia e História do Brasil");
        disciplina.setCargaHoraria(40);
        
        Professor professor = new Professor();
        professor.setNome("Jenival");
        professor.setMatricula("87878JHKH");
        professor.setAreaFormacao("História Natural");     
           
        // criando a aula
        Aula aula = new Aula();
        aula.setDisciplina(disciplina);
        aula.setProfessor(professor);
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        aula.setAlunos(alunos);
        
        /*
        aula.adicionaAluno(a1);
        aula.adicionaAluno(a2);
        aula.adicionaAluno(a3);
        */
        
        Date data = new Date();
        aula.setDataAula(data);
        
        aula.setConteudo("Introdução à História Antiga");
        
        // imprimindo a aula
        aula.imprimeAula();
    }
}