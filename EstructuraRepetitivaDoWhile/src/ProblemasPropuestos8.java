import java.util.Scanner;

public class ProblemasPropuestos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner teclado=new Scanner(System.in);
int A=0;

System.out.println("Introduzca el tamaño de la base");
A=teclado.nextInt();
			String B="* ";
		String C=" ";
		String D="* ";
		
		for(int i=0;i<=A-2;i++)System.out.print(C);
		System.out.println(B);
		for(int b=0;b<A-2;b++){
			for(int i=A-b-2;i>0;i--) {System.out.print(C);}
			System.out.print(B);
			for(int j=0;j<(b*2);j++) {System.out.print(C);}
			
			System.out.print(B);
			
			System.out.println();
			
}	for(int b=0;b<(A);b++)System.out.print(B);

	}

}
