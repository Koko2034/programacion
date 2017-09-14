import java.util.Scanner;

public class ProblemasPropuestos2 {

	static int[][]mat=new int[3][];
	static String[]nombres=new String[3];
	static int menor=0;
	static int controlnombre=0;
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("Introduce el nombre del empleado");
			nombres[i]=teclado.nextLine();
		}
		
	}
	static void empezar(){
		int dias;
		for(int i=0;i<3;i++){
			dias=(int)(Math.random()*20);
			mat[i]=new int[dias];
		}
		for(int f=0;f<mat.length;f++) {
			for(int c=0;c<mat[f].length;c++) {
			mat[f][c]=1;
			}
			
			}
	}
	static void calcular(){
		boolean control=true;
		
		for(int i=0;i<3;i++){
			if(control){ control=false; menor=mat[i].length; controlnombre=i;}
			else{ if(menor>mat[i].length){menor=mat[i].length;controlnombre=i;}
			}
		}
		
	}
	static void imprimir(){
		for( int i=0;i<3;i++){
		System.out.println("el empleado " + nombres[i] + " ha faltado " + mat[i].length);
		}
		System.out.println("el empleado que falto menos dias es " + nombres[controlnombre] + " faltando " + menor + " dias");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2. Confeccionar una clase para administrar los días que han faltado los 3 empleados
de una empresa.
Definir un vector de 3 elementos de tipo String para cargar los nombres y una
matriz irregular para cargar los días que han faltado cada empleado (cargar el
número de día que faltó)
Cada fila de la matriz representan los días de cada empleado.
-Mostrar los empleados con la cantidad de inasistencias.
-Que empleado faltó menos días.
 */
		iniciar();
		empezar();
		calcular();
		imprimir();
		
	}

}
