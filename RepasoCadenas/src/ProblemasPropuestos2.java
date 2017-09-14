import java.util.Scanner;

public class ProblemasPropuestos2 {

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
		String palabra;
		while(bucle){
			B=A.indexOf(busqueda);
			longitud=A.length();
			if(B!=-1){
			palabra=A.substring(0, B);
				A=A.substring(B+1, longitud);
			System.out.println(palabra);
			Contador++;}
			else{
				System.out.println(A);
				bucle=false;
				Contador++;
			}
			
		}
		
		System.out.println("Ha introducido " + Contador + " palabras dentro de su frase");
		
		
	}

}
