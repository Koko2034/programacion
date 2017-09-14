/*
 * Se cuenta con la siguiente información:
Las edades de 50 estudiantes del turno mañana.
Las edades de 60 estudiantes del turno tarde.
Las edades de 110 estudiantes del turno noche.
Las edades de cada estudiante deben ingresarse por teclado.
a) Obtener el promedio de las edades de cada turno (tres promedios)
b) Imprimir dichos promedios (promedio de cada turno)
c) Mostrar por pantalla un mensaje que indique cual de los tres turnos
tiene un promedio de edades mayor.
 */

import java.util.Scanner;


public class ProblemasPropuestos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A; // Edades turno mañana
		int D=0;//sumatoria de turno mañana
		int B; // Edades turno tarde
		int E=0;//sumatoria de turno de tarde
		int C; // Edades turno noche
		int G=0;//Sumatoria de turno de noche
		
		Scanner teclado=new Scanner(System.in);
		
		for(int f=0;f<=50;f++){
		System.out.println("Introduzca el valor de la edad turno de mañana");
				A=teclado.nextInt();
				D=D+A;}
		for(int h=0;h<=60;h++){
			System.out.println("Introduzca el valor de la edad turno de tarde");
			B=teclado.nextInt();
			E=E+B;
		}
		for(int i=0;i<=110;i++){
			System.out.println("Introduzca el valor de la edad turno de noche");
			C=teclado.nextInt();
			G=G+C;
			
		}
		
		System.out.println("El promedio de edades del turno de mañana es "+ (D/50));
		System.out.println("El promedio de edades del turno de tarde es "+ (E/60));
		System.out.println("El promedio de edades del turno de noche es "+ (G/110));
		if((D/50)>(E/60) && (E/60)>(G/110)){
			System.out.println("El turno de mañana tiene el mayor promedio de edad");
		}else if((E/60)>(D/50) && (D/50)>(G/110)){
			System.out.println("El turno de tarde tiene el mayor promedio de edad");
		}else if((G/110)>(D/50) && (D/50)>(E/60)){
			System.out.println("El turno de noche tiene el mayor promedio de edad");
		}
	}

}
