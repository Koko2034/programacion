import java.util.Scanner;

public class ProblemasPropuestos15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		char A;
		System.out.println("Desea iniciar el programa?(s/n)");
		A=teclado.next().charAt(0);
		int B=0;
		while(A!='s'){
			System.out.println("Desea iniciar el programa?(s/n)");
			A=teclado.next().charAt(0);
		}
		
		for(int i=1;i<=25;i++){
			B=11*i;
			System.out.println(B);
		}
	}

}
