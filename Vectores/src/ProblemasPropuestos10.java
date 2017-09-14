
public class ProblemasPropuestos10 {

	static int media=0;
	static int[] numeros;
	static float[] vector;

	public static void inicializar(){
		numeros=new int[50];
		
		for(int f=0;f<numeros.length;f++){
			
			numeros[f]=(int)(Math.random()*500+300);	
			media=media+numeros[f];
		System.out.println(numeros[f]);
		}
		media=media/50;
	}
	public static void vector(){
		
		for(int f=0;f<numeros.length;f++){
			vector=new float[50];
			vector[f]=numeros[f]/media;
			System.out.println(vector[f]);
		}
		
	}
	public static void ver(){
		
		for(int f=0;f<numeros.length;f++){
			
			System.out.println(vector[f]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 10. Carga un vector de 50 posiciones, de forma aleatoria con números comprendidos
entre 300 y 800, crea un nuevo vector en el que todos sus elementos resultan de
dividir los elementos del vector original por su media (se recomienda que el segundo
vector sea de tipo float)
 */
		
		
		inicializar();
		vector();
		ver();
	}

}
