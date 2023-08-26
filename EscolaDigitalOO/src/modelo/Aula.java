package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;
    private String conteudo;
    private Date dataAula;
    
    
    public Aula(){
        alunos = new ArrayList<>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getDataAula() {
        return dataAula;
    }

    public void setDataAula(Date dataAula) {
        this.dataAula = dataAula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
           
    public void imprimeAula(){
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Data da aula: " + dataAula);
        
        System.out.println("\nAlunos");
        for (Aluno aluno : alunos) {
            System.out.println("\nMatrícula: "+aluno.getMatricula());
            double n1 = aluno.getNota1();
            double n2 = aluno.getNota2();
            System.out.println("Nome: " + aluno.getNome());
            
            System.out.println("Nota 1: "+n1);
            System.out.println("Nota 2: "+n1);
            
            System.out.println("Média: " + (n1 + n2)/2);
        }
    }
}