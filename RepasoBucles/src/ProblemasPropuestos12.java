/*
 * Escribe un programa que pinte por pantalla una pirámide hueca (se debe ver únicamente el
contorno hecho con asteriscos). La base de la pirámide debe estar formada por un número de
asteriscos ente 5 y 9
 */

import java.util.Scanner;

public class ProblemasPropuestos12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
		char inicio=' ';
		while(inicio!='s'){
		System.out.println("Desea inciar el programa");
		inicio=teclado.next().charAt(0);
		}
		int base=0;
		base=(int)(Math.random()*4+5);
		System.out.println("La base tendra " + base + " asteriscos");
		
		String B="* ";
		String C=" ";
		
		for(int i=0;i<=base-2;i++)System.out.print(C);
		System.out.println(B);
		for(int b=0;b<base-2;b++){
			for(int i=base-b-2;i>0;i--) {System.out.print(C);}
			System.out.print(B);
			for(int j=0;j<(b*2);j++) {System.out.print(C);}
			
			System.out.print(B);
			
			System.out.println();
			
}	for(int b=0;b<(base);b++)System.out.print(B);

		}
	}


