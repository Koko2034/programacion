import java.util.Scanner;



public class ProblemasPropuestos16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char A='n';
		Scanner teclado=new Scanner(System.in);
		int B;
		System.out.println("Desea conocer los multiplos de 8 hasta 200?(s/n)");
		A=teclado.next().charAt(0);
		while(A!='s'){
			System.out.println("Estas seguro?Desea conocer los multiplos de 8 hasta 200?(s/n)");
			A=teclado.next().charAt(0);
		}
		for(int i=8;i<=200;i=i+8){
			System.out.println(i);
		}
		
		
	}

}
