/*
 * Realiza el factorial de un número
 */

import java.util.Scanner;

public class ProblemasPropuestos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int H;
		int A;//Producto factorial
		A=1;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un numero");
		H=teclado.nextInt();
		for(int f=H;f>=1;f--){
			A=A*f;
		}
		System.out.println("El producto factorial del numero " + H + " es " + A);
	}

}
