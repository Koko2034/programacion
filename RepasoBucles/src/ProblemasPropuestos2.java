/*
 * Realiza un programa que sume los 100 números siguientes a un número
entero y positivo introducido por teclado. Se debe comprobar que el
dato introducido es correcto (que es un número positivo).
 */

import java.util.Scanner;

public class ProblemasPropuestos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		int A=-2;
		int B=0;
	
		while(A<0){
	System.out.println("Introduce un valor numerico positivo");
	A=teclado.nextInt();
		}
	for(int i=0;i<100;i++){
		A++;
		B=B+A;
	}
	System.out.println("La sumatoria de los 100 numeros siguientes a nuestro numero es "+ B);
	}

}
