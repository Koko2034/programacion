/*/
 * 
 */

import java.util.Scanner;


public class ProblemasPropuestos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int A=0;
		int B=0;
		int C=0;
		double D=0; // el area
		do{
			System.out.println("Escoja una de las siguientes opciones(1.2.3.0)");
			System.out.println("1.Area del circulo");
			System.out.println("2.Area del rectangulo");
			System.out.println("3.Area del triangulo");
			System.out.println("0.Salir");
			A=teclado.nextInt();
			if(A==1){
				System.out.println("Introduzca el valor del radio");
				B=teclado.nextInt();
				D=(Math.PI*Math.pow(B, 2));
						System.out.println("El area del circulo es " + D);
			}else if(A==2){
				System.out.println("Introduzca el valor de la base");
				B=teclado.nextInt();
				System.out.println("Introduzca el valor de la altura");
				C=teclado.nextInt();
				D=B*C;
				System.out.println("El area del rectangulo es " + D);
			}else if(A==3){
				System.out.println("Introduzca el valor de la base");
				B=teclado.nextInt();
				System.out.println("Introduzca el valor de la altura");
				C=teclado.nextInt();
				D=(B*C)/2;
				System.out.println("El area del triangulo es " + D);
			}
		}while(A!=0);
	System.out.println("Ha finalizado el programa");
	}

}
