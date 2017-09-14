

/*
 * 4. Modifica el ejercicio 5 , de la lista de cadenas : Haz un programa que pregunte el
nombre y los dos apellidos en una variable y después escriba las iniciales seguida por
un ‘.’ , controla que la cadena introducida no este vacía, en ese caso volverás a pedir
otra, y se podrán introducir nombres compuestos
 */
import java.util.Scanner;


public class ProblemasPropuestos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String A;
	
		System.out.println("Introduzca su nombre y apellidos");
		A=teclado.nextLine();
	
		while(A.isEmpty()){
			System.out.println("Vuelva a intentarlo");
			A=teclado.nextLine();	
			
		}
		int C;
		C=0;
		int D;
		D=A.lastIndexOf(" ");
		String E;
		E=A.charAt(0)+".";
		
		while(C!=D){
			C=A.indexOf(" ",C+1);
			E=E+A.charAt(C+1)+".";
		}
		System.out.println(E);
	}

}


