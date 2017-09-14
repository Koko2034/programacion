import java.util.Scanner;

public class ProblemasPropuestos4 {

	static int[] nombres=new int[40];
	
	static String[] asignaturas=new String[5];

	static int[][] mat= new int[40][5];
	static int[] media= new int[5];
	static int[] mediaalum= new int[40];
	static void iniciar(){
		Scanner teclado= new Scanner(System.in);
		for(int i =0;i<5;i++){
		System.out.println("Generamos la asignatura numericamente");
		
		asignaturas[i]=teclado.nextLine();	
		}
		
			System.out.println("Generamos la nota del alumno");
			for(int i=0;i<5;i++){
				for(int j=0;j<40;j++){
			mat[j][i]=(int)(Math.random()*10);
					
				}
			}
			System.out.println("Generamos el nombre del alumno con numeros del 1 al 40");
			int x=1;
			for(int i=0; i<40;i++){
				nombres[i]=x;
				x++;
			}
			}
	static void mediaasig(){
		System.out.println("Generamos la nota media por clase de cada asignatura");
		for(int i=0;i<5;i++){
			for(int j=0;j<40;j++){
		media[i]=media[i]+mat[j][i];
				
			}
			
		}
		for(int j=0;j<5;j++){
			media[j]=media[j]/40;
		}
		
	}
	
	static void medialumn(){
		System.out.println("Generamos la nota media por clase de cada asignatura");
		for(int i=0;i<40;i++){
			for(int j=0;j<5;j++){
		mediaalum[i]=mediaalum[i]+mat[i][j];
				
			}
			
		}
		for(int j=0;j<40;j++){
			mediaalum[j]=mediaalum[j]/5;
		}
		
	}
	static void notalta(){
		
		boolean control=true;
		int mayor=0;
		int controlpos=0;
		for(int k=0;k<mat[0].length;k++) {
			mayor=0;
			controlpos=0;
			control=true;
			for(int f=0;f<mat.length;f++) {
			if(control){control=false; mayor=mat[f][k]; controlpos=f;}
			else{
				if(mat[f][k]>mayor){mayor=mat[f][k]; controlpos=f;}
			}
				
			}
			System.out.println(" la nota mas alta de la asignatura " + asignaturas[k] + " es " + mayor + " que tiene el alumno " + nombres[controlpos]);}
			}
	static void suspensos(){
		int contador;
		for(int i=0;i<5;i++){
			System.out.println("ha suspendido la asignatura " + asignaturas[i]);
			for(int j=0;j<40;j++){
			if(mat[j][i]<5) System.out.println( nombres[j] ) ;	
			}
			}
		
		for(int i=0;i<40;i++){
			contador=0;
			for(int j=0;j<5;j++){
				if(mat[i][j]<5) contador++;
			}
			if(contador>3)System.out.println("El alumno " + nombres[i] + " ha suspendido mas de 3 asignaturas");
		}
	}		
	
		
		
	static void imprimir(){
		for(int i=0;i<40;i++){
			for(int j=0;j<5;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();}
		
		for(int i =0;i<5;i++){
		System.out.println("La nota media por la asignatura " + asignaturas[i] + " es " + media[i]);
		}
		
	for( int i=0;i<40;i++){
		System.out.println(" La nota media del alumno " + nombres[i] + " es " + mediaalum[i]);
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4. Además de la tabla anterior se dispone de un vector de 5 posiciones con el
nombre de las asignaturas, y otro con los nombres de los 40 alumnos.
a) Nota más alta y el nombre del alumno y nombre de la asignatura
en la que la ha obtenido.
b) Listado donde aparezca el nombre de cada asignatura con la
media obtenida en cada una.
c) Listado de los nombres de los alumnos con la nota media de cada
uno de ellos.
d) Listado de los alumnos que han suspendido cada una de las
asignaturas.
e) Listado de los alumnos que han suspendido 3 o más asignaturas.
		 */
		iniciar();
		mediaasig();
		medialumn();
		notalta();
		suspensos();
		imprimir();
		
		
	}

}
