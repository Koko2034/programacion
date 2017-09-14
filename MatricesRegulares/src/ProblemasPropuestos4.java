import java.util.Scanner;

public class ProblemasPropuestos4 {

	static int fila;
	static int columna;
	static int[][] mat;
	
	static void inicializar(){
Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce las filas que va a tener la matriz");
		fila=teclado.nextInt();
		System.out.println("Introduce las columnas que va a tener la matriz");
		columna=teclado.nextInt();
	mat=new int[fila][columna];	
	
	for(int f=0;f<fila;f++){
		for(int c=0;c<columna;c++){
			
			mat[f][c]=(int)(Math.random()*50);
			
		}
		
	} 
	
	}
	static void imprimir2(){
		for(int f=0;f<fila;f++){
			for(int c=0;c<columna;c++){
				
				System.out.print(" " +mat[f][c]+" ");
				
			}
			System.out.println();
		} 
	}
	static void imprimir(){
		
			System.out.println("La posicion 0,"+fila+ " es " + mat[0][fila-1]);
			System.out.println("La posicion "+columna+","+fila+ " es " + mat[columna-1][fila-1]);
			System.out.println("La posicion "+columna+",0"+ " es " + mat[columna-1][0]);
			System.out.println("La posicion 0,0"+ " es " + mat[0][0]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4.-Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los cuatro
valores que se encuentran en los vértices de la misma (mat[0][0] etc.)
		 */
		inicializar();
		imprimir2();
		imprimir();
	}

}
