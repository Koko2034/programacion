import java.util.Scanner;

public class CalculadoraDefinitivaSinDecimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int A=0;
		int B;
		while(A!=4){System.out.println("Calculadora");
		System.out.println("1.Cambiar de decimal a binario");
		System.out.println("2.Cambiar de decimal a Octal");
		System.out.println("3.Cambiar de decimal a Hexadecimal");
		System.out.println("4.Salir");
		A=teclado.nextInt();
		if(A==1){
			System.out.println("Introduce el numero de bits");
			A=teclado.nextInt();
			System.out.println("introduce el numero");
			B=teclado.nextInt();
			String D="";
			String E="";
				if(B>0){
					for(double i=Math.pow(2, A-1);i>=1;i/=2){
						if(B-i>=0){
								D="1";
								E=E+D;
								B=(int) (B-i);
						}else if(B-i<0){
								D="0";
								E=E+D;
				}
			}System.out.println(E);
			}if(B<0){
				B=Math.abs(B);
				for(double i=Math.pow(2, A-1);i>=1;i/=2){
						if(B-i>=0){
							D="1";
							E=E+D;
							B=(int) (B-i);
						}else if(B-i<0){
							D="0";
							E=E+D;
					}
			}System.out.println("-"+E);}}
			else if(A==2){
			System.out.println("Introduce el numero de bits");
			A=teclado.nextInt();
			System.out.println("introduce el numero");
			B=teclado.nextInt();
			
			String D="";
			String E="";
			int signo=0;
				if(B>0){
					for(double i=Math.pow(2, A-1);i>=1;i/=2){
						if(B-i>=0){
							D="1";
							E=E+D;
							B=(int) (B-i);
						}else if(B-i<0){
							D="0";
							E=E+D;
				}
				signo=+3;
			}
			
				}if(B<0){
					B=Math.abs(B);
					for(double i=Math.pow(2, A-1);i>=1;i/=2){
						if(B-i>=0){
							D="1";
							E=E+D;
							B=(int) (B-i);
						}else if(B-i<0){
							D="0";
							E=E+D;
					}
			}signo=-3;
					}
			
		int L;
		int DE=0;
		String J="";
		String C="";
			L=E.length();
			
			String H;
			for(int i=0;i<=L;i++){
				L=E.length();
					if(L==1){
						char P;
						P=E.charAt(0);
							if(P=='1'){
								DE=1;}
							if(P!='1'){
								DE=0;}
			
							L=0;
							H=DE+"";
							J=H+J;}
					if(L==2){
						L=0;
						DE=(Integer.parseInt(E.substring(0,1))*2)+(Integer.parseInt(E.substring(1,2))*1);
						H=DE+"";
						J=H+J;}
					if(L==3){
						L=0;
						DE=(Integer.parseInt(E.substring(0,1))*4)+(Integer.parseInt(E.substring(1,2))*2)+(Integer.parseInt(E.substring(2,3))*1);
						H=DE+"";
						J=H+J;}
					if(L>3){
						C=E.substring(L-3, L);
						DE=(Integer.parseInt(C.substring(0,1))*4)+(Integer.parseInt(C.substring(1,2))*2)+(Integer.parseInt(C.substring(2,3))*1);
						E=E.substring(0,L-3);
						L=E.length();	
						H=DE+"";
						J=H+J;}
				}
			if(signo<0)System.out.println("-"+J);
			if(signo>0)System.out.println(J);
		}else if(A==3){
			System.out.println("Introduce el numero de bits");
			A=teclado.nextInt();
			System.out.println("introduce el numero");
			B=teclado.nextInt();
			String D="";
			String E="";
			int signo=0;
				if(B>0){
					for(double i=Math.pow(2, A-1);i>=1;i/=2){
						if(B-i>=0){
							D="1";
							E=E+D;
							B=(int) (B-i);
						}else if(B-i<0){
							D="0";
							E=E+D;
				}	signo=+3;
			}
				}if(B<0){
					B=Math.abs(B);
					for(double i=Math.pow(2, A-1);i>=1;i/=2){
						if(B-i>=0){
							D="1";
							E=E+D;
							B=(int) (B-i);
						}else if(B-i<0){
							D="0";
							E=E+D;
					}signo=-3;
			}}
			int L;
			int DE=0;
			String J="";
			String C="";
			L=E.length();
			String H="";
			for(int i=0;i<=L;i++){
				L=E.length();
					if(L==1){
						char P;
						P=E.charAt(0);
						if(P=='1'){
							DE=1;}
						if(P!='1'){
							DE=0;}
					L=0;
					H=DE+"";
					J=H+J;}
					if(L==2){
						DE=(Integer.parseInt(E.substring(0,1))*2)+(Integer.parseInt(E.substring(1,2))*1);
						H=DE+"";
						J=H+J;
						L=0;}
					if(L==3){
						DE=(Integer.parseInt(E.substring(0,1))*4)+(Integer.parseInt(E.substring(1,2))*2)+(Integer.parseInt(E.substring(2,3))*1);
						H=DE+"";
						L=0;
						J=H+J;}
					if(L==4){
						DE=(Integer.parseInt(E.substring(0,1))*8)+(Integer.parseInt(E.substring(1,2))*4)+(Integer.parseInt(E.substring(2,3))*2)+(Integer.parseInt(E.substring(3,4))*1);
						String JOR=(Integer.toString(DE));
						L=0;
						switch(DE){
							case 10: JOR="A";
							break;
							case 11: JOR="B";
							break;
							case 12: JOR="C";
							break;
							case 13: JOR="D";
							break;
							case 14: JOR="E";
							break;
							case 15: JOR="F";
							break;
						} if(DE<10){
							H=DE+"";
				}
							if(DE>10){
								H=JOR;}
							J=H+J;}
					if(L>4){
						C=E.substring(L-4, L);
						DE=(Integer.parseInt(C.substring(0,1))*8)+(Integer.parseInt(C.substring(1,2))*4)+(Integer.parseInt(C.substring(2,3))*2)+(Integer.parseInt(C.substring(3,4))*1);
						E=E.substring(0,L-4);
						String JOR="";
						JOR=(Integer.toString(DE));
						switch(DE){
							case 10: JOR="A";
							break;
							case 11: JOR="B";
							break;
							case 12: JOR="C";
							break;
							case 13: JOR="D";
							break;
							case 14: JOR="E";
							break;
							case 15: JOR="F";
							break;
				} 
						L=E.length();	
							if(DE<10){
								H=DE+"";
				}
							if(DE>10){
								H=JOR;
				}
							J=H+J;}
				}if(signo>0)System.out.println(J);
				else if(signo<0)System.out.println("-"+J);	
				}else if(A==4){
					System.out.println("Fin del programa");
				}else if(A!=1 || A!=2 || A!=3 || A!=4){
					System.out.println("Error");
		}
		
		
		}
	}

}