import java.util.Scanner;

public class ProblemasPropuestos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		String cadena;
		System.out.println("Introduzca una frase");
		cadena=teclado.nextLine();
		int longitud;
		longitud=cadena.length();
		char Z=' ';
		String claven="";
		int i=0;
		String clavea="";
		int contador=0;
		int contador2=0;
		while(contador!=3 || contador2!=3){
			Z=cadena.charAt(i);
			if(contador<3 && (Z=='a' || Z=='e' ||Z=='i' ||Z=='o' ||Z=='u') ){
				switch(Z){
				case 'a': Z='1';
					break;
				case 'e': Z='2';
					break;
				case 'i': Z='3';
					break;
				case 'o': Z='4';
					break;
				case'u': Z='5';
					break;
					
				}
				contador++;
				claven=claven+Z;
			}else if(Z!=' ' && contador2<3){
				clavea=clavea+Z;
				contador2++;
			}
			i++;
			
	} System.out.println(clavea + claven);
			
		}
		
		}
		

	
