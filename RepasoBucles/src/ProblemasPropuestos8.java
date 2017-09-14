/*
 * Realiza un programa que pida un número por teclado y que luego
muestre ese número al revés.
 */

import java.util.Scanner;

public class ProblemasPropuestos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		int numero=0;
		
			System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		
		String num="";
		num=Integer.toString(numero);
		int longitud=0;
		longitud=num.length();
		for(int i=longitud-1;i>=0;i--){
			char letra='a';
			letra=num.charAt(i);
			System.out.print(letra);
		}
	
	}

}
