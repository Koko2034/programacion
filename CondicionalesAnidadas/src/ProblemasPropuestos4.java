/*
 * 4. Calcular el salario neto semanal de un trabajador en función del número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
• Las primeras 35 horas se pagan a la tarifa normal
• Las horas que pasen de 35 se pagan a un 25% más del precio normal
Las tasas de impuestos son:
o Los primeros 50€ son libres de impuestos
o Los siguientes 40 € tienen un 25% de impuestos
o Los restantes un 45% de impuestos
Visualizar nombre, salario bruto, tasas y salario neto
 */
import java.util.Scanner;

public class ProblemasPropuestos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double A; // nº horas trabajadas
double B; // precio por hora
Scanner teclado= new Scanner(System.in);

	System.out.println("Introduzca el nº de horas trabajadas");
	
	A=teclado.nextDouble();
	
	System.out.println("Introduzca el precio por hora");
	
	B=teclado.nextDouble();
	double C;
	C=A*B;
	
	if(A<35){
		System.out.println("El salario bruto de nuestro empleado es " + A*B);
	}
	else if(A>35)
	{C=((B*1.25)*(A-35))+(B*35);
		System.out.println("El salario bruto de nuestro empleado es " + C );
	}
double D;

	if( C<50)
{ D=0;
		System.out.println("Las tasas son gratuitas");
	}
	else if (C<90)
		{ D=((C-50)*0.25);
		System.out.println("Las tasas son " + D);
		}
	else if (C>90)
	{D=(40*0.25)+ ((C-90)*0.45) ;
System.out.println("Las tasas son " + D);
double E=C-D;

System.out.println("El salario neto es " + E);
	}
	
	}
	
}