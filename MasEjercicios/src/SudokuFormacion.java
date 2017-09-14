import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SudokuFormacion {

	private static int[][] sudoku= 
		{
		 {7,4,1,6,9,8,3,2,5},
		 {5,3,8,2,4,1,6,7,9},
		 {9,2,6,3,7,5,4,1,8},
		 {4,1,3,8,2,6,9,5,7},
		 {2,6,7,5,3,9,8,4,1},
		 {8,5,9,4,1,7,2,3,6},
		 {1,9,2,7,8,3,5,6,4},
		 {3,7,5,9,6,4,1,8,2},
		 {6,8,4,1,5,2,7,9,3}
		 };
	static int tablero[][]=new int[9][9];
	static int controltablero[][]=new int[9][9];
	static boolean control=true;
	static int[]nuevo =new int[9];
	static boolean controljuego=true;
	static void crearsudoku(){
		
	}
	static void imprimir(){
		for(int i=0;i<sudoku.length;i++){
			for(int j=0;j<sudoku.length;j++)System.out.print("====");
			System.out.println();
			for(int h=0;h<sudoku.length;h++)System.out.print("| "+sudoku[i][h]+ " ");
			System.out.println("|");
		}
		for(int j=0;j<sudoku.length;j++)System.out.print("====");
	}
	static void enseñartablero(){
		for(int i=0;i<tablero.length;i++){
			int contador=0;
			while(contador<4){
				int j = (int)(Math.random()*9);
				int h = (int)(Math.random()*9);
				if(controltablero[i][j]==0){controltablero[i][j]=1;tablero[i][j]=sudoku[i][j];contador++;}
			}
		}
		
	}
	static void imprimirtablero(){
		System.out.print("    ");
		for(int g=0;g<tablero.length;g++)System.out.print((g+1)+"   ");
		System.out.println();
		for(int i=0;i<tablero.length;i++){
			System.out.print("===");
			for(int j=0;j<tablero.length;j++)System.out.print("====");
			System.out.println();
			System.out.print(" "+(i+1));
			for(int h=0;h<tablero.length;h++)System.out.print("| "+tablero[i][h]+ " ");
			System.out.println("|");
		}
		System.out.print("===");
		for(int j=0;j<tablero.length;j++)System.out.print("====");
	}
	static void jugar(){
		
		Scanner teclado=new Scanner(System.in);
		Pattern pat = Pattern.compile("[1-9]");
		
	
		String f1;
		int f;
		int c;
		int valor;
		boolean controltirada=true;
		while(controltirada){
			System.out.println();
			System.out.println("introduzca una fila");
		f1=teclado.nextLine();
		Matcher mat = pat.matcher(f1);
		while (!mat.matches()) {
		System.out.println("No Válido");System.out.println("introduzca una fila");
		f1=teclado.nextLine();
		mat = pat.matcher(f1);
		}
		f=Integer.parseInt(f1);
		System.out.println("introduzca una columna");
		c=teclado.nextInt();
		System.out.println("Introduzca el valor");
		valor=teclado.nextInt();
		if(tablero[f][c]==0 && valor<10 && valor>0){controltirada=false;tablero[f-1][c-1]=valor;}
		
		}
		
	}
	
	static void comprobarsudoku(){
		comprobarfilas();
		comprobarcolumnas();
		comprobarcuadrantes();
	}

static void comprobarfilas(){
	control=true;
	for( int i=0;i<nuevo.length;i++){
		for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
		for(int j=0;j<nuevo.length;j++){
			if(nuevo[(tablero[i][j])-1]==0){
				nuevo[(tablero[i][j])-1]=1;
			}
			else control=false;
		}
	}
	if(!control)System.out.println("El sudoku falla por filas");
	else System.out.println("El sudoku esta bien por filas");
}
static void comprobarcolumnas(){
	control=true;
	int i=0;
	int j=0;
	while(i<nuevo.length && control){
	
		for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
	while(j<nuevo.length && control){
		
			if(nuevo[(tablero[j][i])-1]==0){
				nuevo[(tablero[j][i])-1]=1;
			}
			else control=false;
		j++;
		} i++;
	}
	if(!control)System.out.println("El sudoku falla por columnas");
	else System.out.println("El sudoku esta bien por columnas");
}
static void comprobarcuadrantes(){
	control=true;
	int contador=0;
	int h=0;
	int j=0;
	int i=0;
	while(i<3 && control){
		for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
		
		while(j<3 && control){
			
			while(h+contador<3+contador && control){
			
				if(nuevo[(tablero[j][h])-1]==0) {nuevo[(tablero[j][h])-1]=1;}
				else control=false;
				h++;}
			j++;}
		contador+=3;
		i++;
		}
	
	contador=0;
	int p=0;
int r=0;
	int q=3;
	while(p<3 && control){
	
		for(int o=0;o<nuevo.length;o++) nuevo[o]=0;
		while(q<6 && control){
			while(r+contador<3+contador && control){
				if(nuevo[(tablero[q][r])-1]==0){ nuevo[(tablero[q][r])-1]=1;}
				else control=false;
				r++;
			} q++;
		}
		contador+=3;
		p++;
	}
	
	contador=0;
	i=0;
	j=6;
	h=0;
	while(i<3 && control){
		for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
		while(j<9 && control){
			while(h+contador<3+contador && control){
				if(nuevo[(tablero[j][h])-1]==0){ nuevo[(tablero[j][h])-1]=1;}
				else control=false;
				h++;
			}
			j++;
		}
		contador+=3;
		i++;
	}
	
	if(!control) System.out.println("El sudoku por cuadrantes da error");
	else System.out.println("El sudoku por cuadrantes esta correcto");
 }
static void finalizar(){
	int contador=0;
	for(int i=0;i<tablero.length;i++){
		for(int j=0;j<tablero[0].length;j++){
			if(tablero[i][j]==0) contador++;
			if(contador==0 && control){controljuego=false;System.out.println("Has acabado el juego");}
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enseñartablero();
		
		while(controljuego){
		imprimirtablero();
		jugar();
	}

	}
}
