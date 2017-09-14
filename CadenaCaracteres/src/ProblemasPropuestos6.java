/*
 /* 6. Introducir un verbo en infinitivo e indicar a que conjugación pertenece
 */
import java.util.Scanner;

public class ProblemasPropuestos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String A;
		int B;
		char C;
		char D;
		
		System.out.println("Introduzca un verbo en infinitivo");
		A=teclado.nextLine();
		B= A.length();
		C=A.charAt(B-1);
		D=A.charAt(B-2);
		 if(C=='r' && D=='a'){
			System.out.println("El verbo: " + A + " pertenece a la 1º conjugacion");
		}if (C=='r' && D=='e'){
			System.out.println("El verbo: " + A + " pertenece a la 2º conjugacion");
		}if (C=='r' && D=='i'){
			System.out.println("El verbo: " + A + " pertenece a la 3º conjugacion");
		}
		 
		
		
		
		
			
		
		
	}

}
