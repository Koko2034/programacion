
public class ProblemasPropuestos6 {

	//static int[] comprobar=new int[9];
	static int[] nuevo=new int[9];
	static int[] control=new int[9];
	
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


	static void compruebaArray19(){
		/*int x=1;
		for(int i=0;i<comprobar.length;i++){
			comprobar[i]=x;
			x++;
		}*/
		boolean controlando=true;
		boolean csudoku=true;
		for(int p=0;p<nuevo.length;p++){ 
            
			if(controlando){controlando=false; control[nuevo[p]]=1;}
			else {
					if(control[nuevo[p]]==1) csudoku=false;
					else control[nuevo[p]]=1;
			}
		}
	if(csudoku){System.out.println("No cumple las caracteristicas el sudoku");}
	else System.out.println("El sudoku cumple las caracteristicas");
		/*condicion 9 posiciones*/
	}
	static void comprobarfila(){
		System.out.println("Comprobar fila");
		
		for(int i=0;i<sudoku.length;i++){
			for(int k=0;k<nuevo.length;k++){
				control[k]=0;
				nuevo[k]=0;
			}
			for(int j=0;j<sudoku.length;j++){
				nuevo[j]=sudoku[j][i];
				compruebaArray19();
			}
		}
		
		
	}
	static void comprobarcuadrante(){
		System.out.println("Comprobar cuadrante");
	int controlfila=0;
	int controlcolumna=0;
		for(int i=0;i<sudoku.length;i++){
			
			for(int k=0;k<control.length;k++){
				control[k]=0;
			}
			
			for(int k=0;k<3;k++){
				for(int j=0;j<3;j++){
					nuevo[k+j]=sudoku[k+controlfila][j];
				}
			}
			compruebaArray19();
			controlfila+=3;
		}
		
		
			for(int i=0;i<sudoku.length;i++){
			
				for(int k=0;k<control.length;k++){
					control[k]=0;}
			for(int k=0;k<3;k++){
				for(int j=0;j<3;j++){
					nuevo[k+j]=sudoku[k][j+controlcolumna];
				}
			}
			compruebaArray19();
			controlcolumna+=3;
		}
	}
	static void comprobarcolumna(){
		System.out.println("Comprobar columna");
		
	
		for(int i=0;i<sudoku[0].length;i++){
			
				control[i]=0;
				nuevo[i]=0;
			
			for(int j=0;j<sudoku[0].length;j++){
				nuevo[i]=sudoku[i][j];
				compruebaArray19();
			}
		}
		
	}
	static void comprobar(){
		boolean salir=false;
		for ( int i=0;i<nuevo.length;i++){
			
			for(int k=0;k<nuevo.length;k++){
				if(nuevo[sudoku[i][k]]){!nuevo[sudoku[i][k]]=1;salir=true;}
			}
		}
		if(salir)System.out.println("El sudoku no cumple las condiciones");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 6.- Escribe la función CompruebaSudoku a la que le pasas una matriz de 9x9 enteros y
te dice si la matriz contiene un sudoku correcto (devuelve un bool que será true si es
correcto). Un sudoku será correcto si en cada fila, en cada columna y en cada submatriz
de 3x3 aparecen todos los números del 1 al 9 y una sola vez cada uno. Se recomienda
crear la función CompruebaArray19 al que le pasas un array de 9 enteros y te dice si en
él se encuentran todos los números del 1 al 9 una sola vez. Con esta función, sólo
tendréis que pasar cada fila, columna y submatriz a un array de 9 enteros y pasárselo a
esta función para comprobar si está bien.
 */
	
	//	comprobarfila();
		// comprobarcolumna();
		comprobarcuadrante();
	}

}
