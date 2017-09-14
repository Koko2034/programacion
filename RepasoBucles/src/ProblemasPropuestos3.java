/*
 * Escribe un programa que obtenga los números enteros comprendidos
entre dos números introducidos por teclado y validados como distintos, el
programa debe empezar por el menor de los enteros introducidos e ir
incrementando de 7 en 7.
 */


// queda entender el tema de los 7 unidades
import java.util.Scanner;

public class ProblemasPropuestos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A;
		int B;
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el primer valor");
		A=teclado.nextInt();
		System.out.println("Introduzca el segundo valor");
		B=teclado.nextInt();
		if(A!=B){
			while(A>B){
				B=B+7;
				if(A<B){
				System.out.println(B);}
			}
			while(A<B){
				A=A+7;
				if(B>A){
				System.out.println(A);}
			}
			
			
		}else System.out.println("Los numeros introducidos son iguales");
	}

}
