/*
 * 7. Dado el saldo inicial de una cuenta corriente, introducir desde teclado una cantidad y una letra que indique el tipo de operación: I (ingreso) o R (reintegro).En el caso de que la letra introducida no sea I o R, se mostrará un mensaje de error. Calcular el saldo final de la cuenta una vez realizada la operación
 */
import java.util.Scanner;

public class ProblemasPropuestos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double A; // saldo inicial
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca el saldo inicial");
		A=teclado.nextDouble();
		
	char B='Y'; // entrada de tipo de ingreso

	
	double C;
	System.out.println("Introduzca la cantidad economica");
	C=teclado.nextDouble();
	teclado.nextLine();// sirve para limpiar y poder introducir otros datos y asi poder introducir datos que no sean letras
	System.out.println("Introduzca el tipo de operacion R o I");
	B=teclado.nextLine().charAt(0);

	
	switch (B){
	case 'R':
		System.out.println("El dinero total en su cuenta es " + (A-C));
		break;
		
	
	case 'I': 
		System.out.println("El dinero total en su cuenta es " + (A+C));
	
	default:
		
		System.out.println("Error");
	
	}}

}
