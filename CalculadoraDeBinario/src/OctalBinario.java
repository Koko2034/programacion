import java.util.Scanner;

public class OctalBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String B="";
int C=0;
int E=0;
String D="";
Scanner teclado=new Scanner(System.in);
System.out.println("Introduzca un numero");
B=teclado.nextLine();
E=B.length();


	if(B==7){
		C=111;
		D=D+""+C;
	}else if(B==6){
		C=110;
		D=D+""+C;
	}else if(B==5){
		C=101;
		D=D+""+C;
	}else if(B==4){
		C=100;
		D=D+""+C;
	}else if(B==3){
		C=011;
		D=D+""+C;
	}else if(B==2){
		C=010;
		D=D+""+C;
	}else if(B==1){
		C=001;
		D=D+""+C;
	}else if(B==0){
		C=000;
		D=D+""+C;
	}
	System.out.println(D);
		
		
		
	}

}
