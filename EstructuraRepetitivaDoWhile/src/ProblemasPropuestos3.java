/*
 * Realiza el algoritmo para que se esté introduciendo números hasta que se
introduzca un número negativo y nos diga cuantos números se han introducido,
la media de los impares y el mayor de los pares
 */
import java.util.Scanner;


public class ProblemasPropuestos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		int A=0; // Numeros introducidos
		int B=-1;//contador para saber la cantidad de numeros
		int D=0; // sumatoria de numeros negativos
		int E=0; // el numero par mayor
		int F=0;
		do{
			System.out.println("Introduzca un valor");
			A=teclado.nextInt();
			B++;
		
			if(A%2!=0){
				D=(D+A);
				F++;
			}else if(A%2==0){
				if(E>=A){
					E=E;
				}else if(E<A){
					E=A;
				}
			}
		}
		while(A>0);
		D=D/(B/F);
		System.out.println("El numero total de introducidos es " + B);
		System.out.println("El numero par mayor es " + E);
		System.out.println("La media de los numeros impares es " + D);
		
	}

}
