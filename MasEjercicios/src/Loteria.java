import java.util.Scanner;

public class Loteria {
static int[]ganadora=new int[7];
static int[]comprobacion=new int[50];
static int[]vector=new int[7];
static int[]premio=new int[5];
	static void premio(){
	int i;
	System.out.println("El reparto de premios de la loteria del dia de hoy es:");
	i=(int)(Math.random()*25+20)*100000;
	premio[0]=i;
	System.out.println("6 Aciertos: " + i + " € ");
	i=(int)(Math.random()*25+20)*10000;
	premio[1]=i;
	System.out.println("5 Aciertos y Complementario: " + i + " € ");
	i=(int)(Math.random()*15+10)*10000;
	premio[2]=i;
	System.out.println("5 Aciertos: " + i + " € ");
	i=(int)(Math.random()*25+20)*1000;
	premio[3]=i;
	System.out.println("4 Aciertos: " + i + " € ");
	i=(int)(Math.random()*25+20)*100;
	System.out.println("3 Aciertos: " + i + " € ");
	premio[4]=i;
}	
	static void ganadora(){
		int j=0;
		while(j<ganadora.length-1){
			int i=(int)(Math.random()*48+1);
			if(comprobacion[i]==0){
				comprobacion[i]=1;
				ganadora[j]=i;
				j++;}
			}
		j=0;
		while(j==0){
			int i=(int)(Math.random()*9+1);
			if(comprobacion[i]==0){
			comprobacion[i]=1;
				ganadora[ganadora.length-1]=i;
				j++;
			}
			}
		}
	static void ver_ganadora(){
		System.out.println("La combinacion ganadora es:");
		for(int i=0;i<ganadora.length-1;i++)System.out.print ( ganadora[i] + " ");
		System.out.println();
	System.out.println("El numero complementario es " + ganadora[ganadora.length-1]);
	}
	static int comprobar(int[]vector){
		int contadoraciertos=0;
		for(int i=0;i<vector.length-1;i++ ){
			for(int j=0;j<ganadora.length-1;j++){
				if(vector[i]==ganadora[j]) contadoraciertos++;}
		}
		return contadoraciertos;
	}
	static boolean comprobar_comple(int[]vector){
		boolean complementarioacertado;
		if(vector[vector.length-1]==ganadora[ganadora.length-1]) {complementarioacertado=true;}
		else {complementarioacertado=false;}
		return complementarioacertado;
	}
	static void aciertos(boolean complementarioacertado){
		if(complementarioacertado)System.out.println("Hemos acertado el numero complementario");
		else System.out.println("Hemos fallado el numero complementario");
		
	}
	static void comprobacionpremio(int contadoraciertos, boolean complementarioacertado){
		switch(contadoraciertos){
		case '6': System.out.println("El premio ganado es de " + premio[0]);
		break;
		case '5': if(complementarioacertado) System.out.println("El premio ganado es de " + premio[1]);
		else System.out.println("El premio ganado es de " + premio[2]);
		break;
		case'4': System.out.println("El premio ganado es de " + premio[3]);
		break;
		case '3': System.out.println("El premio ganado es de " + premio[4]);
		break;
		default: System.out.println("Lo sentimos pero su boleto no ha sido premiado");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ganadora();
		premio();
		ver_ganadora();
		Scanner teclado=new Scanner(System.in);
		int i=0;
		int j;
		for(int h=0;h<comprobacion.length;h++) comprobacion[h]=0;
		while(i<7){
			System.out.println("Introduce el numero " + (i+1) + " de tu boleto.");
			j=teclado.nextInt();
			if(j>0 && j<50){
				if(comprobacion[j]==0){
				vector[i]=j;
				comprobacion[j]=1;
				i++;}
				else System.out.println("No puedes repetir el numero escogido.");
			}else System.out.println("El numero escogido no es valido. Solo numeros entre 1 y 49");
		}
		ver_ganadora();
		int contadoraciertos=comprobar(vector);
		System.out.println("El numero de aciertos de nuestro boleto es " + contadoraciertos);
		boolean complementarioacertado=comprobar_comple(vector);
		comprobacionpremio(contadoraciertos, complementarioacertado);
		aciertos(complementarioacertado);
	
		}
	}
