
public class ProblemasPropuestos7 {

	static float[]numeros=new float[25];
	static float mayor;
	static float suma;
	static float media;
	static void iniciar(){
		for(int i=0;i<numeros.length;i++)numeros[i]=(float) (Math.random()*5.7+1.2);
	}
	static void mayor(){
		
	}
	static void suma(){
		for(int i=0;i<numeros.length;i++) suma+=numeros[i];
	}
	static void media(){
		media=suma/numeros.length;
	}
	static void imprimir(){
		for(int i=0;i<numeros.length;i++)System.out.println(numeros[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Crea un vector de 25 números de coma flotante, de forma aleatoria (entre 1,20 y
6,90), luego se visualizará el mayor de sus elementos , el menor la suma de todos los
elementos la media, y dado un numero introducido por teclado decir si se encuentra
en el vector o no, en caso de que se encuentre indicar la posición
 */
		
		iniciar();
		imprimir();
	}

}
