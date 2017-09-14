import java.util.Scanner;

public class ProblemasPropuestos1 {
	
	static int[][]mat=new int[5][];
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		char inicio=' ';
		do{
		System.out.println("Desea comenzar(s/n)");
		inicio=teclado.next().charAt(0);
		}while(inicio!='s');
		
	for(int i=0;i<5;i++){
	mat[i]=new int[1+i];
		
	}
	}
	static void rellenar(){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
			mat[i][(j)]=(int)(Math.random()*10);
				
			}
	}
	}
	static void imprimir(){
		for(int f=0;f<mat.length;f++) {
			for(int c=0;c<mat[f].length;c++) {
			System.out.print(mat[f][c]+" ");
			}
			System.out.println();
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Confeccionar una clase para administrar una matriz irregular de 5 filas y 1
columna la primer fila, 2 columnas la segunda fila y así sucesivamente hasta 5
columnas la última fila .Realizar la carga por teclado e imprimir posteriormente.
		 */
	
	iniciar();
	rellenar();
	imprimir();
	}

}
