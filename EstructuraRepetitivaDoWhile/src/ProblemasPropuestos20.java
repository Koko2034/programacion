import java.util.Scanner;


public class ProblemasPropuestos20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		char A;
		int B=0;
		int D=0;
		int E=0;
		int F=0;
		int G=0;
		String J="";
		System.out.println("Desea iniciar el programa?(s/n)");
		A=teclado.next().charAt(0);
		while(A!='s'){
			System.out.println("Desea iniciar el programa?(s/n)");
			A=teclado.next().charAt(0);
		}
	
			for(int i=1000;i<=9999;i++){
				J=Integer.toString(i);
				 
				D=(int)J.charAt(0);
				E=(int)J.charAt(2);
				F=(int)J.charAt(1);
				G=(int)J.charAt(3);
				
				
				if((D+E)==(F+G)){
					System.out.println("El numero es " + i);
				}
			}
		
	}

}