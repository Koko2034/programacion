

public class Sudoku {

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
	static int[]nuevo =new int[9];
	static boolean control=true;
	
	static void compruebaArray19(){
		comprobarfilas();
		comprobarcolumnas();
		comprobarcuadrantes();
	}
	static void comprobarfilas(){
		control=true;
		for( int i=0;i<nuevo.length;i++){
			for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
			for(int j=0;j<nuevo.length;j++){
				if(nuevo[(sudoku[i][j])-1]==0){
					nuevo[(sudoku[i][j])-1]=1;
				}
				else control=false;
			}
		}
		if(!control)System.out.println("El sudoku falla por filas");
		else System.out.println("El sudoku esta bien por filas");
		
		/*
		 * i=0;j=0;
		 * while( !control || i<9){
		 * for(int k=0;k<nuevo.length;k++)
		 * while( !control || j<9){
		 * if(nuevo[(sudoku[i][j])-1]==0){
		 * nuevo[(sudoku[i][j])-1]=1;}
		 * else control=false;
		 * j++;
		 * }
		 * i++
		 * }
		 * 
		 */
	}
	static void comprobarcolumnas(){
		control=true;
		for( int i=0;i<nuevo.length;i++){
			for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
			for(int j=0;j<nuevo.length;j++){
				if(nuevo[(sudoku[j][i])-1]==0){
					nuevo[(sudoku[j][i])-1]=1;
				}
				else control=false;
			}
		}
		if(!control)System.out.println("El sudoku falla por columnas");
		else System.out.println("El sudoku esta bien por columnas");
	}
	static void comprobarcuadrantes(){
		control=true;
		int contador=0;
		for(int i=0;i<3;i++){
			for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
			for(int j=0;j<3;j++){
				
				for(int h=0+contador;h<3+contador;h++){
					if(nuevo[(sudoku[j][h])-1]==0) {nuevo[(sudoku[j][h])-1]=1;}
					else control=false;
				}
			}
			contador+=3;
			
			
		}
		
		contador=0;
		for(int p=0;p<3;p++){
			for(int o=0;o<nuevo.length;o++) nuevo[o]=0;
			for(int q=3;q<6;q++){
				for(int r=0+contador;r<3+contador;r++){
					if(nuevo[(sudoku[q][r])-1]==0){ nuevo[(sudoku[q][r])-1]=1;}
					else control=false;
				}
			}
			contador+=3;
		}
		contador=0;
		for(int i=0;i<3;i++){
			for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
			for(int j=6;j<9;j++){
				for(int h=0+contador;h<3+contador;h++){
					if(nuevo[(sudoku[j][h])-1]==0){ nuevo[(sudoku[j][h])-1]=1;}
					else control=false;
				}
			}
			contador+=3;
		}
		
		if(!control) System.out.println("El sudoku por cuadrantes da error");
		else System.out.println("El sudoku por cuadrantes esta correcto");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comprobarfilas();
		comprobarcolumnas();
		comprobarcuadrantes();
	}

}