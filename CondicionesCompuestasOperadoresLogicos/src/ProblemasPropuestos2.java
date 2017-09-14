/*
 * 2. Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a este resultado se lo multiplica por el tercero.
 */
import java.util.Scanner;

public class ProblemasPropuestos2 {

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
if(A==B && A==C){
	System.out.println("El resultado de (A+B)*C es " + ((A+B)*C));
}if(A!=B){
	System.out.println("Los valores no son iguales");
}
	}

}