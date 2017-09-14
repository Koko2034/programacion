/*
 * 10. Introduce una cantidad en euros y realiza su cambio a pesos, yen o dólares según indique la variable de tipo char cambio (´P´ o ´Y´ o ´D´) introducida por teclado.
 */
import java.util.Scanner;

public class ProblemasPropuestos10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		double A;
		
		System.out.println("Introduzca una cantidad economica");
		A=teclado.nextDouble();
		char B;
		teclado.nextLine();
		System.out.println("Introduzca el tipo de cambio que desea");
		System.out.println("P-Peso");
		System.out.println("Y-Yen");
		System.out.println("D-Dolares");
		B=teclado.nextLine().charAt(0);
		
		if(B=='P'){
			System.out.println(A + " euros son " + (A*17.02) + " pesos ");
		}
		else if(B=='Y'){
			System.out.println(A + " euros son " + (A*133) + " yen ");
		}else if (B=='D'){
			System.out.println(A + " euros son " + (A*1.22) + " dolares ");
		}
		
		
	
		
	}

}
