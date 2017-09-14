import java.util.Scanner;

public class ProblemasPropuestos10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char A='a';
		Scanner teclado=new Scanner(System.in);
		System.out.println("Desea que comience el programa?(s/n)");
		A=teclado.next().charAt(0);
		int X=0;//para calcular los porcentajes
		char R='s';
		while(A!='s'){
			System.out.println("Desea que comience el programa?(s/n)");
			A=teclado.next().charAt(0);
		}
		for(int i=1;i<=15;i++){
			X=(int)(Math.random()*100+1);
			if(X<50){
				R='1';
			}else if(X>50 && X<80){
				R='X';
			}else if(X>80 && X<100){
				R='2';
			}
			
			System.out.println("El partido " + i + " tiene como resultado es " + R);
		}
		


	}

}
