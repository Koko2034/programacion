import java.util.Scanner;

public class Probando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		int A=0;
		String B;
		String C;
		String D="";
		String E="";
		System.out.println("Introduce el numero de bits");
		A=teclado.nextInt();
		System.out.println("introduce el numero");
		teclado.nextLine();
		B=teclado.nextLine();
		int longitud1=0;
		longitud1=B.length();
		int Posicion;
		Posicion=B.lastIndexOf(',');
		C=B.substring(Posicion+1, longitud1);
		int longitud2;
		longitud2=C.length();
		String entero;
		entero=B.substring(0, Posicion-1);
		int B1;
		B1=(Integer.parseInt(entero));
		if(B1>0){
			for(double i=Math.pow(2, A-1);i>=1;i/=2){
				if(B1-i>=0){
						D="1";
						E=E+D;
						B1=(int) (B1-i);
				}else if(B1-i<0){
						D="0";
						E=E+D;}}
				
		double H;
		String E1="";
		String D1="";
		H=(Integer.parseInt(C));
		H=H*(Math.pow(10, -longitud2));
		int k=1;
			for(int j=0;j<=(longitud1-longitud2-1);j++){
				
				double w=Math.pow(2,-1*k);
				
				if(H-w>=0){
						D1="1";
						E1=E1+D1;
						
				}else if(H-w<0){
						D1="0";
						E1=E1+D1;
						
		}k++;
		
			}System.out.println(E+"'"+E1);
			
	
	}	}}
		
	
	
		
	


	