import java.util.Scanner;

public class ProblemasPropuestos5 {
static Scanner teclado=new Scanner(System.in);

	static void inicializar(String[]n){

		for(int f=0;f<10;f++){
		System.out.println("Introduce un nombre");
		n[f]=teclado.nextLine();
}
		
	}
	static void busqueda(String[]n){
		int control=0;
		System.out.println("introduce un nombre a buscar");
		String nombre=teclado.nextLine();
		for(int i=0;i<10;i++){
			if(n[i].equals(nombre)){
				System.out.println("la posicion del nombre "+ nombre + " en nuestro vector es " + i);
				control++;
			}
		}if(control==0){
			System.out.println("El nombre " + nombre + " no se encuentra en el vector");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5.- Haz un programa que introduzca nombres en un vector de 10 posiciones y obtenga
la posición que ocupa un determinado nombre introducido por teclado, se informará si
no existe en el vector
		 */
		String[]nombre=new String[10];
		
		inicializar(nombre);
		busqueda(nombre);
	}

}
