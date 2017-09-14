
public class ProblemasPropuestos6 {

	static int[]numeros=new int[15];
	static void iniciar(){
		for(int i=0;i<numeros.length;i++)numeros[i]=(int)(Math.random()*50+0);
		
	}
	static void calcular(){
		boolean control=true;
		for(int f=0;f<15-1;f++){
			int aux=numeros[f];

			
		numeros[f]=numeros[f+1];
		numeros[f+1]=aux;
		if(control){numeros[0]=numeros[numeros.length-1];control=false;}
		
		}
			
	}
	static void imprimir(){
		System.out.println();
		for(int i=0;i<numeros.length;i++)System.out.print (numeros[i]+ " " );
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*6.- Escribe un programa que lea 15 números por teclado y que los
almacene en un array. Rota los elementos de ese array, es decir, el
elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2,
etc. El número que se encuentra en la última posición debe pasar a
la posición 0. Finalmente, muestra el contenido del array.
*/
		iniciar();
		imprimir();
		calcular();
		imprimir();
	}

}
