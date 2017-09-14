package Arrays;

public class ArraysVarias {

	public static int[] generaArrayInt(int n,int a, int b){
	
		int v[] = new int[n];
		for(int i=0;i<v.length;i++){
			v[i] = (int)(Math.random()*a+b);
		}
		return v;
	}
	public static int minimoArrayInt(int v[]){
		int minimo=v[0];
		for(int i=1;i<v.length;i++){
			if(minimo>v[i])minimo=v[i];
		}
		return minimo;
	}
	public static int maximoArrayInt(int v[]){
		int maximo=v[0];
		for(int i=1;i<v.length;i++){
			if(maximo<v[i])maximo=v[i];
		}
		return maximo;
	}
	public static int mediaArrayInt(int v[]){
		int media=0;
		for(int i=0;i<v.length;i++){
			media+=v[i];
		}
		media=media/v.length;
		return media;
	}
	public static boolean estaEnArrayInt(int v[],int c){
		boolean control=false;
		for(int i=0;i<v.length;i++){
			if(v[i]==c)control=true;
		}
		return control;
	}
	public static int posicionEnArray(int v[],int c){
		int posicion = -1;
		for(int i=0;i<v.length;i++){
			if(v[i]==c)posicion=i;
		}
		return posicion;
	}
	public static int[] volteaArrayInt(int v[]){
		int c[]= new int[v.length];
		for(int i=0;i<v.length;i++){
			c[v.length-1-i]=v[i];
		}
		for(int i=0;i<v.length;i++){
			v[i]=c[i];
		}
		
		return v;
	}
	public static int[] rotaDerechaArrayInt(int v[], int b){
		int c[] = new int[v.length];
		int contador=0;
		for(int i=0;i<v.length;i++){
			if((i+b)<=v.length){
				c[(i+b)]=v[i];
			}else {
				c[contador]=v[i];
				contador++;
			}
			
		}
		for(int i=0;i<v.length;i++){
			v[i]=c[i];
		}
		return v;
	}
	public static int [] rotaIzquierdaArrayInt(int v[],int b){
		int c[]=new int[v.length];
		int contador=0;
		for(int i=0;i<v.length;i++){
			if((i-b)>=0){
				c[(i-b)]=v[i];
			}else{
				c[contador]=v[i];
			}
		}
		for(int i=0;i<v.length;i++){
			v[i]=c[i];
		} return v;
	}
}
