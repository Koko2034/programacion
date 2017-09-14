import java.util.Scanner;

public class ProblemasPropuestos2 {

	
	static int[][] mat= new int[2][4];
	
	static void cargar(){
Scanner teclado=new Scanner(System.in);

		for(int c=0;c<2;c++) {
			for(int f=0;f<4;f++) {
				int num=(int)(Math.random()*50);
			
			mat[c][f]=num;
			}
			}
	
			}
	static void imprimir(){
		for(int f=0;f<mat.length;f++){
			for(int c=0;c<mat[0].length;c++){
				
				System.out.print(" "+ mat[f][c]+"");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2.-Crear una matriz de 2 filas y 5 columnas. Realizar la carga de componentes
por columna (es decir primero ingresar toda la primer columna, luego la segunda
columna y así sucesivamente)
Imprimir luego la matriz.
		 */
		cargar();
		imprimir();
	}

}
