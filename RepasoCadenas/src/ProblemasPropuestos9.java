import java.util.Scanner;

public class ProblemasPropuestos9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
		int numero=0;
		
		 numero=(int)(Math.random()*13+1);
		 String cadena=String.valueOf(numero);
		switch(numero){
		case 1: cadena="A";
		break;
		case 11: cadena="J";
		break;
		case 12: cadena="Q";
		break;
		case 13: cadena="K";
		break;
		}
		
		int palo;
		palo=(int)(Math.random()*4+1);
		String cadena2=String.valueOf(palo);
		switch(palo){
		case 1: cadena2="picas";
		break;
		case 2: cadena2="corazones";
		break;
		case 3: cadena2="treboles";
		break;
		case 4: cadena2="diamantes";
		break;
		
		
		}System.out.println("Tu carta es " + cadena + " del "+ cadena2);	
	}

}
