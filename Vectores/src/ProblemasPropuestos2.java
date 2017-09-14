import java.util.Scanner;

public class ProblemasPropuestos2 {

	static int[] notas=new int[30];
	
	static Scanner teclado=new Scanner(System.in);
	
	static void cargar(){
	
for(int f=0;f<30;f++){
notas[f]=(int) (Math.random()*10+1);
}
System.out.println("Se han generado las notas");
	}
	static void calculonota(){
	
		System.out.println("Desea consultar nota(s/n)");
		char manolo=teclado.next().charAt(0);
		System.out.println("Introduce una nota");
		int nota=teclado.nextInt();
		int contador=0;
		if(manolo=='s'){
			for(int i=0;i<30;i++){
				if(notas[i]==nota){
					contador++;
				}
			}
			
			System.out.println("El numero de alumnos que tienen la nota "+ nota +" es " + contador);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2.- Un profesor ha corregido 30 exámenes, han sido calificados de 0 a 10,
seguidamente desea poder consultar (consulta s/n) cuantos alumnos han sacado
una determinada nota. Al introducir una nota en pantalla saldrá el número de
alumnos que han sacado dicha nota.
		 */
		
		cargar();
		calculonota();
	}

}
