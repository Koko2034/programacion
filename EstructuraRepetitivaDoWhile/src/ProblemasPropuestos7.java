import java.util.Scanner;

public class ProblemasPropuestos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado=new Scanner(System.in);
		
		int A=0;
		char B='*';
		char C=' ';
		System.out.println("Introduzca el numero de asteriscos que quiere que tenga el lado del cuadrado");
		A=teclado.nextInt();
			while(A<5 || A>20){
				System.out.println("Introduzca el numero de asterisco que quiere que tenga el lado del cuadrado");
			A=teclado.nextInt();
			}
			
			
			for(int j=0;j<A;j++){
				System.out.print(B);}
			System.out.println();
			for(int i=0;i<A-2;i++){
				System.out.print(B);
				for(int j=0;j<(A-2);j++){
					System.out.print(C);}
			System.out.println(B);}
			for(int j=0;j<A;j++){
				System.out.print(B);}
				
				
				
			 
				
				
			}
	}


