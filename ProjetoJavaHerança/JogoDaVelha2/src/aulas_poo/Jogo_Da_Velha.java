package aulas_poo;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.*;

class Jogo_Da_Velha {
  static Scanner input;
  static char [][] tabuleiro;
  static int jogada = 0, fila, coluna;
  static boolean vencedor = false, linhaValida, colunaValida;



  public static void infoGame(){
    System.out.println("JOGO DA VELHA:\n\n- Tabuleiro 3 X 3\n- 2 jogadores\n- Primeiro o X\n- Segundo o O");
  }

  public static void inicializandoTabuleiro(){
    for(int i = 0; i < tabuleiro.length; i++){
      for(int j = 0; j < tabuleiro[i].length; j++){
        tabuleiro[i][j] = ' ';
      }
    }
  }
  
  public static void mostrandoTabuleiro(){
    System.out.println("_"+tabuleiro[0][0]+"_|_"+tabuleiro[0][1]+"_|_"+tabuleiro[0][2]+"_");
    System.out.println("_"+tabuleiro[1][0]+"_|_"+tabuleiro[1][1]+"_|_"+tabuleiro[1][2]+"_");
    System.out.println(" "+tabuleiro[2][0]+" | "+tabuleiro[2][1]+" | "+tabuleiro[2][2]+" ");
  }

  public static void recebendoValores(){
    System.out.print("\nInforme a fila (1, 2 ou 3): ");
        fila = input.nextInt();
    System.out.print("Informe a coluna (1, 2 ou 3): ");
        coluna = input.nextInt();
  }

  public static boolean validarFila(int fil){
    if(fil >= 1 && fil <= 3){
      linhaValida = true;
    }else{
      linhaValida = false;
    
    }
    return linhaValida;
  }

  public static boolean validarColuna(int col){
    if(col >= 1 && col <= 3){
      colunaValida = true;
    }else{
      colunaValida = false;
    
    }
    return colunaValida;
  }

  public static boolean validarDesocupada(int fil, int col){
    if(tabuleiro[fil-1][col-1] == ' '){
      return true;
    }else{
      return false;

    }
  }
  
  public static boolean validarOcupada(int fil, int col){
    if(tabuleiro[fil-1][col-1] == 'X' || tabuleiro[fil-1][col-1] == 'O'){
      return false;
    }else{
      return true;

    }
  }



  public static void efetuarJogada(){
    
    int player = jogada;

    if(validarFila(fila)&&validarColuna(coluna)&&validarDesocupada(fila, coluna)&&validarOcupada(fila, coluna)){
  
    if(player % 2 == 0){
      jogada++;
      tabuleiro[fila-1][coluna-1] = 'X';
    }else{
      jogada++;
      tabuleiro[fila-1][coluna-1] = 'O';
    }

  }else{
      System.out.print("\nEndereço inválido ou  posição já ocupada...\n\n");
  }
  
  }

  

  public static void testarVencedor(){


      if(
         tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X'
      || tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X'
      || tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X'
      || tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X'
      || tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X'
      || tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X'
      || tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X'
      || tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X'
      ){
          JOptionPane.showMessageDialog(null, "☻ Vitória do jogador X  ");
          vencedor = true;

        
      }else if(
         tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O'
      || tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O'
      || tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O'
      || tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O'
      || tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O'
      || tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O'
      || tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O'
      || tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O'
      ){
          JOptionPane.showMessageDialog(null, " ☻ Vitória do jogador O ");
          vencedor = true;
          
      }else if(jogada == 9){
          JOptionPane.showMessageDialog(null, "Opa, temos um empate ☺");
          vencedor = true;
      }

      
    
    
  }
  

 
  public static void main(String[] args) {
  input = new Scanner (System.in);
  tabuleiro = new char [3][3];
  

     infoGame();
     inicializandoTabuleiro();
     System.out.print("\n");
     while(vencedor == false){
     mostrandoTabuleiro();
     recebendoValores();
        
     System.out.println("");
   
     efetuarJogada();
     testarVencedor();

    }

    System.out.println("\nResultado: ");
    mostrandoTabuleiro();



  }
}
