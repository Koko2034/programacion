import java.util.Scanner;

public class ProblemasPropuestos1 {

	static int[]num=new int[8];
	
	static void inicializar(){
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<8;i++){
			System.out.println("Escriba 8 numeros");
			num[i]=teclado.nextInt();
		}
	}
	static void vacumulado(){
		int vacumulado=0;
		for(int i=0;i<8;i++){
			vacumulado=num[i]+vacumulado;
		}
		
		System.out.println("El valor acumulado de mis numeros es " + vacumulado);
	}
	
	static void vacumuladoespecial(){
		int vacumulado=0;
		for(int i=0;i<8;i++){
			if(num[i]>36){
				vacumulado=vacumulado+num[i];
			}else{
				vacumulado=vacumulado;
			}
		}
		System.out.println("El valor acunmulado de los numeros superiores a 36 es " + vacumulado);
	}
	static void valor50(){
		int contador=0;
		for(int i=0;i<8;i++){
			if(num[i]>50)contador++;
		}
		System.out.println("La cantidad de numeros mayores que 50 es " + contador);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.-Desarrollar un programa que permita ingresar un vector de 8 elementos, e
informe:
-El valor acumulado de todos los elementos del vector.
-El valor acumulado de los elementos del vector que sean mayores a 36.
-Cantidad de valores mayores a 50.
 */
		
		inicializar();
		vacumulado();
		vacumuladoespecial();
		valor50();
		
	
	}
	

}
