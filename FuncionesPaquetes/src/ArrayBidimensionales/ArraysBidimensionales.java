package ArrayBidimensionales;

public class ArraysBidimensionales {

	public static int[][] generaArrayBiInt(int f, int c, int a,int b){
		f = (int)(Math.random()*a+b);
		c= (int)(Math.random()*a+b);
		int[][]n=new int[f][c];
		
		return n;
	}
	public static int[] filaDeArrayBiInt(int n[][], int b){
		
		int[]v=new int[n[0].length];
		for(int i=0;i<n[0].length;i++){
			v[i]=n[b][i];
		}
		
		return v;
	}
	public static int[] columnaDeArrayBiInt(int n[][], int b){
		
		int[]v=new int[n.length];
		for(int i=0;i<n.length;i++){
			v[i]=n[i][b];
		}
		
		return v;
	}
	public static int[] coordenadasEnArrayBiInt(int n[][],int a){
		boolean control=true;
		int f=0;
		int c=0;
		int array[]=new int[2];
		array[0]=-1;
		array[1]=-1;
		while(control && f<n.length){
			while(control && c<n[0].length){
				if(n[f][c]==a){
					control=false;
					array[0]=f;
					array[1]=c;
					}
				c++;
				}
			f++;
			}
		return array;
		
		}
	public static boolean esPuntoDeSilla(int n[][],int f, int c){
		boolean controlcolumna=false;
		boolean controlfila=false;
		boolean control=false;
		for(int i=0;i<n.length;i++){
			if(n[i][c]>n[f][c])controlcolumna=true;
		}
		for(int i=0;i<n[0].length;i++){
			if(n[f][i]>n[f][c])controlfila=true;
		}
		if(controlcolumna && controlfila)control=true;
		return control;
	}
	public static int[] diagonal(int n[][],int f,int c, String cadena){
		int v[]=new int [n[0].length];
		int i=0;
		if(cadena.equals("nose")){
		while(c<0 || f>n.length){
			c=c-1;
			f=f+1;
		}
		while(c<n[0].length || f<n.length){
			v[i]=n[f][c];
			i++;
			c++;
			f--;
		}
		}else if(cadena.equals("neso")){
			while(c>n[0].length || f<0){
				c=c+1;
				f=f-1;
			}
			while(c<n[0].length || f<n.length){
				v[i]=n[f][c];
				i++;
				c--;
				f++;
			}
		}
		return v;
	}
}
