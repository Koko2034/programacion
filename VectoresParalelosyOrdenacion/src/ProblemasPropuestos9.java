import java.util.Scanner;

public class ProblemasPropuestos9 {

	static int[]dia1=new int[5];
	static int[]dia2=new int[5];
	static int[]dia3=new int[5];
	static String[]encuestadores=new String[5];
	static int[]ganancia=new int[5];
	static int[]premios=new int[5];
	static int[]ramses=new int[5];
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<encuestadores.length;i++){
		System.out.println("Introduzca un nombre");
		encuestadores[i]=teclado.nextLine();
		}
		teclado.nextLine();
		for(int i=0;i<dia1.length;i++){
			dia1[i]=(int)(Math.random()*500+0);
		}
		for(int i=0;i<dia2.length;i++){
			dia2[i]=(int)(Math.random()*500+0);
		}
		for(int i=0;i<dia3.length;i++){
			dia3[i]=(int)(Math.random()*500+0);
		}
		}
	static void ordenar(){
		for(int k=0;k< encuestadores.length-1;k++) {
			for(int f=0;f< encuestadores.length -1-k;f++) {
			if (encuestadores[f].compareTo(encuestadores[f+1])>0) {
			String aux;
			aux=encuestadores[f];
			encuestadores[f]=encuestadores[f+1];
			encuestadores[f+1]=aux;
			int auxdia1;
			auxdia1=dia1[f];
			dia1[f]=dia1[f+1];
			dia1[f+1]=auxdia1;
			int auxdia2;
			auxdia2=dia2[f];
			dia2[f]=dia2[f+1];
			dia2[f+1]=auxdia2;
			int auxdia3;
			auxdia3=dia3[f];
			dia3[f]=dia3[f+1];
			dia3[f+1]=auxdia3;
			}
			}
			}
			}
		static void calculoganancias(){
			for(int i=0;i<ganancia.length;i++){
				ganancia[i]=dia1[i]+dia2[i]+dia3[i]+premios[i];
				
			}
		}
		static void calculopremios(){
		for(int i=0;i<premios.length;i++){
				if(dia1[i]>=100 && dia2[i]>=100 && dia3[i]>=100){
			
					premios[i]=premios[i]+100;
					
				}
				
			}
			int mayor=0;
			int auxmayor=0;
			for(int k=0;k<ramses.length;k++){
			ramses[k]=dia1[k]+dia2[k]+dia3[k];
				if(mayor<ramses[k]){
				mayor=ramses[k];
				auxmayor=k;
			}
			
		
			}
			premios[auxmayor]=premios[auxmayor]+200;
			
		}
		
		static void imprimir(){
			System.out.print("Encuestadores dia 1  dia 2 dia 3 Ganancia Premios");
		for(int i=0;i<encuestadores.length;i++){
			System.out.println();
			System.out.print(encuestadores[i]+" ");
			System.out.print(dia1[i]+" ");
			System.out.print(dia2[i]+" ");
			System.out.print(dia3[i]+" ");
			System.out.print(ganancia[i]+" ");
			System.out.print(premios[i]);
		}	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 9.-Una empresa dispone de 5 encuestadores para realizar una campa�a.
Por cada encuesta paga 1� y adem�s se establecen los siguientes premios:
Uno de 200� al encuestador que mayor n�mero de encuestas realice y
otros de 100 � para todos aquellos que hagan 100 encuestas como
m�nimo durante todos y cada uno de los d�as que dura la campa�a.
La campa�a dura 3 d�as y de cada encuestador se introduce nombre
y las encuestas realizadas en cada uno de los 3 d�as (generar un numero
aleatoriomentre 0 y 500).
Se desea un programa que al final imprima un listado con el siguiente
formato:
NOMBRE APELLIDOS DIA-1 DIA-2 DIA-3 GANANCIAS PREMIO
El listado debe ir en orden alfab�tico, l�gicamente los datos no se introducen
ordenados.
		 */
		iniciar();
	imprimir();
		ordenar();
		calculopremios();
		calculoganancias();
		imprimir();
		
	}

}
