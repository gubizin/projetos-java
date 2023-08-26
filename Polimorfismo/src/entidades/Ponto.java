
package entidades;


public class Ponto extends Figura {
    @Override
    public void desenhar(){
        super.desenhar();
        System.out.println("Para me desenhar apenas como um ponto.");
    }
}
