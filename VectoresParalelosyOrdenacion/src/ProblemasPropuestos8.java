import java.util.Scanner;

public class ProblemasPropuestos8 {

	static int[]numeros=new int[20];
	static int[]numerosgrandes=new int[10];
	static int[]numerospeque�os=new int[10];
	static void iniciar(){
		for(int i=0;i<numeros.length;i++)numeros[i]=(int)(Math.random()*300+500);		
			}
	static void opcion(){
		boolean control=true;
		Scanner teclado=new Scanner(System.in);
		do{
		System.out.println("Hacia donde quieres ordenar el arrays?");	
		char opcion=teclado.next().charAt(0);
		switch(opcion){
		case 'a': ascendente();
		break;
		case 'd': descendente();
		break;
		default:System.out.println("La opcion no es correcta");control=false;
		}
		}while(control==false);
		
	}
	static void ascendente(){
		for(int k=0;k<numeros.length-1;k++) {
			for(int f=0;f<numeros.length-1-k;f++) {
			if (numeros[f]<numeros[f+1]) {
			int auxnota;
			auxnota=numeros[f];
			numeros[f]=numeros[f+1];
			numeros[f+1]=auxnota;
			
			}
			}
			}
		for(int i=0;i<numerosgrandes.length;i++){
			numerosgrandes[i]=numeros[i];
		}for(int i=numerospeque�os.length;i<numeros.length;i++){
			numerospeque�os[i-numerospeque�os.length]=numeros[i];
		}
			}
	
	static void descendente(){
		for(int k=0;k<numeros.length-1;k++) {
			for(int f=0;f< numeros.length-1-k;f++) {
			if (numeros[f]>numeros[f+1]) {
			int aux;
			aux=numeros[f];
			numeros[f]=numeros[f+1];
			numeros[f+1]=aux;
			}
			}
			}

		for(int i=0;i<numerospeque�os.length;i++){
			numerospeque�os[i]=numeros[i];
		}
		for(int i=numerospeque�os.length;i<(numeros.length);i++){
			numerosgrandes[i-numerospeque�os.length]=numeros[i];
		}
			}
	
	
	
	static void imprimir(){
		System.out.println("Los numeros totales son");
		for(int i=0;i<numeros.length;i++)System.out.print(numeros[i] + " ");
	System.out.println();
	System.out.println("Los numeros grandes son:");
	for(int i=0;i<numerosgrandes.length;i++)System.out.print(numerosgrandes[i] + " ");
	System.out.println();
	System.out.println("Los numeros peque�os son:");
	for(int i=0;i<numerospeque�os.length;i++)System.out.print(numerospeque�os[i] + " ");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 8.-Cargar un vector con 20 n�meros de forma aleatoria (entre 500 y 800) ordenarlo
de forma ascendente o descendente, dependiendo de una variable aceptada desde
teclado validada como a o d, , declarar dos nuevos vectores de 10 elementos cada
uno y copiar en el primero los 10 valores mas peque�os y en el segundo los 10
valores mas grandes, visualizar los 3 vectores.
 */
		iniciar();
		opcion();
		imprimir();
	}

}