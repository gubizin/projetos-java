package modelo;

import java.io.FileInputStream;
import java.util.Scanner;
import modelo.MagicSquare;
public class MagicSquareTest{
public static void main(String[] args){
try {
FileInputStream fin = new FileInputStream("Magic.txt");
Scanner sc = new Scanner(fin);
int count = 1;
int size = sc.nextInt();
while(size != -1){
MagicSquare s = new MagicSquare(size);
s.readSquare(sc);
System.out.println("***** Square " + count + " ******");
s.printSquare();
System.out.println("***** Square " + count + " ******\n");
for (int i = 0; i<size; i++){
System.out.println("Sum of row " + i + " is: " + s.sumMagicRow(i));
}
for (int i = 0; i<size; i++){
System.out.println("Sum of column " + i + " is: " + s.sumMagicCol(i));
}
System.out.println("The sum of main diagonal is : " + s.sumMagicDiagMain());
System.out.println("The sum of other diagonal is : " + s.sumMagicDiagRev());
System.out.println("Is it a magic aquare: " + s.isMagicSquare());
size = sc.nextInt();
count++;
}
}
catch(Exception e){
e.printStackTrace();
}
}
}