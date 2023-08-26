/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lampadatresestados;

/**
 *
 * @author Rosangela
  
 */

public class LampadaTresEstados {

  public class Lampada { 
  //Variavel booleana, Verdadeiro / Falso
  private boolean estadoDaLampada;

  //Classe principal 
  public Lampada(boolean x) { 
    this.estadoDaLampada = x; 
  } 

  //Metodo Acende Lampada 
  public void acende(){ 
    this.estadoDaLampada=true; 
  } 

  //Metodo Apaga Lampada 
  public void apaga(){ 
    this.estadoDaLampada=false; 
  } 

  //Metodo Mostra Resultado 
  public void mostraResultado(){ 
    //Se o estado da lampada for Verdadeiro
    if(this.estadoDaLampada){ 
      System.out.printf("\n\nA lampada esta acessa!\n\n");
    } 
    else{ 
      System.out.printf("\n\nA lampada esta apagada!\n\n");
    } 
  } 
}
        


