import java.util.Scanner;

public class ProblemasPropuestos6  {
	//Atributos
	private String nombre;
	private int edad;
	public void inicializar(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el nombre");
		nombre=teclado.nextLine();
		System.out.println("Introduce la edad");
		edad=teclado.nextInt();
	}
	public void mayoredad(){
		if(edad>18)System.out.println(nombre + " es mayor de edad");
		else System.out.println(nombre + " no es mayor de edad");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 6.-Crea la clase Empleado con los atributos: Nombre y Edad y el método mayorEdad.
Crea tres objetos de la clase Empleado e indica si cada uno de ellos es o no
mayor de edad
		 */
		
		ProblemasPropuestos6 empleado1=new ProblemasPropuestos6();
		empleado1.inicializar();
		empleado1.mayoredad();
		ProblemasPropuestos6 empleado2=new ProblemasPropuestos6();
		empleado2.inicializar();
		empleado2.mayoredad();
		ProblemasPropuestos6 empleado3=new ProblemasPropuestos6();
		empleado3.inicializar();
		empleado3.mayoredad();
		
	}

}
