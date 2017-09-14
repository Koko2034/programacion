/*
 * 8. Escribe un programa que muestre en pantalla un número entero leído desde teclado, en el caso de que esté fuera del intervalo [5, 40]
 */
import java.util.Scanner;
public class ProblemasPropuestos18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int A;
System.out.println("Introduzca por pantalla un numero");
A=teclado.nextInt();
if(A<5 || A>40){
	System.out.println("El numero introducido " + A + " esta fuera del intervalo [5,40]");
}else if(A>=5 || A<=40){
	System.out.println("El numero introducido " + A + " esta dentro del intervalo [5,40]");
}
	}

}
