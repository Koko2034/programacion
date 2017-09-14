/*
 * 3. Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".
 */
import java.util.Scanner;

public class ProblemasPropuestos13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int A,B,C;

System.out.println("Introduzca el primer valor");
A=teclado.nextInt();
System.out.println("Introduzca el segundo valor");
B=teclado.nextInt();
System.out.println("Introduzca el tercer valor");
C=teclado.nextInt();
if(A<10 && B<10 && C<10){
	System.out.println("Los valores introducidos:"+ A +", "+ B + " y " + C + " son menores de 10 ");
}if(A>10 || B>10 || C>10){
	System.out.println("Alguno de los valores " + A + ", "+ B + " y " + C + " son mayores de 10 ");
}
	}

}
