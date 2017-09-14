import java.util.Scanner;
public class ProblemasPropuestos1{
	public int num1,num2;
	public void inicializar(){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		num1=teclado.nextInt();
		System.out.println("ingrese el segundo numero");
		num2=teclado.nextInt();
	}
	public void suma(){
		System.out.println("La suma de " + num1 + "y" + num2 + "es "+ (num1+num2));}
	public void resta(){
		System.out.println("La resta de " + num1 + "y" + num2 + "es "+ (num1-num2));
	}
	public void multiplicacion(){
		System.out.println("La multiplicacion de " + num1 + "y" + num2 + "es "+ (num1*num2));
	}
	public void division(){
		System.out.println("La division de " + num1 + "y" + num2 + "es "+ (num1/num2));
	}
 

	public static void main(String[] args) {
		ProblemasPropuestos1 num;
		num=new ProblemasPropuestos1();
		num.inicializar();
		num.suma();
		num.resta();
		num.multiplicacion();
		num.division();
		
/*
 * 
 */
		
	}

}

