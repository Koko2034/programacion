/*
 * 5. El recibo de la electricidad se elabora de la siguiente forma:
• 0.60€ de gastos fijos
• 0.30 € para los primeros 100 Kw.
• 0.20 € para los siguientes 150 Kw.
• 0.15 € para el resto
Realiza un algoritmo que lea de teclado los dos últimos valores del contador (lectura anterior y lectura actual) y calcule el importe a pagar
 */
import java.util.Scanner;

public class ProblemasPropuestos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);

double A=0.6;
double B;
double C;

System.out.println("Introduzca el consumo del mes anterior");

B=teclado.nextDouble();

System.out.println("Introduzca el consumo del mes actual");

C=teclado.nextDouble();

double D=C-B;
double E;
System.out.println("El consumo del mes ha sido " + D + "Kw");

if(D<100) {
		E=A+D*0.3;
		System.out.println("El pago a realizar por el recibo de la luz es de " + E + "euros ");
} else if(D<150){
	E=A+(50*0.3)+((D-100)*0.2);
	System.out.println("El pago a realizar por el recibo de la luz es de " + E + "euros ");
}else if(D>150){
	E=A+(50*0.3)+(50*0.2)+((D-150)*0.15);
	System.out.println("El pago a realizar por el recibo de la luz es de " + E + "euros ");
}
// cuando ponemos if le damos la 1º condicion si la cumple ya no hace ninguno mas, condiciones excluyentes
	}

}
