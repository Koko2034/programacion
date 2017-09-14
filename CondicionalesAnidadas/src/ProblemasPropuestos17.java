/*
 * 7. Escribir un programa en el cual: dada una lista de tres valores numéricos distintos se calcule y muestre el mayor y el menor de ellos
 */
import java.util.Scanner;

public class ProblemasPropuestos17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado= new Scanner(System.in);

int A,B,C;

System.out.println("Introduzca el primer valor");
A=teclado.nextInt();
System.out.println("Introduzca el segundo valor");
B=teclado.nextInt();
System.out.println("Introduzca el tercer valor");
C=teclado.nextInt();

if(A>B && A>C && B>C){
	System.out.println("El orden de los numeros es " + A +">"+B+">"+C);
}else if(A>B && A>C && C>B){
	System.out.println("El orden de los numeros es " + A +">"+C+">"+B);
}else if(B>A && B>C && A>C){
	System.out.println("El orden de los numeros es " + B +">"+A+">"+C);
}else if(B>A && B>C && C>A){
	System.out.println("El orden de los numeros es " + B +">"+C+">"+A);
}else if (C>A && C>B && B>A){
	System.out.println("El orden de los numeros es " + C +">"+B+">"+A);
}else if(C>A && C>B && A>B){
	System.out.println("El orden de los numeros es " + C +">"+A+">"+B);
}
	}

}
