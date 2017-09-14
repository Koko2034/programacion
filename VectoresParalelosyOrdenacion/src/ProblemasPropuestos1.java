import java.util.Scanner;

public class ProblemasPropuestos1 {
	static int[]edad=new int[15];
	static String[]nombre=new String[15];
	
	static void cargar(){
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<15;i++){
		System.out.println("Introduzca un nombre");
		nombre[i]=teclado.nextLine();
		edad[i]=(int)(Math.random()*25+0);
		}
	}
	
	static void controledad(){
		Scanner teclado=new Scanner(System.in);
		teclado.nextLine();
		System.out.println("Introduzca una edad");
		int edadteclado=teclado.nextInt();
		int contador=0;
		for(int i=0;i<15;i++){
			if(edad[i]==edadteclado){
				System.out.println(nombre[i]);
				contador++;
			}
			
		}
		if(contador==0)System.out.println("No existe ningun nombre asociado a la edad " + edadteclado);
	}
	static void controlnombre(){
		Scanner teclado=new Scanner(System.in);
		teclado.nextLine();
		System.out.println("Introduzca un nombre");
		String nombreteclado=teclado.nextLine();
		for(int i=0;i<15;i++){
			if(nombre[i].compareTo(nombreteclado)==0)
				System.out.println("La edad de " + nombre[i] + " es " + edad[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 1.-Haz un programa que introduzca los datos correspondientes al nombre y a la edad
de 15 personas en dos vectores y a continuación mediante un menú con dos opciones
permita consultar la edad , se introducirá una edad y saldrá un listado con todas las
personas de esa edad o una información en caso de que no exista nadie , y otra
opción para introducir el nombre y que me diga la edad

		 */
		Scanner teclado=new Scanner(System.in);
		int opcion;
		boolean control=true;
	cargar();
	while(control){
		System.out.println("1.Consultar por edad");
		System.out.println("2.Consultar por nombre");
		System.out.println("3.Salir");
		opcion=teclado.nextInt();
		switch(opcion){
		case 1: controledad();
		break;
		case 2: controlnombre();
		break;
		case 3: System.out.println("El programa ha finalizado");
		control=false;
		break;
		default: System.out.println("La opcion escogida es incorrecta");
		}
	}
		
	}

}
