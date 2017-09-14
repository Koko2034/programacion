/*
 * Muestra por pantalla todos los números primos entre 2 y 100,
ambos incluidos
 */

import java.util.Scanner;

public class ProblemasPropuestos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		char A='a';
		do{
		System.out.println("Quieres ver todos los numeros primos entre 2 y 100(s/n)");
		A=teclado.nextLine().charAt(0);}
		while(A!='s');
		int num;
		for(int i=2;i<=100;i++){
			boolean primo=true;
			for(int j=2;j<i;j++){
				
				int C;
				C=i%j;
				if(C==0){
					System.out.println("No es primo " + i);
					primo=false;
				}
			} 
			if(primo){
				System.out.println("el numero es primo " + i);
			}
		}
		
}
}