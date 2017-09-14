import java.util.Scanner;

public class ProblemasPropuestos9 {

	
	static void Calculo(int num){
		String cadena=String.valueOf(num);
		int Par=0;
		int Impar=0;
		for(int i=0;i<cadena.length();i+=2){
			int puntero=Integer.parseInt("" + cadena.charAt(i)); 
			Par=Par+puntero;
		}
		for(int i=1;i<cadena.length();i+=2){
			int puntero=Integer.parseInt("" + cadena.charAt(i)); 
			Impar=Impar+puntero;
		}
		if(Par-Impar==0 || Par-Impar==11){
			System.out.println("El numero " + num + " es multiplo de 11 ");
		}else System.out.println("El numero " + num + " no es multiplo de 11");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 9.- Decir si un número es múltiplo de 11, para que lo sea la diferencia entre la suma
de las cifras de lugar par y las de lugar impar es 0 o múltiplo de 11
 */
		int numero=4;
		Scanner teclado=new Scanner(System.in);
		boolean control=true;
		while(numero>0 && control){
		System.out.println("Introduce un numero por teclado");
		numero=teclado.nextInt();
		if(numero>0) Calculo(numero);
		else System.out.println("El numero" + numero +" introducido no es correcto ");
		System.out.println("Desea finalizar el programa (s/n)");
		char finalizar=teclado.next().charAt(0);
		
		if(finalizar=='s') control=false;
		
				
		}
		System.out.println("Su programa a finalizado");
	}

}
// si quremos tener en f diferentes valores podemos meter un bucle o solamente podemos tener 1 valor exacto
// o hacemos un bucle y dentro itroducimos los metdos
// si no recogemos en un return la variable no obtenemos el valor del return, una vez salimos del metodo se machaca