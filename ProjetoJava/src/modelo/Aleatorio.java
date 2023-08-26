package modelo;

import java.util.Random;
public class Aleatorio {
    private int numero;
    
    public void Aleatorio(){
        this.Aleatorio(20);
    }
    
    public void Aleatorio(int max){
        Random rand1 = new Random();
        numero = rand1.nextInt(max);
    }
    
    public void Aleatorio(int n1, int n2){
        Random rand2 = new Random();
        numero = rand2.nextInt(n1);
        System.out.println("Numero sorteado: "+numero);
        numero = rand2.nextInt(n2);
        System.out.println("Numero sorteado: "+numero);
    }
    
    public void imprimeNumero(){
        System.out.println("Numero sorteado: "+numero);
    }
}
