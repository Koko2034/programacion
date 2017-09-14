/*
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que
hay entre 1 y un número leído por teclado
 */

import java.util.Scanner;

public class ProblemasPropuestos9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		int num=0;
		
		System.out.println("introduzca un numero por teclado");
		
		num=teclado.nextInt();
		int cociente;
		int suma=0;
		for(int i=1;i<num;i++){
			cociente=i%3;
			if(cociente==0){
				System.out.println(i);
				suma=suma+i;
			}
			
		}System.out.println("La sumatoria es " + suma);
	}

}
