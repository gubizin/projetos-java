package testes;
import entidades.Figura;
import entidades.Circulo;
import entidades.Ponto;
import entidades.Quadrado;
import entidades.Retangulo;
import java.util.ArrayList;
import java.util.List;


public class Teste {

    public static void main(String[] args) {
         Ponto p = new Ponto();
         Circulo c = new Circulo();
         Retangulo r = new Retangulo();
         Quadrado q = new Quadrado();
         
        //Sets
         p.setnomeFigura("Ponto");
         c.setnomeFigura("Circulo");
         r.setnomeFigura("Retangulo");
         
         //desenhar
        /* p.desenhar();
         c.desenhar();
         r.desenhar();
         q.desenhar();
         */
         
         List<Figura> figuras = new ArrayList<Figura>();
         figuras.add(p);
         figuras.add(r);
         figuras.add(c);
         
         for(Figura figura: figuras){
             figura.desenhar();
             System.out.println("\n============================================\n");
         }
    }
    
}
