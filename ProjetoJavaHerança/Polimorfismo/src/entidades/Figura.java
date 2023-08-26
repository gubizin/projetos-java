
package entidades;


public class Figura {
    private String nomeFigura;
    
    public void setnomeFigura(String nomeFigura){
        this.nomeFigura = nomeFigura;
    }
    
    public void desenhar(){
        System.out.println("Sou a figura: " + nomeFigura);
    }
}
