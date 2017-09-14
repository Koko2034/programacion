/*
 * Igual que el programa anterior, pero esta vez la pirámide debe aparecer invertida, con el vértice
hacia abajo
 */

import java.util.Scanner;

public class ProblemasPropuestos13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String B=" *";
		String C=" ";
		int A=0;
		char inicio=' ';
		Scanner teclado=new Scanner(System.in);
		while(inicio!='s'){
		System.out.println("Desea iniciar el programa");
		inicio=teclado.next().charAt(0);
		}
		
		A=(int)(Math.random()*4+5);
		System.out.println(A);
	
		for(int k=0;k<A;k++)System.out.print(B);
		System.out.println();
		for(int b=1;b<A;b++){
				for(int i=0;i<b;i++)System.out.print(C);
				System.out.print(B);
				for(int j=A-2;j>b;j--) {System.out.print(C);}
				for(int j=A-2;j>b;j--) {System.out.print(C);}
				System.out.println(B);
				
			 
			 
		}
	}

}
