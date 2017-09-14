/*
 * En una carretera se ha colocado un detector de señales. Si pasa:
BICLICLETA............ SEÑAL 0
MOTO........................ “ 1
COCHE...................... “ 2
CAMION.................... “ 3
ERROR....................... “ >3
El proceso se interrumpe sí:
A.- Se generan 10000 señales
B.- Se producen 3 errores consecutivos
Al final se pide:
A.- Vehículo que más pasó
B.- Mayor intervalo entre dos coches
 */
import java.util.Scanner;


public class ProblemasPropuestos14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		char inicio=' ';
		int A=0;
		int j=0;
		int Dif=0;
		while(inicio!='s'){
		System.out.println("Desea iniciar el programa");
		inicio=teclado.next().charAt(0);
		}
		int contador=0;
		int contbici=0;
		int contmoto=0;
		int contcoche=0;
		int contcamion=0;
		int distancia=0;
		int senal;
		int contadorcontrol=0;
		boolean control=true;
		for(int i=0;i<100 && contador<3;i++){
			senal=(int)(Math.random()*(4+0));
			
			switch(senal){
			case 0: contbici++;contador=0;
			break;
			case 1: contmoto++;contador=0;
			break;
			case 2: contcoche++;contador=0;
			if(control){
				contadorcontrol=i;
				control=false;
			}else{
			A=i-contadorcontrol;if(A>Dif){Dif=A;};contadorcontrol=i;}
			break;
			case 3: contcamion++;contador=0;
			break;
			case 4: contador++;
			break;
			}
			
			
		}
		
		System.out.println("El numero de veces que pasa una bici es " + contbici);
		System.out.println("El numero de veces que pasa una moto es " + contmoto);
		System.out.println("El numero de veces que pasa una coche es " + contcoche);
		System.out.println("El numero de veces que pasa una camion es " + contcamion);
		System.out.println("La distancia mayor entre dos coches es " + Dif);
	if(contbici>contmoto && contbici>contcoche && contbici>contcamion){
		System.out.println("El vehiculo que mas pasa es la bicicleta");
	}else if(contbici<contmoto && contmoto>contcoche && contmoto>contcamion){
		System.out.println("El vehiculo que mas pasa es la moto");
	}else if(contbici<contcoche && contbici<contcoche && contcoche>contcamion){
		System.out.println("El vehiculo que mas pasa es el coche");
	}else if(contcamion>contmoto && contcamion>contcoche && contbici<contcamion){
		System.out.println("El vehiculo que mas pasa es el camion");
	}
	
	}

}
