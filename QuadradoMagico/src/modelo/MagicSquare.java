package modelo;

import java.io.FileInputStream;
import java.util.Scanner;
class MagicSquare{
private int[][] square;
public MagicSquare(int size){
square = new int[size][size];
}
public int sumMagicRow(int row){
int sum = 0;
for (int i = 0; i<square.length; i++){
sum = sum + square[row][i];
}
return sum;
}
public int sumMagicCol(int col){
int sum = 0;
for (int i = 0; i<square.length; i++){
sum = sum + square[i][col];
}
return sum;
}
public int sumMagicDiagMain(){
int sum = 0;
for (int i = 0; i<square.length; i++){
sum = sum + square[i][i];
}
return sum;
}
public int sumMagicDiagRev(){
int sum = 0;
for (int i = 0; i<square.length; i++){
sum = sum + square[i][(square.length-1)-i];
}
return sum;
}
public boolean isMagicSquare(){
int sum = sumMagicRow(0);
for (int i = 1; i <square.length; i++){
if (sumMagicRow(i) != sum)
return false;
}
for (int i = 1; i <square.length; i++){
if (sumMagicCol(i) != sum)
return false;
}
if (sumMagicDiagMain() != sum)
return false;
if (sumMagicDiagRev() != sum)
return false;
return true;
}
public void printSquare(){
for (int i = 0; i<square.length; i++){
for (int j = 0; j<square.length; j++){
System.out.print(square[i][j] + " ");
}
System.out.println();
}
}
public void readSquare(Scanner scan){
for (int i = 0; i<square.length; i++){
for (int j = 0; j<square.length; j++){
square[i][j] = scan.nextInt();
}
}
}
}
