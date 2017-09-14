import java.util.Scanner;

public class DecimalBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String numD;// numero a calcular en decimal
		int numB;// numero de bits
		String partdecimal="";
		String D="";
		int i=0;
		String E="";
		boolean control=true;
		System.out.println("Introduce un numero");
		numD=teclado.nextLine();
		System.out.println("Numero de bits");
		numB=teclado.nextInt();
		numB=(int)(Math.pow(2, numB));
		String partentera="";
		int coma=0;
		coma=numD.indexOf(".");
		partentera=numD.substring(0, coma);
		int longnumD=numD.length();
		partdecimal=numD.substring(coma+1,longnumD);
		partdecimal="0."+partdecimal;
		System.out.println(partentera);
		System.out.println(partdecimal);
		double Npartentera=0;
		Npartentera=Integer.parseInt(partentera);
		for(i=numB;i>=1;i/=2){
			if(Npartentera-i>=0){
				D="1";
				E=E+D;
				Npartentera=Npartentera-i;
				control=false;
			}else if(Npartentera-i<0 && control==false){
				D="0";
				E=E+D;
			}
	
		}	 
		int longentero=0;//mide la cantidad de la parte entera
		longentero=E.length();
		double Npartdecimal=0;
		Npartdecimal=Integer.parseInt(partdecimal);
		Npartdecimal=Npartdecimal+3;
		System.out.println(Npartdecimal);
		for(double j=0.5;j<=1;j/=2){
			if(Npartdecimal-j>=0){
				D="1";
				E=E+D;
				Npartdecimal=Npartdecimal-j;
				
			}else if(Npartdecimal-i<0){
				D="0";
				E=E+D;
			}
		
		
		System.out.println(E);
	}

}
}