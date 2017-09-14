/*
 * 3. Haz un programa que pida frases, mientras no sea “*” que indica el final y me diga
cuál es la frase más corta introducida y su longitud
 */
import java.util.Scanner;

public class ProblemasPropuestos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		String A;
		System.out.println("Introduzca una frase");
		A=teclado.nextLine();
		String B;
		B="pepe";
		boolean primera=true;
		String C="*";
		
		
		while(A.compareTo(C)!=0){
			
		
		if(primera){
			primera=false;
			
		}else if(!primera){
			
			if(A.compareToIgnoreCase(B)<0){
				A=A;
			}else if(A.compareToIgnoreCase(B)>0){
				A=B;
			}else if(A.compareToIgnoreCase(B)==0){
				A=A;
		}
		System.out.println("Introduzca otra frase");
			B=teclado.nextLine();
			
			}
			
		}
		System.out.println("La cadena mas pequeña es " + B);
		System.out.println("la cadena tiene una medida de " + B.length());
		}
		
		
						
				
	
	
	}
