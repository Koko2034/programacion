import java.util.Scanner;

public class ProblemasPropuestos3 {

	static int fila;
	static int columna;
	static int[][] mat;
	static int[]auxiliar;
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
	static void cambiar(){
		auxiliar=new int[columna];
		for(int i=0;i<columna;i++)
		auxiliar[i]=mat[0][i];
		for(int i=0;i<columna;i++)
			mat[0][i]=mat[1][i];
		for(int i=0;i<columna;i++)
			mat[1][i]=auxiliar[i];
	}
	static void imprimir(){
		for(int f=0;f<fila;f++){
			for(int c=0;c<columna;c++){
				
				System.out.print(" "+ mat[f][c]+"");
			}
			System.out.println();
		}
	}
	static void imprimir2(){
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3.-Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la
primer fila con la segunda. Imprimir luego la matriz.
		 */
		inicializar();
		imprimir();
		imprimir2();
		cambiar();
		imprimir();
		
	}

}
