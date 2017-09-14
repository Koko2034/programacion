import java.util.Scanner;

public class binariodecimalprobando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Anumero;
		int B;
		int E;
		double Hentera=0;
		double Hdecimal=0;
		int J=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		Anumero=teclado.nextLine();
		int Cdistanciacadenaprincipal=Anumero.length();
		int Fseparacionenterodecimal=Anumero.indexOf(',');
		
		System.out.println(Fseparacionenterodecimal);
		String S1=Anumero.substring(0, Fseparacionenterodecimal);
		String S2=Anumero.substring(Fseparacionenterodecimal+1, Cdistanciacadenaprincipal-1);
		int LS1=S1.length();
		int LS2=S2.length();
		if(Fseparacionenterodecimal==-1){
			if(Cdistanciacadenaprincipal>8){
				System.out.println("Error");
			}else if(Cdistanciacadenaprincipal<=8){
			J=Cdistanciacadenaprincipal;
			for(int i=0;i<Cdistanciacadenaprincipal;i++){
			E=Integer.parseInt(Anumero.substring(J-2,J-1));
			
			Hentera=Hentera+(E*Math.pow(2, i));
			J--;}}
		}else if(Fseparacionenterodecimal!=-1){
			if(Cdistanciacadenaprincipal>8){
				System.out.println("Error");}
			else if(Cdistanciacadenaprincipal<=8){
			
				
				J=LS1;
			for(int i=0;i<LS1;i++){
			E=Integer.parseInt(S1.substring(i,i+1));
			
			Hdecimal=(E*Math.pow(2, -(i+1)))+ Hdecimal;
			J--;
			
			
		}
			}}
		
		
		
		System.out.print((int)Hentera + ","+ (int)Hdecimal);
		
		}
		
	}