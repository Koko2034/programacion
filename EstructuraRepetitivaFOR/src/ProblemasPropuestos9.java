/*
 * Representa el funcionamiento de un reloj. Ya sabes que tiene 24 horas, cada
hora 60 minutos y cada minuto 60 segundos. El programa pregunta ¿Quieres que
funcione el reloj (s/n)? En caso afirmativo funcionará durante 24 horas y volverá
a preguntar una vez que se llegue a 23:59:59 termina al indicar que no
queremos que funcione.
 */

import java.util.Scanner;

public class ProblemasPropuestos9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int G=9;
		char A='p';
	
		
		Scanner teclado=new Scanner(System.in);
		while(G==9){
		System.out.println("Quieres que funcione el reloj(s/n)?");
		A=teclado.next().charAt(0);
		/*
		 * while(h<=23 && m<=59 && s<=59){
				s++;
				
			if(s==60){
				s=0;m=m+1;
			}if(m==60){
				m=0;h=h+1;
			}
		 */
		for(int h=0;h<=23;h++){
			for(int m=0;m<=59;m++){
				for(int s=0;s<=59;s++){
					System.out.println("La hora es: "+  h + " horas " + m + " minutos " + s + " segundos");
				}
			}
		}
			
			
		}	}
		}	
	

