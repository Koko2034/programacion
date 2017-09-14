import java.util.Scanner;
public class ProblemasPropuestos6 {

	static int[][] mat=new int[3][4];
	static int[] sumafila= new int[3];
	static int[] sumarcolumna= new int[4];
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		char inicio=' ';
		do{
			System.out.println("Desea rellenar la matriz(s/n)");
			inicio=teclado.next().charAt(0);
		}while(inicio!='s');
		
		for(int f=0;f<3;f++){
			for(int c=0;c<4;c++){
				
				mat[f][c]=(int)(Math.random()*38+2);
				
			}
			
		}
		
	}
	static void calcular(){
		for(int f=0;f<3;f++){
			for(int c=0;c<4;c++){
				sumafila[f]+=mat[f][c];
			}}
		for(int c=0;c<4;c++){
			for(int f=0;f<3;f++){
				sumarcolumna[c]+=mat[f][c];
			}
		}
		
	}
	static void imprimir(){
		for(int f=0;f<3;f++){
			for(int c=0;c<4;c++){
				System.out.print(" "+mat[f][c]+"");
			}System.out.println();
			}
		System.out.println();
		System.out.println();
	
	for(int i=0;i<3;i++){
		System.out.println("La fila numero "+ (i+1) + " su suma es " + sumafila[i]);
	}
	for(int i=0;i<4;i++){
		System.out.println("La columna numero "+ (i+1) + " su suma es " + sumarcolumna[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6.-Crea una matriz de 3 x 4 de forma aleatoria con números entre 2 y 40, calcula
la suma de cada una de sus filas y columnas, dejando dichos resultados en dos
vectores, uno la suma de las filas y otro la de las columnas
 */
		
		iniciar();
		calcular();
		imprimir();
	}

}
