/*
 * 1. Escribir un programa para jugar a adivinar un número entre 1 y 10 (generado al azar
por el ordenador) hasta acertarlo, decir en cuantas veces se ha acertado.
 */

import java.util.Scanner;

public class ProblemasPropuestos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
	int A;//Mi numero
	int B;//el numero que se genera
	int C;//Acumulador
	B=(int)(Math.random()*10+1);
	A=0;
	C=1;
	while (A!=B){
		System.out.println("Introduzca un valor entre 1 y 10");
		A=teclado.nextInt();
		C=1+C;
	}	
	
	System.out.println("Ha acertado");
	}

}
