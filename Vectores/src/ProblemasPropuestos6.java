import java.util.Scanner;

public class ProblemasPropuestos6 {

	static Scanner teclado=new Scanner(System.in);
	
	static void inicializar(int[]n){
		System.out.println("introduce un numero por teclado");
	n[0]=teclado.nextInt();	
	for(int i=1;i<30;i++){
		n[i]=n[i-1]+1;
		
	}	
	
	}
	static void visualizar(int[]n){
		for(int j=29;j>=0;j--){
			System.out.println(n[j]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6.-Crea un vector de 30 números enteros, introducir por teclado el valor de su primer
elemento y asignar al resto de elementos, el valor del elemento anterior más 1, por
último se visualizará el vector en orden inverso
 */
		
		int[]numeros=new int[30];
		inicializar(numeros);
		visualizar(numeros);
	}

}
