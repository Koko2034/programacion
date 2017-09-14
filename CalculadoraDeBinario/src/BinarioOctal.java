import java.util.Scanner;

public class BinarioOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A;
		int B;
		String C="";
		int D=0;
		int E=0;
		String J="";
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un numero");
		A=teclado.nextLine();
		B=A.length();
		String H;
		for(int i=0;i<=B;i++){
			B=A.length();
			if(B==1){
		char P;
		P=A.charAt(0);
		if(P=='1'){
			D=1;}
		if(P!='1'){
			D=0;}
		
		B=0;
		H=D+"";
		J=H+J;}
		if(B==2){
			B=0;
			D=(Integer.parseInt(A.substring(0,1))*2)+(Integer.parseInt(A.substring(1,2))*1);
			H=D+"";
			J=H+J;}
		if(B==3){
			B=0;
			D=(Integer.parseInt(A.substring(0,1))*4)+(Integer.parseInt(A.substring(1,2))*2)+(Integer.parseInt(A.substring(2,3))*1);
			H=D+"";
			J=H+J;}
		if(B>3){
			C=A.substring(B-3, B);
			D=(Integer.parseInt(C.substring(0,1))*4)+(Integer.parseInt(C.substring(1,2))*2)+(Integer.parseInt(C.substring(2,3))*1);
			A=A.substring(0,B-3);
			B=A.length();	
			H=D+"";
			J=H+J;}
			}System.out.println(J);
		
		
		
	}
		
	


	

	}

