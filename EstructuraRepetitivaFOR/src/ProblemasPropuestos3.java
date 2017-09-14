/*
 * Realiza un programa para enseñar a un alumno la tabla de multiplicar., se
empezará preguntando desea repasar tabla (s/n), después se pedirá la tabla y se
controlará que sea un numero entre 1 y 10 , después aparecerá en pantalla
n*1= si el alumno da la respuesta correcta se pasa al número siguiente n+2= y
así hasta llegar a n*10=, en caso de respuesta incorrecta se le dará la respuesta
correcta “error la respuesta correcta es..” y se contara un error, cuando
lleguemos al final si el numero de errores es menor o igual que 3 se le dirá
“apto” en caso contrario “no apto” y se volverá a preguntar si desea repasar otra
tabla
 */

import java.util.Scanner;

public class ProblemasPropuestos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
	
	int Z=0;//comienzo
	int B=0;//tabla a repasar
	int f=0;//cantidad
	int C=0;// resultado de la multiplicacion
	int E=0; // numero de errores
	char D='s';
	while(Z==0){
		System.out.println("Desea repasar la tabla de multiplicar(s/n)");
		D=teclado.nextLine().charAt(0);
			if(D=='s'){
				System.out.println("Selecciona la tabla que deseas repasar");
				B=teclado.nextInt();
				
					for(f=1;f<=10;f++){
						System.out.println("Multiplica " +  B + "*" + f);
						C=teclado.nextInt();
							if(B*f!=C){
								System.out.println("Has fallado,a respuesta correcta es " + (B*f));
								E=E+1;}
					}
					if(E<=3){
						System.out.println("Eres Apto");
						}else if(E<3){
							System.out.println("No apto");}
					teclado.nextLine();
				}	
		
	
	
			}}}
	
	


