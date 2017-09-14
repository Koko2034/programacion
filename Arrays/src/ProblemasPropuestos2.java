import java.util.Scanner;

public class ProblemasPropuestos2 {

	
	static int[]num=new int[30];
	static void inicializar(){
		Scanner teclado=new Scanner(System.in);
		char inicio=' ';
		System.out.println("Desea inicia la consulta");
		inicio=teclado.next().charAt(0);
		if(inicio=='s'){consultar();}
		else{System.out.println("Ha finalizado");}
	}
	static void consultar(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2.- Un profesor ha corregido 30 exámenes, han sido calificados de 0 a 10,
seguidamente desea poder consultar (consulta s/n) cuantos alumnos han sacado
una determinada nota. Al introducir una nota en pantalla saldrá el número de
alumnos que han sacado dicha nota.

		 */
		
	}

}
