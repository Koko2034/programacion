/*
 * Realizar un programa que acumule (sume) valores ingresados por teclado hasta
ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o
menor a cero.
 */

import java.util.Scanner;

public class ProblemasPropuestos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		int A=0;
		int B=0;
		
		System.out.println("Introduzca un valor");
		A=teclado.nextInt();
		
		while(A!=9999){
			B=B+A;
			System.out.println("Introduzca un valor");
			A=teclado.nextInt();
		}
		if(B==0){
			System.out.println("La sumatoria de los numeros es 0");
		}else if (B>0){
			System.out.println("La sumatoria de los numeros es mayor que 0");
			System.out.println("La sumatoria de los numeros es " + B);
		}else if(B<0){
			System.out.println("La sumatoria de los numeros es menor que 0");
			System.out.println("La sumatoria de los numeros es " + B);
		}
	}

}
