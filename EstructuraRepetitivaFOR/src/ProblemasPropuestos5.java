/*
 * Introducir N cadenas siendo N un nº aleatorio entre 1 y 10 y decir cuál es la
cadena de mayor longitud
 */

import java.util.Scanner;


public class ProblemasPropuestos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int A=0;
		String B="";
		String C="";
		System.out.println("Introduce el numero de frases que deseas introducir");
		A=teclado.nextInt();
		teclado.nextLine();
		
		for(int f=1;f<=A;f++){
			System.out.println("Introduzca una frase");
			B=teclado.nextLine();
			if(f==1){
				C=B;
			}else {
				if(B.length()>C.length()){
					C=B;
				}
				/*
				 * else if(B.compareToIgnoreCase(C)<0){
					C=C;
				}else if(B.compareToIgnoreCase(C)==0){
					C=C;
				}
				 */
			}
		}
		
		System.out.println("La frase de mayor longitud es " + C);
		
		
		
	}

}
