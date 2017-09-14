import java.util.Scanner;


public class ProblemasPropuestos14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A;
		int C=0;
		int D=0;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el numero de empleados");
		A=teclado.nextInt();
		while(A<=0){
			System.out.println("Introduce el numero de empleados");
			A=teclado.nextInt();
		}
		for(int i=0;i<=A;i++){
			int B=(int)(Math.random()*2500+1500);
			D=D+B;
			if(B>=1000 && B<=1500){
				C++;
				
			}
			
		}System.out.println("El importe que gasta la empresa en sueldos es " + D);
		System.out.println("El numero de empleados que cobra entre 1000 y 1500 es " + C );
		System.out.println("El numero de empleados que cobra mas de 1500 es " + (A-C));
	}

}
