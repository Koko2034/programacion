/*
 * Escribe un programa que pinte por pantalla una pir�mide rellena a base de
asteriscos. La base de la pir�mide debe estar formada por 9 asteriscos.
 */

import java.util.Scanner;

public class ProblemasPropuestos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String B="* ";
		String C=" ";
		
	
for(int b=0;b<9;b++){
	for(int i=9-b;i>=0;i--) System.out.print(C);
	for(int j=0;j<=b;j++) System.out.print(B);
	
	System.out.println();
	
}		

	}

}
		
		

	


