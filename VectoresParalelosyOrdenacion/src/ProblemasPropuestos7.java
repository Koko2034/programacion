
public class ProblemasPropuestos7 {
	static int[]numeros=new int[20];
	
	static void iniciar(){
for(int i=0;i<numeros.length;i++)numeros[i]=(int)(Math.random()*100+0);		
	}
	
	static void calcular(){
		for(int k=0;k<numeros.length-1;k++) {
			for(int f=0;f< numeros.length-1-k;f++) {
			if (numeros[f]%2!=0) {
			int aux;
			aux=numeros[f];
			numeros[f]=numeros[f+1];
			numeros[f+1]=aux;
			
			}
			}
			}
			}

	static void imprimir(){
		for(int i=0;i<numeros.length;i++)System.out.println(numeros[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 7.- Escribe un programa que genere 20 números enteros aleatorios entre 0
y 100 y que los almacene en un array. El programa debe ser capaz de
pasar todos los números pares a las primeras posiciones del array (del
0 en adelante) y todos los números impares a las celdas restantes.
Utiliza arrays auxiliares si es necesario.
		 */
iniciar();
calcular();
imprimir();
	}

}
