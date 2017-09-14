import java.util.Scanner;

public class BinarioHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A;
		int B;
		String C="";
		int D=0;
		int E=0;
		String Z="";
		String J="";
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un numero");
		A=teclado.nextLine();
		B=A.length();
		String H="";
		for(int i=0;i<B;i++){
			B=A.length();
		if(B==1){
			B=0;
		D=(Integer.parseInt(C.substring(0,1))*1);
		H=D+"";
		J=H+J;
		}
		if(B==2){
			B=0;
			D=(Integer.parseInt(A.substring(0,1))*2)+(Integer.parseInt(A.substring(1,2))*1);
			H=D+"";
			J=H+J;
		}
		if(B==3){
			B=0;
			D=(Integer.parseInt(A.substring(0,1))*4)+(Integer.parseInt(A.substring(1,2))*2)+(Integer.parseInt(A.substring(2,3))*1);
			H=D+"";
			J=H+J;
		}
		if(B==4){
			B=0;
			D=(Integer.parseInt(A.substring(0,1))*8)+(Integer.parseInt(A.substring(1,2))*4)+(Integer.parseInt(A.substring(2,3))*2)+(Integer.parseInt(A.substring(3,4))*1);
			Z=Integer.toString(D);
			if(D>10){
			if(D==10){
				Z="A";
			}if(D==11){
				Z="B";
			}if(D==12){
				Z="C";
			}if(D==13){
				Z="D";
			}if(D==14){
				Z="E";
			}if(D==15){
				Z="F";
			}
			H=Z+"";}
			if(D<10){
			H=D+"";}
			J=H+J;
		}
		
		if(B>4){
			C=A.substring(B-4, B);
			D=(Integer.parseInt(A.substring(0,1))*8)+(Integer.parseInt(A.substring(1,2))*4)+(Integer.parseInt(A.substring(2,3))*2)+(Integer.parseInt(A.substring(3,4))*1);
			A=A.substring(0,B-4);
			Z=Integer.toString(D);
			if(D>10){
			if(D==10){
				Z="A";
			}if(D==11){
				Z="B";
			}if(D==12){
				Z="C";
			}if(D==13){
				Z="D";
			}if(D==14){
				Z="E";
			}if(D==15){
				Z="F";
			}
			H=Z+"";}
			if(D<10){
			H=D+"";}
			
			J=H+J;
		}
	
		}
		
		System.out.println(J);
		
		
		
	}
		
	

}
	
