import java.util.Scanner;


public class ProblemasPropuestos3 {
	
	static int[]numeros=new int[15];;
static void introducir(){
	
	for(int f=0;f<15;f++){
		numeros[f]=(int) (Math.random()*(500+1));
		}
}	

static void mayor(){
	int mayor=0;
	int menor=500;
	
	for(int f=1;f<15;f++){
	if(numeros[f]>mayor) mayor=numeros[f];
	else if(numeros[f]<menor) menor=numeros[f];
		
	}
	System.out.println("El numero mas grande es " + mayor);
	System.out.println("El numero mas pequeño es " + menor);
}
static void comprobacion(){
	for(int i=0;i<15;i++){
		System.out.println(numeros[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Haz un programa que introduzca 15 números enteros en un vector, la carga se
realizará de forma aleatoria ( entre 1 y 500) y obtenga cual es el mayor y el menor de
los números y cuantas veces se repiten ambos
		 */
		
		
		introducir();
		mayor();
		comprobacion();
	}

}
