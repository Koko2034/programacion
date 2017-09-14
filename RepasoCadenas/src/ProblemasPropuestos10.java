
public class ProblemasPropuestos10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		
		 numero=(int)(Math.random()*12+1);
		String cadena=String.valueOf(numero);
		switch(numero){
		case 1: cadena="As";
		break;
		case 10: cadena="Sota";
		break;
		case 11: cadena="Caballo";
		break;
		case 12: cadena="Rey";
		break;
		}
		
		int palo;
		palo=(int)(Math.random()*4+1);
		String cadena2=String.valueOf(palo);
		switch(palo){
		case 1: cadena2="Oros";
		break;
		case 2: cadena2="Copas";
		break;
		case 3: cadena2="Espadas";
		break;
		case 4: cadena2="Bastos";
		break;
		
		
		}System.out.println("Tu carta es " + cadena + " del "+ cadena2);	
	}

}