/*
 * 8. Leer desde teclado el resultado de un partido de futbol (goles del equipo local y goles del equipo visitante) y asignar a una variable denominada resultado un carácter 1, X o 2. Mostrar en pantalla el mensaje correspondiente, según el valor de la variable resultado
 */
import java.util.Scanner;

public class ProblemasPropuestos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		int A;
		int B;
		System.out.println("Introduzca el numero de goles del equipo local");
		A=teclado.nextInt();
		System.out.println("Introduzca el numero de goles del equipo visitante");
		B=teclado.nextInt();
		
		char resultado;
		resultado=3;
		if(A<B){
			resultado='2';
			
		}else if(A>B){
			resultado='1';
			
		}else if (A==B){
			resultado='x';
		};
		System.out.println("El resultado del partido es " + resultado);
		}
			}
		
		

