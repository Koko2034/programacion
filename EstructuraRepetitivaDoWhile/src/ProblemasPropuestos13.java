import java.util.Scanner;


public class ProblemasPropuestos13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String A;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una palabra");
		A=teclado.nextLine();
		int B;
		B=A.length();
		char Z='2';
		String C="";
		while(B>15){System.out.println("Introduce una palabra");
		A=teclado.nextLine();
			}
		for(int i=0;i<B;i++){
			Z=A.charAt(i);
			if(Z=='a' || Z=='e' ||Z=='i' ||Z=='o' ||Z=='u' ){
				C=C+Z;
			}
			
		}System.out.println(C);
		
	}

}
