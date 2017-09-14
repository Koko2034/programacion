import java.util.Scanner;


public class ProblemasPropuestos1 {

	static int[][] mat= new int[4][4];
	static void comenzar(){
		Scanner teclado=new Scanner(System.in);
		char inicio=' ';
		do{
		System.out.println("Desea comenzar(s/n)");
		inicio=teclado.next().charAt(0);
		}while(inicio!='s');
		}
	
	static void rellenar(){
		for(int i=0;i<4;i++){
			
			for(int j=0;j<4;j++){
				if(i==j)System.out.print("x");
				else System.out.print("-");
	
			}System.out.println();
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1.-Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal
principal.
x - - -
- x - -
- - x -
- - - x
		 */
		comenzar();
		rellenar();
	}

}
