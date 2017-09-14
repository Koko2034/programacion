/*
 * 1. Introduce una palabra y una vocal y sustituye todas las vocales por la que
has introducido por ej. palabra=”papel” vocal =’o’ y nos devuelve “popol”
 */
import java.util.Scanner;

public class ProblemasPropuestos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
String A;
String B;
char C;

System.out.println("Introduzca una palabra");
A=teclado.nextLine();
System.out.println("Introduzca una vocal");
B=teclado.nextLine();
C=B.charAt(0);
System.out.println("Tu nueva palabra es " + A.replace('a', C).replace('e', C).replace('i', C).replace('o',C).replace('u', C));
	}

	
		
	}


