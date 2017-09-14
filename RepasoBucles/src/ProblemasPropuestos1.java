/*
 * Realiza un programa que permita conocer la nota media, la nota más alta y la mas baja de una
clase con un número indeterminado de alumnos.
 */
import java.util.Scanner;


public class ProblemasPropuestos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
	
		int numA;// numero de alumnos
		int B=0;//nota media
		int C=10;//nota mas baja
		int D=0;//nota mas alta
		int nota1;
		int nota2=0;
		
	System.out.println("¿Cual es el numero de alumnos?");
	numA=teclado.nextInt();
	
	for(int i=1;i<=(numA/2);i++){
		nota1=(int)(Math.random()*(10+0));
		if(nota1<=nota2){
			if(nota2>D){
			D=nota2;}
		}
			if(nota1<C){
			C=nota1;}
		
		if(nota1>=nota2){
			if(nota1>D){
			D=nota1;}
		}
			if(nota2<C){
			C=nota2;}
		
		System.out.println(nota1);
		
		nota2=(int)(Math.random()*(10+0));
		if(nota1<=nota2){
			if(nota2>D){
			D=nota2;}
		}else{if(nota1<C){
			C=nota1;}
		}if(nota1>=nota2){if(nota1>D){
			D=nota1;}
		}if(nota2<C){
			C=nota2;}
		
		
		System.out.println(nota2);
		B=B+nota1+nota2;
		
	}
		B=B/numA;
		System.out.println("La nota media de la clase de " + numA + " es de " + B);
		System.out.println("la nota mas alta de la clase es " + D);
		System.out.println("La nota mas baja de la clase es " + C);
	}

}
