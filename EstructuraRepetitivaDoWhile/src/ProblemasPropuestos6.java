/*
 * 
 */

import java.util.Scanner;

public class ProblemasPropuestos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int A=0;
		char B='*';
		int C=0;
		System.out.println("Introduzca el numero de asteriscos que quiere que tenga el lado del cuadrado");
		A=teclado.nextInt();
			while(A<5 || A>20){
				System.out.println("Introduzca el numero de asterisco que quiere que tenga el lado del cuadrado");
			A=teclado.nextInt();
			}
			for(int i=0;i<A;i++){
				System.out.print(B);
				for(int j=0;j<(A-1);j++){
					System.out.print(B);
				}System.out.println();
			}
		}
	}

	
