/*
 * 6. Realiza un algoritmo para obtener el mínimo desglose en monedas de:
50 cts., 20 cts., 10 cts., 5 cts., 2 cts. Y 1ct de una cantidad introducida por teclado en euros con 2 decimales.
 */
import java.util.Scanner;

public class ProblemasPropuestos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		double Z;
		
		System.out.println("Introduzca un valor economico");
		
		Z=teclado.nextDouble();
		int A=(int) (100*Z);
		int B;
		int C;
		int D;
		int E;
		int F;
		int G;
		int H;
		int I;
		int J;
		int K;
		
		
		
		if(A<2){
			B=A;
			System.out.println("El desglose monetario es " + B + " Monedas de 1 centimo");
		}
		else if (A<5){
			B=A/2;
			C=A%2;
			System.out.println("El desglose monetario es " + B + " Monedas de 1 centimo");
			System.out.println("El desglose monetario es " + C + " Monedas de 2 centimo");
		} 
		else if ( A<10)
		{B=A/5;
		C=A%5;
		D=C/2;
		E=C%2;
		System.out.println("El desglose monetario es " + B + " Monedas de 5 centimo");
		System.out.println("El desglose monetario es " + D + " Monedas de 2 centimo");
		System.out.println("El desglose monetario es " + E + " Monedas de 1 centimo");
		
		}
		else if(A<20)
		{B=A/10;
		C=A%10;
		D=C/5;
		E=C%5;
		F=E/2;
		G=D%2;
		System.out.println("El desglose monetario es " + B + " Monedas de 10 centimo");
		System.out.println("El desglose monetario es " + D + " Monedas de 5 centimo");
		System.out.println("El desglose monetario es " + F + " Monedas de 2 centimo");
		System.out.println("El desglose monetario es " + G + " Monedas de 1 centimo");
			
		}
		else if(A<50){
			B=A/20;
			C=A%20;
			D=C/10;
			E=C%10;
			F=E/5;
			G=D%5;
			H=G/2;
			I=G%2;
			System.out.println("El desglose monetario es " + B + " Monedas de 20 centimo");
			System.out.println("El desglose monetario es " + D + " Monedas de 10 centimo");
			System.out.println("El desglose monetario es " + F + " Monedas de 5 centimo");
			System.out.println("El desglose monetario es " + H + " Monedas de 2 centimo");
			System.out.println("El desglose monetario es " + I + " Monedas de 1 centimo");
			
		}
		else if(A>50){
			B=A/50;
			C=A%50;
			D=C/20;
			E=C%20;
			F=E/10;
			G=E%10;
			H=G/5;
			I=G%5;
			J=I/2;
			K=I%2;
			System.out.println("El desglose monetario es " + B + " Monedas de 50 centimo");
			System.out.println("El desglose monetario es " + D + " Monedas de 20 centimo");
			System.out.println("El desglose monetario es " + F + " Monedas de 10 centimo");
			System.out.println("El desglose monetario es " + H + " Monedas de 5 centimo");
			System.out.println("El desglose monetario es " + J + " Monedas de 2 centimo");
			System.out.println("El desglose monetario es " + K + " Monedas de 1 centimo");
		}
	}}

