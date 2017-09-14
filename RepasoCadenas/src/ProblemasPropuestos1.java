import java.util.Scanner;

public class ProblemasPropuestos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
		String A;
		int B=0;
		String busqueda=" ";
		System.out.println("Introduzca una frase");
		boolean bucle=true;
		A=teclado.nextLine();
		int Contador=0;
		int longitud=0;
		
		while(bucle){
			B=A.indexOf(busqueda);
			longitud=A.length();
			
			if(B!=-1){
			A=A.substring(B+1, longitud);
			Contador++;}
			else{
				bucle=false;
				Contador++;
			}
			
		}
		
		System.out.println("Ha introducido " + Contador + " palabras dentro de su frase");
	}

}
