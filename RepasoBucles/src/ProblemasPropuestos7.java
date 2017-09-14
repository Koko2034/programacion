/*
 * Escribe un programa que lea un número N e imprima una pirámide
de números con N filas como en la siguiente figura:
 */

import java.util.Scanner;

public class ProblemasPropuestos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		int filas=0;
		System.out.println("Cuantas filas desea tener en la piramide?");
		filas=teclado.nextInt();
		String B=" *";
		String C=" ";
		
 
	
	
	 for(int b=0;b<=filas;b++){
			for(int i=filas-b;i>=0;i--) System.out.print(C);
			for(int j=1;j<b;j++) System.out.print(j);
			for(int j=b;j>0;j--)System.out.print(j);
			
			System.out.println();}
		
	}

}
