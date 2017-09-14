import java.util.Scanner;

public class ProblemasPropuestos7 {
	static String[] paises=new String[4];
	static int[][] tem=new int[12][12];
static int[][] temtri=new int[4][4];
static int [] mayor=new int[4];
	static int temperatura;
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<4;i++){
		System.out.println("Introduce el nombre del primer pais");
		paises[i]=teclado.nextLine();
		for(int j=0;j<12;j++){
		//System.out.println("Introduce la temperatura mensual");
		//teclado.nextLine();
		//tem[i][j]=teclado.nextInt();
		tem[i][j]=(int)(Math.random()*30);
		}
		}
		}
	static void imprimir(){
		for(int i=0;i<4;i++){
			System.out.print(" "+paises[i]+" ");
			for(int j=0;j<12;j++){
				System.out.print(" " + tem[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void calcular(){
		for(int i=0;i<4;i++){
			int cont=0;
			for(int j=0;j<4;j++){
				int h=0;
			temtri[i][j]=(tem[i][(h+cont)]+tem[i][(h+1+cont)]+tem[i][(h+2+cont)])/3;
			System.out.println(cont);
			cont+=3;
			}
			
		}
	}
	static void imprimir2(){
		for(int i=0;i<4;i++){
			System.out.print(" "+paises[i]+" ");
			for(int j=0;j<4;j++){
				System.out.print(" " + temtri[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void mayor(){
			boolean control;
			for(int i=0;i<4;i++){
			control=true;
			for(int j=0;j<4;j++){
			if(control){ control=false;
				mayor[i]=temtri[i][j];
			}	else { if(temtri[i][j]>mayor[i]) mayor[i]=temtri[i][j];}
			}
			
			
		}
			
			
			for(int i=0;i<4;i++){
				control=true;
				int mayor=0;
				for(int j=0;j<4;j++){
					if(control){control=false;
					mayor=temtri[i][j];
					}else{
						if(temtri[i][j]>mayor)
							mayor=temtri[i][j];
					}
				
				}
				System.out.println(" En " + paises[i] + " la temperatura trimestral mayor es " + mayor);
			}
			
		}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 7.-Se desea saber la temperatura media trimestral de cuatro países. Para ello se
tiene como dato las temperaturas medias mensuales de dichos países.
Seleccionar las estructuras de datos adecuadas para el almacenamiento de los
datos en memoria.
a - Cargar por teclado los nombres de los paises y las temperaturas medias
mensuales.
b - Imprimir los nombres de las paises y las temperaturas medias mensuales de las
mismas.
c - Calcular la temperatura media trimestral de cada país.
d - Imprimir los nombres de los paises y las temperaturas medias trimestrales.
e - Imprimir el nombre del pais con la temperatura media trimestral mayor.
		 */
		iniciar();
		imprimir();
		calcular();
		imprimir2();
		mayor();
	}

}
