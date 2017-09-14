import java.util.Scanner;


public class ProblemasPropuestos18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		char A='s';
		int C;
		int B=0;
		System.out.println("Desea empezar a jugar?(s/n)");
		A=teclado.next().charAt(0);
		while(A!='s'){
			System.out.println("Desea empezar a jugar?(s/n)");
			A=teclado.next().charAt(0);
		}
		System.out.println("Vamos a generar un numero entre 1 y 100.");
		System.out.println("Si la diferencia con el numero es mayor de 50 diremos: Muy frio");
		System.out.println("Si la diferencia con el numero esta entre 10 y 50 diremos: frio");
		System.out.println("Si la diferencia con el numero esta entre 5 y 10 diremos: caliente");
		do{
		B=(int)(Math.random()*100+1);
		teclado.nextLine();
		
		
		System.out.println("Introduce un numero");
		C=teclado.nextInt();
		if(C>B+50){
			System.out.println("Muy frio");
	
		}if(C<B+50 && C>B+10){
			System.out.println("Frio");
		}if(C<B+10 && C>B+5){
			System.out.println("Caliente");
		}
		}while(C!=B);
		
		System.out.println("Has acertado el numero generado es " + C);
		System.out.println("Has acertado el numero generado es " + B);
		
	}

}
