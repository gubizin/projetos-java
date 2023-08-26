package ifma.sin.banco.entidades;

public class Cliente {
    String nome;
    String rg;
    int anoNasc;

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public void mostraDados(){
        System.out.println("Nome: "+nome);
        System.out.println("RG: "+rg);
        System.out.println("Data de nascimento: "+anoNasc);
    }
}