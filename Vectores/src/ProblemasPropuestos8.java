import java.util.Scanner;

public class ProblemasPropuestos8 {

	static Scanner teclado=new Scanner(System.in);
	
	static void inicializar(int[]n){
		n[0]=2;
		System.out.println(n[0]);
		for(int i=1;i<20;i++){
			n[i]=n[i-1]+2;
		System.out.println(n[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 8. Crea un vector de 20 posiciones y cárgalo con los 20 primeros números pares
		 */
		
		int[]numeros=new int[20];
		inicializar(numeros);
	}

}
