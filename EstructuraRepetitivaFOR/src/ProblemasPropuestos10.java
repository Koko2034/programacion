/*
 * Decir todos los números perfectos entre 2 y 1000. Un número es perfecto
cuando la suma de sus divisores (menos el mismo) es igual a sí mismo. Por ej. 6
sus divisores son :1,2,3 1+2+3=6
 */
/*
 * 
 */


/*
 * 
 */
import java.util.Scanner;

public class ProblemasPropuestos10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * A=teclado.next().charAt(0);
 */
		
		/*
		 * 	
			for(double n=2;n<=1000;n++){
		f=(int) (Math.pow(2, (n-1))*Math.pow(2, (n)));		
				B=B+f;
			}System.out.println(B);
		 */	
		
		
		
		
		
Scanner teclado=new Scanner(System.in);
char A='s';
int Z=9;
int num=2;
int C=0;
int B=1;
int D=1;


System.out.println("Desea calcular los numeros perfectos (s/n)");
A=teclado.next().charAt(0);
while(A=='s'){
	
	
	for(int n=2;n<=1000;n++){
		B=1;
		for(int s=2;s<n;s++){
			C=n%s;
			if(C==0)B=B+s;
			
	}
		if(n==B)
			System.out.println("Los numeros perfectos es " + n );
	
	
		
		}
	System.out.println("Desea calcular los numeros perfectos (s/n)");
	A=teclado.next().charAt(0);

}
	
}

	}

