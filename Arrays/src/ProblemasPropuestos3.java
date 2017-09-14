import java.util.Scanner;

public class ProblemasPropuestos3 {

	static int[]num;
	
	static void inicializar(){
	Scanner teclado=new Scanner(System.in);
	char inicio;
	System.out.println("Desea iniciar el programa");
	inicio=teclado.next().charAt(0);
	if(inicio=='s'){
		for(int i=0;i<15;i++){
			num[i]=(int)(Math.random()*500+0);
		}
	}
		
	}
	static void mayor(){
	
		
	}
	static void menor(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Haz un programa que introduzca 15 números enteros en un vector, la carga se
realizará de forma aleatoria ( entre 1 y 500) y obtenga cual es el mayor y el menor de
los números y cuantas veces se repiten ambos

		 */
	inicializar();
	mayor();
	menor();
	
	}

}
