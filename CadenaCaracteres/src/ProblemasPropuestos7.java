/*
 /*
 7. Realizar un programa que pide al usuario la ruta absoluta donde se
encuentra un fichero (no tiene que ser real ya que no se comprobará) y,
muestre en pantalla por un lado el nombre del archivo y por otro la ruta
absoluta del directorio donde se encuentra.
 */
import java.util.Scanner;

public class ProblemasPropuestos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		String A;
		
		System.out.println("Introduzca la ruta de un archivo");
		A=teclado.nextLine();
		int B;
		B=A.length();
		int C;
		C=A.lastIndexOf("/",B-1);
		String D=A.substring(C+1,B);
		String E=A.substring(0,C);
		System.out.println("El nombre del archivo es " + D);
		System.out.println("La direccion absoluta del archivo es" + E);
		
		

	}

}
