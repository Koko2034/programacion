/*
 /* 5. Haz un programa que pregunte el nombre y los dos apellidos en una variable
y después escriba las iniciales seguida por un ‘.’ (El nombre será simple:
Pepe,Juan…)
 */
import java.util.Scanner;

public class ProblemasPropuestos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String A;
		char C;
		System.out.println("Introduzca su nombre y apellidos");
		A=teclado.nextLine();
		C=A.charAt(0);
		int D;
		D=A.indexOf(" ",1);
		
		char E;
		E=A.charAt(D+1);
		int F;
		F=A.indexOf(" ",D+1);
		char G;
		G=A.charAt(F+1);
		
		System.out.println("Su nombre es "+ C+","+E+","+G);
	}

}
