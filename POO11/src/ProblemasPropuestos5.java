import java.util.Scanner;

public class ProblemasPropuestos5 {

	private String cadena;
	
	public void inicializar(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un texto");
		cadena=teclado.nextLine();
		cadena=cadena.substring(0, cadena.indexOf('*'));
		System.out.println(cadena);
	}
	
	public void imprimir(){
		System.out.println("La longitud de mi texto es " + cadena.length());
		
	}
	public void contar(){
		
		
		
	}
	public void invertir(){
String cadena3;
		
		cadena.indexOf(' ');
		String cadena2=cadena.substring(0, cadena.indexOf(' '));
		if(cadena2.length()==4){
			cadena3="****";
		}else{cadena3=cadena2;}
		String total="";
		total=total+cadena3+"";
		System.out.println(total);
	}
	public void sustituir(){
		String cadena2;
		String cadena3;
		int localiza=0;
		localiza=cadena.indexOf(' ');
		for(int i=0;i<cadena.length(); i++){
		cadena=cadena.substring(localiza, cadena.length());
		cadena2=cadena.substring(0, localiza);
		if(cadena2.length()==4){
			cadena3="****";
		}else{cadena3=cadena2;}
		String frase="";
		frase=frase+cadena3+" ";
		System.out.println(frase);}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa que lea frases hasta que el primer car�cter introducido sea un *
y realizar los siguientes m�todos:
Metodo imprimir: Imprimir� la longitud de la cadena
Metodo contar: contar� el n�mero de palabras de 4 letras
Metodo sustituir: sustituir� cada palabra de 4 letras por una cadena de 4 *
e imprimir� la cadena resultante.
Metodo invertir: Invertir� cada una de las palabras que forman la frase. Los
espacios en blanco deben conservarse:
entrada: invertir esta frase
salida : ritrevni atse esarf
		 */
		
		ProblemasPropuestos5 frase;
		frase=new ProblemasPropuestos5();
		
		frase.inicializar();
		frase.contar();
		frase.sustituir();
		
	}

}
