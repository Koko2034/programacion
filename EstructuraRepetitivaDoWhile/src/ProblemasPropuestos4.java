/*
 * Un ejemplo tipico en el que ay que utilizar el bucle do-while son los menus.
 * ara que veas como se hace vamos a realizar nuestro primer ejercicio con menus.
 * Va a ser muy sencillo, es solamente para ver cual es la 
 * estructura de este tipo de problemas.Realizar un programa que se muestra un menu 
 * con 3 opciones:
 * 1. Suma de dos numeros
 * 2Producto de dos numeros
 * 0Salir
 * Con la opcion1 y la opcion 2 pedira dos numeros al usuario y realizara la operacion
 * seleccionada. con la opcion 0 se terminara el programa.Cualqu
 * quier opcion no valida sera ignorada. Despues de cada operacion se debe monstrar de nuevo el menu hasya que el usuario elija la opcion 0. 
 */
import java.util.Scanner;



public class ProblemasPropuestos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		do{
			System.out.println("Escoja una de las siguientes opciones(1.2.0)");
			System.out.println("1.Suma de dos numeros");
			System.out.println("2.Producto de dos numeros");
			System.out.println("0.Salir");
			A=teclado.nextInt();
			if(A==1){
				System.out.println("Introduzca el primer valor");
				B=teclado.nextInt();
				System.out.println("Introduzca el segundo valor");
				C=teclado.nextInt();
				D=B+C;
				System.out.println("El resultado de la operacion es "+ D);
			}else if(A==1){
				System.out.println("Introduzca el primer valor");
				B=teclado.nextInt();
				System.out.println("Introduzca el segundo valor");
				C=teclado.nextInt();
				D=B+C;
				System.out.println("El resultado de la operacion es "+ D);
			}
		}while(A!=0);
		
	}

}
