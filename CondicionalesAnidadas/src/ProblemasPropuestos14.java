/*
 * 4. Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
 */
import java.util.Scanner;

public class ProblemasPropuestos14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado= new Scanner(System.in);
int A,B,C;

System.out.println("Introduzca el primer valor");
A=teclado.nextInt();
System.out.println("Introduzca el segundo valor");
B=teclado.nextInt();
System.out.print("Introduzca el tercer valor");
C=teclado.nextInt();

if(A<10 || B<10 || C<10){
	System.out.println("Alguno de los valores " + A +", "+ B + " y "+ C + " es menor de 10");
}
	}

}
