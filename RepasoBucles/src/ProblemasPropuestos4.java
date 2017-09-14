/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca
un número negativo y nos diga cuantos números se han introducido, la
media de los impares y el mayor de los pares. El número negativo sólo se
utiliza para indicar el final de la introducción de datos pero no se incluye en
el cómputo.
 */

import java.util.Scanner;

public class ProblemasPropuestos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
	char inicio=' ';
	System.out.println("Desea iniciar el programa(s/n)");
	inicio=teclado.next().charAt(0);
	while(inicio!='s'){
		System.out.println("Desea iniciar el programa(s/n)");
		inicio=teclado.next().charAt(0);
	}
	int contadorimpar=0;
	int num=1;
	int parmayor=0;
	teclado.nextLine();
	int simpar=0;
	do{
	System.out.println("Introduzca un valor");
	num=teclado.nextInt();
	int impar=num%2;
	
	if(impar!=0){
		simpar=simpar+num;
		contadorimpar++;
	}if(impar==0){
		if(parmayor<num){
			parmayor=num;
		}
	}
	
	}while(num>0);
	
	System.out.println("La media de los numeros impares es " + (simpar/contadorimpar));
	System.out.println("El numero par mayor es " + parmayor);
	}

}
