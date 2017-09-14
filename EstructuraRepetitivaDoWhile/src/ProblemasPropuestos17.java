import java.util.Scanner;

public class ProblemasPropuestos17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		
		char A='s';
		int C=0;
		int E=0;
		System.out.println("Desea usted comparar dos listas de valores");
		A=teclado.next().charAt(0);
		while(A!='s'){
			System.out.println("Desea usted comparar dos listas de valores");
			A=teclado.next().charAt(0);
			
		}
		
		for(int i=0;i<=15;i++){
			int B=(int)(Math.random()*15+1);
		C=C+B;
		}
		for(int j=0;j<=15;j++){
			int D=(int)(Math.random()*15+1);
		E=E+D;
		}
		if(C>E){
			System.out.println("La sumatoria de la lista 1 es mayor");
		}else if(E>C){
			System.out.println("La sumatoria de la lista 2 es mayor");
		}else if(E==C){
			System.out.println("La sumatoria de las listas son iguales");
		}
	}

}
