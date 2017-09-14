import java.util.Scanner;

public class ProblemasPropuestos8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		char opcion='x';
		System.out.println("Desea iniciar el programa(s/n)");
		opcion=teclado.next().charAt(0);
		int numero=0;
		int contador=0;
		do{
			numero=(int)(Math.random()*(50+1))*2;
			
			System.out.println(numero);
			contador++;
		}while(numero!=24);
		System.out.println("Has acabado en solo " + contador + " intentos");
	}

}
