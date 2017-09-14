import java.util.Scanner;
public class ProblemasPropuestos2 {
	
	// Atributos
	public void imprimir(int numero){
		for(int i=0;i<numero;i++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ProblemasPropuestos2 numero; 
		numero=new ProblemasPropuestos2();// Crea el objeto
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese el numero de asteriscos de la cadena");
		int N =teclado.nextInt();
		
		numero.imprimir(N);
		
		

	}

}
