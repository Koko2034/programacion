import java.util.Scanner;

public class ProblemasPropuestos11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String A;
		System.out.println("Introduce una palabra");
		A=teclado.nextLine();
		System.out.println("La entrada de datos es: " + A);
		int longitud=A.length();
		String Salida="";
		for(int i=0;i<longitud;i++){
			char Z=A.charAt(i);
			
			Z=(char) (Z+3);
			if(Z>122){
				Z=(char) (Z-28);
			}
		
		Salida=Salida+Z;
		}
		
		System.out.println("La salida de datos es: " + Salida);
	
	}
		}



