import java.util.Scanner;

public class ProblemasPropuestos11 {
static String fecha;
static 	int[]dias={31,28,31,30,31,30,31,31,30,31,30,31};
	
	  
	static void calculo(){
		int posicion=fecha.lastIndexOf('-');
		String año=fecha.substring(posicion+1, fecha.length());
		int ano=Integer.parseInt(año);
		if(ano%4==0){dias[1]=29;}
		int posicion2=fecha.indexOf('-');
		String mes=fecha.substring(posicion2+1, posicion);
		int mes2=Integer.parseInt(mes);
		String corte=fecha.substring(0, posicion2);
		int corte2=Integer.parseInt(corte);
		int drestantes=dias[mes2-1]-corte2;
		
		for(int i=mes2;i<12;i++){
		drestantes=drestantes+dias[i];	
		}
		System.out.println("Los dias que quedan para fin de año son " + drestantes);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 11.-Haz un programa que visualice el número de días que faltan para el
final de año a partir de una fecha introducida por teclado, se deberá
utilizar un vector de 12 posiciones que contenga el número de días del
mes, el programa debe funcionar para años bisiestos también, la fecha se
introducirá “DD-MM-AA”
 */
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una fecha en formato DD-MM-AA");
		fecha=teclado.nextLine();
		
		
		calculo();
		
		
		
		
		
	}

}
