/*
 * 6. De un operario se conoce su sueldo y los a�os de antig�edad. Se pide confeccionar un programa que lea los datos de entrada e informe: a) Si el sueldo es inferior a 300 y su antig�edad es igual o superior a 10 a�os, otorgarle un aumento del 20 %, mostrar el sueldo a pagar. b)Si el sueldo es inferior a 300 pero su antig�edad es menor a 10 a�os, darle un aumento de 5 %. c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
 */
import java.util.Scanner;

public class ProblemasPropuestos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int A,B;
System.out.println("Introduzca el sueldo");
A=teclado.nextInt();
System.out.println("Introduzca su antig�edad");
B=teclado.nextInt();
if(A<300 && B>=10){
	System.out.println("El sueldo de nuestro empleado es " + (1.2*A));
}else if(A<300 && B<10){
	System.out.println("El sueldo de nuestro empleado es "+ (1.05*A));
}else if(A>=500){
	System.out.println("El sueldo de nuestro empleado es "+ A);
}

	}

}
