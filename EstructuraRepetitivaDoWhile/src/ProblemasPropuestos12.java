import java.util.Scanner;

public class ProblemasPropuestos12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		String A;
		String B;
		int D;
		int C=0;
		System.out.println("Introduzca una palabra");
		A=teclado.nextLine();
		D=A.length();
		//System.out.println(A.charAt(0));
		do{
			B=A.substring(0, C);
			System.out.println(B);
			C++;
		}while((D+1)!=C);
	}

}
