/*
 * Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma
 */

import java.util.Scanner;


public class ProblemasPropuestos11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
		int num=0;
		int num2=0;
		
		System.out.println("Introduzca un numero por teclado");
		num=teclado.nextInt();
		System.out.println("Introduzca un segundo numero por teclado");
		num2=teclado.nextInt();
		int cociente=0;
		for(int i=num;i>num2;i--){
			cociente=i%num2;
			if(cociente!=0){
				System.out.println(i);
			}
		}
	}

}
