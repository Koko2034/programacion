/*
 * Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
a) La cantidad de valores ingresados negativos.
b) La cantidad de valores ingresados positivos.
c) La cantidad de múltiplos de 15.
d) El valor acumulado de los números ingresados que son pares.
 */

import java.util.Scanner;

public class ProblemasPropuestos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado=new Scanner(System.in);
		
		int A=0;//valores introducidos por teclado
		int E=0;//cantidad de numeros pares
		int H=0; // cantidad de numeros impares
		int G=0;//cantidad de numeros divisibles por 15
		int B=0;//sumatoria de numeros pares
		for(int f=1;f<=10;f++){
			System.out.println("Introduzca un valor");
			A=teclado.nextInt();
			if(A%2==0){
				E=E+1;
				B=B+A;
			}if(A%2!=0){
				H=H+1;
			}if(A%15==0){
				G=G+1;
			}
		}
		
		System.out.println("La cantidad de valores pares ingresados es " + E);
		System.out.println("La cantidad de valores impares ingresado es " + H);
		System.out.println("La cantidad de valores multiplos de 15 es " + G);
		System.out.println("La sumatoria de todos los numeros pares es " + B);
	}

}
