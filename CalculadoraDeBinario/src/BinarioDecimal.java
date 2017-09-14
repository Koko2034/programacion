import java.util.Scanner;

public class BinarioDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A;
		int B;
		int E;
		double H=0;
		int J=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		A=teclado.nextLine();
		B=A.length();
		if(B>8){
			System.out.println("Error");
		}else if(B<=8){
		J=B;
		for(int i=0;i<B;i++){
		E=Integer.parseInt(A.substring(J-1,J));
		
		H=H+(E*Math.pow(2, i));
		J--;
		
		
		
		}System.out.println(H);
		}
	}}
		
		
		
	


