import java.util.Scanner;

public class ProblemasPropuestos1 {

	static void generar(int[]s){
		Scanner teclado; 
		teclado=new Scanner(System.in);
		for(int f=0;f<8;f++){
		System.out.println("Introduce un valor");
		s[f]=teclado.nextInt();	
		}
		}
	static void valoracumulado(int[]s){
		int valoracumulado=0;
		for(int f=0;f<8;f++){
			valoracumulado=valoracumulado+s[f];
		}
		System.out.println("El valor acumulado es " + valoracumulado);
	}
	static void vanummayor36(int[]s){
		int valoracumulado=0;
		for(int f=0;f<8;f++){
			if(s[f]>36){
			valoracumulado=valoracumulado+s[f];
			}
		}
		System.out.println("El valor acumulado de numeros mayores de 36 es " + valoracumulado);
		
	}
	static void nummayor50(int[]s){
		int contador=0;
		for(int f=0;f<8;f++){
		if(s[f]>50){
			contador++;
		}
		}System.out.println("El numero de valores mayores de 50 es "+ contador);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1.-Desarrollar un programa que permita ingresar un vector de 8 elementos, e
informe:
-El valor acumulado de todos los elementos del vector.
-El valor acumulado de los elementos del vector que sean mayores a 36.
-Cantidad de valores mayores a 50
		 */

int[]numeros=new int[8];
generar(numeros);
valoracumulado(numeros);
vanummayor36(numeros);
nummayor50(numeros);
	}

}
