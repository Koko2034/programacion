import java.util.Scanner;

public class ProblemasPropuestos11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char A=' ';
		int B=0;//dado 1
		int C=0; // dado 1
		int D=0;// numero de tiradas
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Desea que comience las tiradas?(s/n)");
		A=teclado.next().charAt(0);
		do{
			B=(int)(Math.random()*(6+1));
			C=(int)(Math.random()*(6+1));
			D++;
		}while(B!=C);
		System.out.println("El numero de tiradas ha sido " + D);
		System.out.println("El valor de la tirada cuando los dos dados han sacado la misma es " + B);
		System.out.println("El valor de la tirada cuando los dos dados han sacado la misma es " + C);
		
		
	}

}
