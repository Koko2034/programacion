import java.util.Scanner;

public class ProblemasPropuestos5 {

	static int[][] mat=new int[5][3];
	static int[]mayor=new int[5];
	static int[]menor=new int[5];
	static void inicializar(){
		for(int f=0;f<mat.length;f++){
			for(int c=0;c<mat[0].length;c++){
				
				mat[f][c]=(int)(Math.random()*30+20);
				
			}
			
		} 
	}
	static void calcular(){
		
		boolean control;
		for(int f=0;f<mat.length;f++){
			control=true;
			for(int c=0;c<mat[0].length;c++){
				if(control){ control=false;
				mayor[f]=mat[f][c];
				}
				else{
				if(mat[f][c]>mayor[f]) mayor[f]=mat[f][c];	
				
				
				}
			}
			
		}
		for(int f=0;f<mat.length;f++){
			control=true;
			for(int c=0;c<mat[0].length;c++){
				if(control){ control=false;
				menor[f]=mat[f][c];}
				else{
				if(mat[f][c]<menor[f]) menor[f]=mat[f][c];	
				
				
				}
			}
			
		}
		
	}
	static void imprimir(){
		for(int f=0;f<mat.length;f++){
			for(int c=0;c<mat[0].length;c++){
				
				System.out.print(" "+ mat[f][c]+"");
			}
			System.out.println();
		}
		for(int i=0;i<mayor.length;i++){
			System.out.println("El numero mayor de la fila " + (i+1) + " es " + mayor[i]);
		}
		for(int i=0;i<menor.length;i++){
			System.out.println("El numero menor de la fila " + (i+1) + " es " + menor[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5.-Carga una matriz de 5 * 3 de forma aleatoria con números entre 20 y 50
obtén el elemento menor de cada fila y el elemento mayor de cada columna
		 */
		
		inicializar();
		calcular();
		imprimir();
	}

}
