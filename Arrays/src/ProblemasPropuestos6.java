import java.util.Scanner;

public class ProblemasPropuestos6 {

	static int[]num=new int[30]; // me pide cambiar a static lo cambiamos
	
	static void inicializar(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introducir el primer numero");
		num[0]=teclado.nextInt();
	for(int i=1;i<30;i++){
		num[i]=num[0]+i;
	}
	}
	static void impresion(){
		for(int i=29;i>=0;i--){
			System.out.println(num[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6.-Crea un vector de 30 números enteros, introducir por teclado el valor de su primer
elemento y asignar al resto de elementos, el valor del elemento anterior más 1, por
último se visualizará el vector en orden inverso
 */
		inicializar();
		impresion();
	}

}
