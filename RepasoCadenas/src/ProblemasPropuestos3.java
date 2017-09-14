import java.util.Scanner;

public class ProblemasPropuestos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		String A;
		System.out.println("Introduzca una palabra");
		A=teclado.nextLine();
		int longitud=A.length();
		char Z;
		String C;
		for(int i=0;i<longitud;i++){
			
			Z=A.charAt(longitud-1);
			A=A.substring(0, longitud-1);
			A=Z+A;
			System.out.println(A);
			
			}
		}
	
	
	}


