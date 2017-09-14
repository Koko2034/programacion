
public class Sudoku2 {

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
		int i=0;
		int j=0;
		while( i<nuevo.length && control){
		
			for(int k=0;k<nuevo.length;k++) nuevo[k]=0;
			while(j<nuevo.length && control){
			
				if(nuevo[(sudoku[i][j])-1]==0){
					nuevo[(sudoku[i][j])-1]=1;
				}
				else control=false;
				j++;
			} i++;
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
			
				if(nuevo[(sudoku[j][i])-1]==0){
					nuevo[(sudoku[j][i])-1]=1;
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
				
					if(nuevo[(sudoku[j][h])-1]==0) {nuevo[(sudoku[j][h])-1]=1;}
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
					if(nuevo[(sudoku[q][r])-1]==0){ nuevo[(sudoku[q][r])-1]=1;}
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
					if(nuevo[(sudoku[j][h])-1]==0){ nuevo[(sudoku[j][h])-1]=1;}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

compruebaArray19();

	}

}
