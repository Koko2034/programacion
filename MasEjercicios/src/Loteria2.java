import java.util.Scanner;
public class Loteria2 {

	static int[]combinacion=new int[7];
	static int[]vector=new int[50];
	static int[]boleto=new int[7];
	static int contadoraciertos=0;
	static boolean complementarioacierto;
	static void combinacion(){
		int i=0;
		while(i<7){
			int numero=(int)(Math.random()*49+1);
		if(vector[numero]==0){combinacion[i]=numero;i++;}
			
		}	
	}
	static void crearboleto(){
		Scanner teclado=new Scanner(System.in);
		int i=0;
		int numero;
		for(int j=0;j<vector.length;j++)vector[j]=0;
		while(i<6){
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		if(numero<50 && numero>0 && vector[numero]==0){boleto[i]=numero; i++;}
		}
		i=0;
		while(i==0){
		System.out.println("introduce el numero complementario");
		numero=teclado.nextInt();
		if(numero<50 && numero>0 && vector[numero]==0){ boleto[boleto.length-1]=numero;i++;}
		}
			}
	static void aciertos(){
		for(int i=0;i<combinacion.length-1;i++){
			for(int j=0;j<boleto.length-1;j++){
				if(combinacion[i]==boleto[j]) contadoraciertos++;
			}
		}
		
		System.out.println(" El numero de aciertos de nuestro boleto es " + contadoraciertos);
	}
	static void complementario(){
		if(combinacion[combinacion.length-1]==boleto[combinacion.length-1]) {complementarioacierto=true; System.out.println("Hemos acertado el numero complementario");}
		else {complementarioacierto=false;System.out.println("Hemos fallado el numero complementario");}
		
	}
	static void premios(){
		switch(contadoraciertos){
		case 6 :if(complementarioacierto) System.out.println("Has acertado 6 numeros y el complementario tu premio es 500");
		else System.out.println("Has acertado 6 numeros tu premio es 400");
		break;
		case 5: if(complementarioacierto) System.out.println("Has acertado 5 numeros y el complementario tu premio es 300");
		else System.out.println("Has acertado 5 numeros tu premio es 300");
		break;
		case 4: System.out.println("Has acertado 4 numeros y tu premio es 250");
		break;
		case 3:System.out.println("Has acertado 3 numeros y tu premio es 200");;
		break;
		default: System.out.println(" Su boleto no ha sido premiado");
		}
	}
	static void imprimir(){
		System.out.println("La combinacion ganadora es");
		for(int i=0;i<combinacion.length-1;i++)System.out.print (" " + combinacion[i]);
		System.out.println();
		System.out.println("El complementario es " + combinacion[combinacion.length-1]);
		System.out.println("Nuestra combinacion es:");
		for(int i=0;i<boleto.length-1;i++) System.out.print( " " + boleto[i]);
		System.out.println();
		System.out.println("El complementario es " + boleto[boleto.length-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		combinacion();
		imprimir();
		crearboleto();
		aciertos();
		complementario();
		premios();
	}

}
