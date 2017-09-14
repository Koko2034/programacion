/*
 * Visualizar los enteros comprendidos entre dos números introducidos por
teclado, validados como distintos, el programa empezara por el mayor y se
realizará un decremento correspondiente a un tercer entero introducido por teclado
y validado mayor que cero
 */

import java.util.Scanner;


public class ProblemasPropuestos10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int num3=0;
		while(num1==num2){
		System.out.println("introduce el primer valor");
		num1=teclado.nextInt();
		System.out.println("introduce el segundo valor");
		num2=teclado.nextInt();
		}
		while(num3<=0){
		System.out.println("introduce el salto");
		num3=teclado.nextInt();
		}
		int Z=0;
		
		if(num1>num2){
			Z=num1;
		for(int i=num1;i>num2;i=Z){
			Z=Z-num3;
			System.out.println(i);
		}
			
		
		}else{
			Z=num2;
			for(int i=num2;i>num1;i=Z){
				Z=Z-num3;
				System.out.println(i);
			
		}
		
		
		
	}

	}}
