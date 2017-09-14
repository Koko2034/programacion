import java.util.Scanner;

public class ProblemasPropuestos5 {
	static String[]letras=new String[10];
	static String palabra;
	static void iniciar(){
		
		do{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca una palabra");
		palabra=teclado.nextLine();
		}while(palabra.length()>10);
	
	}
	static void ordenar(){
		for(int i=0;i<palabra.length();i++){
			letras[i]=palabra.charAt(i)+"";
		}
		
		for(int k=0;k< letras.length-1;k++) {
			for(int f=0;f< letras.length -1-k;f++) {
			if (letras[f].compareTo(letras[f+1])>0) {
			String aux;
			aux=letras[f];
			letras[f]=letras[f+1];
			letras[f+1]=aux;
			}
			}
			}
	}
	static void imprimir(){
		for(int i=0;i<letras.length;i++){
			System.out.println(letras[i]+", ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5.- Se introduce una palabra (como máximo 10 caracteres) y en pantalla debe salir
una lista por orden alfabético (a...z) con las letras que la forman. por ejemplo:
palabra='amigo '; saldría a,g,i,m,o.
		 */
		iniciar();
		ordenar();
		imprimir();
		
	}

}
