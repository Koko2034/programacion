package Matematicas;

public class Varias {

	
	public static boolean esPrimo(int x){
		
		for(int i=2;i<x;i++){
			if(x%i==0) {return false;}
			
			
		}
		return true;
		
	}
	public static int potencia(int b, int e){
		
		int potencia=(int)Math.pow(b, e);
		
		return potencia;
		
	}
	public static int digitos(int b){
		
		String cadena=String.valueOf(b);
		int digitos=cadena.length();
		return digitos;
		
	}
	public static int voltea(int b){
		
		String cadena=String.valueOf(b);
		String cadena2="";
		for(int i=0;i<cadena.length();i++){
			cadena2=cadena2 + cadena.charAt(cadena.length()-1-i);
		}
		
		int voltea=Integer.parseInt(cadena2);
		return voltea;
	}
	public static boolean esCapicua(int b){
		
		String cadena=String.valueOf(b);
		String cadena2="";
		for(int i=0;i<cadena.length();i++){
			cadena2=cadena2 + cadena.charAt(cadena.length()-1-i);
		}
		
		if(cadena.equals(cadena2)) return true;
		else return false;
		
		
	}
	public static boolean siguientePrimo(int x){
		x=x+1;
		for(int i=2;i<x;i++){
			if(x%i==0) {return false;}
			
			
		}
		return true;
		
	}
	public static int digitoN(int b,int n){
		String cadena=String.valueOf(b);
		int num=(int)cadena.charAt(n);
		return num;
	}
	public static int posicionDeDigito(int b,int c){
		String cadena=String.valueOf(b);
		int posicion=0;
		boolean control=true;
		int x;
		for(int i=0;i<cadena.length();i++){
			x=(int)cadena.charAt(i);
			if(b==x) posicion=i;control=false;
			
		}
		if(control) return posicion;
		else return -1;
		
	}
	public static int quitaPorDetras(int n,int cant){
		String cadena=String.valueOf(n);
		cadena=cadena.substring(0, cadena.length()-cant);
		n=Integer.parseInt(cadena);
		return n;
	}
	public static int quitaPorDelante(int n, int cant){
		String cadena=String.valueOf(n);
		cadena=cadena.substring(cant,cadena.length());
		n=Integer.parseInt(cadena);
		return n;
		
		
	}
	public static int pegaPorDetras(int b,int c){
		String cadena=String.valueOf(b);
		String cadena2=String.valueOf(c);
		String resultado=cadena+cadena2;
		int num=Integer.parseInt(resultado);
		return num;
	}
	public static int pegaPorDelante(int b,int c){
		String cadena=String.valueOf(b);
		String cadena2=String.valueOf(c);
		String resultado=cadena2+cadena;
		int num=Integer.parseInt(resultado);
		return num;
		
	}
	public static int trozoDeNumero(int b,int c,int d){
		String cadena=String.valueOf(b);
		cadena=cadena.substring(c,d);
		int numero=Integer.parseInt(cadena);
		return numero;
	}
	public static int juntaNumeros(int b, int c){
		String cadena=String.valueOf(b);
		String cadena2=String.valueOf(c);
		String resultado=cadena2+cadena;
		int num=Integer.parseInt(resultado);
		return num;
	}
}
