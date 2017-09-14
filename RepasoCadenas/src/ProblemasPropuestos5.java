import java.util.Scanner;

public class ProblemasPropuestos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		int DNI;
		System.out.println("Introduce tu numero de DNI");
		DNI=teclado.nextInt();
		int Letra;
		Letra=DNI%23;
		char LDNI='s';
		switch(Letra){
		case 0: LDNI='T';
		break;
		case 1:LDNI='R';
			break;
		case 2:LDNI='W';
			break;
		case 3:LDNI='A';
			break;
		case 4:LDNI='G';
			break;
		case 5:LDNI='M';
			break;
		case 6:LDNI='Y';
			break;
		case 7:LDNI='F';
			break;
		case 8:LDNI='P';
			break;
		case 9:LDNI='D';
			break;
		case 10:LDNI='X';
			break;
		case 11:LDNI='B';
			break;
		case 12:LDNI='N';
			break;
		case 13:LDNI='J';
			break;
		case 14:LDNI='Z';
			break;
		case 15:LDNI='S';
			break;
		case 16:LDNI='Q';
			break;
		case 17:LDNI='V';
			break;
		case 18:LDNI='H';
			break;
		case 19:LDNI='L';
			break;
		case 20:LDNI='C';
			break;
		case 21:LDNI='K';
			break;
		case 22:LDNI='E';
			break;
		default: System.out.println("Error");	
		}
		
		System.out.println("El DNI es " + DNI + "-" + LDNI);
		
	}

}
