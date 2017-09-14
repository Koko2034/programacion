/*
 * Supongamos que nos encontramos con una máquina de bolas, esta contiene bolas de 3 colores
(rojo, verde y azul), si la bola azul vale 1, la roja 2 y la verde 3.
Haz un algoritmo que termine cuando la suma de las bolas que salgan sea exactamente 13, si le
valor llegar a sobrepasar 13 se pondrá a 13 para salir, pero a la salida se indicara que hemos salido
con el valor exacto o que no hemos pasado en….
 */

import java.util.Scanner;

public class ProblemasPropuestos15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		int sum=0;
		char sbola;
		int bola=0;
		while(sum<13){
			System.out.println("Sacar una bola?");
			sbola=teclado.next().charAt(0);
			if(sbola=='s'){
				bola=(int)(Math.random()*(3+1));
				sum=sum+bola;
			}
		}
		if(sum==13){
			
			System.out.println("hemos salido con el numero exacto de 13");
		}else{System.out.println("Hemos salido con un numero superior a 13");}
	}

}
