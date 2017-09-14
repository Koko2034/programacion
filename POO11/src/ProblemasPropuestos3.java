import java.util.Scanner;

public class ProblemasPropuestos3 {

	
		private int fechaentrada,fechaactual,trienios;
	
	public void inicializar(){
	Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el año de entrada");
		fechaentrada=teclado.nextInt();
		System.out.println("Introduce el año de salida");
		fechaactual=teclado.nextInt();
	}
	public void calculo(){
		trienios=(fechaactual-fechaentrada)/3;
	}
	public void resultado(){
		System.out.println("Los trienios trabajados son "+ trienios);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProblemasPropuestos3 calculotrienios1;
	
		
	calculotrienios1=new ProblemasPropuestos3();
	calculotrienios1.inicializar();
	calculotrienios1.calculo();
	calculotrienios1.resultado();
	
	}
}
