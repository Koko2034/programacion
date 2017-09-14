/*
 * Escribe un programa que permita ir introduciendo una serie
indeterminada de números mientras su suma no supere el valor 10000.
Cuando esto último ocurra, se debe mostrar el total acumulado, el
contador de los números introducidos y la media.
 */

import java.util.Scanner;

public class ProblemasPropuestos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
		int A=0;
		int B=A;
		int C=0;
	do{
		System.out.println("Introdusca un valor");
		A=teclado.nextInt();
		B=B+A;
		C++;
	}while(B<1000);
	
	System.out.println("La cantidad de numeros introducidos es " + C);
	System.out.println("La cantidad total acumulada es " + B);
	System.out.println("La media es " + (B/C));
	
	
	}

}
