import java.util.Scanner;

public class ProblemasPropuestos13 {

	static int[]numeros=new int[100];
static int num1=0;
static int num2=0;

	static void generar(){
		for(int i=0;i<100;i++){
		numeros[i]=(int)(Math.random()*20+0);
		System.out.print(numeros[i]+" ");
		}
		System.out.println();
		}
	static void cambiar(){
		for(int i=0;i<100;i++){
			if(numeros[i]==num1){
				numeros[i]=num2;
			}
		}for(int i=0;i<100;i++){
			if(numeros[i]==num2){
			System.out.print("\""+num2+"\"");
		}else System.out.print(numeros[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 13.-Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por teclado
dos valores y a continuación cambiará todas las ocurrencias del primer valor por el
segundo en la lista generada anteriormente. Los números que se han cambiado deben
aparecer entrecomillados.
 */
		Scanner teclado=new Scanner(System.in);
		generar();
		System.out.println("introduzca el primer valor");
		num1=teclado.nextInt();
		System.out.println("introduzca el segundo valor");
		num2=teclado.nextInt();
		cambiar();
		
	}

}
