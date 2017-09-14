import java.util.Scanner;

public class ProblemasPropuestos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		System.out.println("Desea iniciar el programa(s/n)");
		char inicio='p';
		inicio=teclado.next().charAt(0);
		String impresion="*-=.|@";
		int longitud=impresion.length();
		for(int i=0;i<10;i++){
			int impresion2;
			impresion2=(int)(Math.random()*(longitud+1));
			char impresion3=impresion.charAt(impresion2);
			double lineas;
			lineas=Math.random()*(40+1);
			for(int j=0;j<=lineas;j++){
				System.out.print(impresion3);
			}System.out.println();
			
		}
		
				
		
	}

}
