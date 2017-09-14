import java.util.Scanner;

public class ProblemasPropuestos9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String B=" *";
		String C=" ";
		int A=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca la base de la piramide");
		A=teclado.nextInt();

		   for(int b=0;b<=A-1;b++){
			for(int i=0;i<=b;i++)System.out.print(C);
			for(int j=A-1-b;j>=0;j--)System.out.print(B);
			System.out.println();
		 
		 
	}
	
	


	   }

}
