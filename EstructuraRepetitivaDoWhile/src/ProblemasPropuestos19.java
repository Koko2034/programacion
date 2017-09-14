import java.util.Scanner;

public class ProblemasPropuestos19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A="";
		Scanner teclado=new Scanner(System.in);
		String E; //dia
		String G; // mes
		String H; //
		String F;//año
		int J;
		int B;
		int C;
		
		System.out.println("Introduce una fecha en formato dd/mm/aaaa");
		A=teclado.nextLine();
		J=A.length();
		B=A.indexOf('/');
		E=A.substring(0, B);
		H=A.substring(B+1, J);
		C=H.indexOf('/');
		G=H.substring(0, C);
		F=A.substring(C+2+B, J);
		switch(G)
		{ case "1": G="enero";
		break;
		case "2": G="febrero";
		break;
		case "3": G="marzo";
		break;
		case "4": G="abril";
		break;
		case "5": G="mayo";
		break;
		case "6": G="junio";
		break;
		case "7": G="julio";
		break;
		case "8": G="agosto";
		break;
		case "9": G="septiembre";
		break;
		case "10": G="octubre";
		break;
		case "11": G="noviembre";
		break;
		case "12": G="diciembre";
		break;
		}
		
		
		System.out.println("La fecha es " + E + " de " + G + " de " + F);
		int D=Integer.parseInt(F);
		if(D%4==0 || D%100!=0){
			System.out.println("El año es bisiesto");
		}else if(D%100==0 && D%400==0){
			System.out.println("El año es bisiesto");
		}
		}}
		
	
