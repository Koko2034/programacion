import java.util.Scanner;

public class ProblemasPropuestos11 {

	static int[]plazas=new int[300];
	static boolean control = true;
	 
	static void seleccionasiento(){
		Scanner teclado=new Scanner(System.in);
		char fumador;
		do{
			
			System.out.println("Seleccione asiento si desea fumador o no fumador(f/n)");
	fumador=teclado.next().charAt(0);
	switch(fumador){
	case 'f': asientofumador();
	control=false;
	break;
	case 'n': asientonofumador();
	control=false;
	break;
	default: System.out.println("La opcion no es valida");
	}
		}while(control);
		System.out.println();
	}
		static void asientofumador(){
			Scanner teclado=new Scanner(System.in);
			int asiento;
			
			System.out.println("Seleccione entre los asientos");
		asiento=teclado.nextInt();
		for(int i=0;i<100;i++){
			if(plazas[i]==0){
				System.out.println("La plaza esta disponible y ha sido seleccionada");
				plazas[i]=1;}
			else System.out.println("La plaza no esta disponible");
		} 
		System.out.println();
		}
	
	static void comprobarasientoslibresfumadores(){
		int asiento=0;
		int i=0;
		while (i<100 && asiento==0){
			if(plazas[i]==0)
				asiento=1;
			i++;
		}if(asiento==1)System.out.println("El avion tiene algun asiento de fumadores libres");
		
		System.out.println();
	}
	static void asientonofumador(){
		for(int i=100;i<300;i++){
			if(plazas[i]==0){
				System.out.println("La plaza esta disponible y ha sido seleccionada");
				plazas[i]=1;}
			else System.out.println("La plaza no esta disponible");
		}
		System.out.println();
	}
static void comprobarasientoslibresnofumadores(){
	int asiento=0;
	for(int i=100;i<300;i++){
		if(plazas[i]==0)
			asiento=1;
	}if(asiento==1)System.out.println("El avion tiene algun asiento de no fumadores libres");
	System.out.println();
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 11.- Se desea realizar un algoritmo que permita controlar las reservas de plazas de un
vuelo MADRID-CARACAS, de acuerdo con las siguientes normas de la compañía aérea:
Número de plazas del avión: 300. Plazas numeradas de 1 a 100: fumadores. Plazas
numeradas de 101 a 300: no fumadores. Se debe realizar la reserva a petición del
pasajero y cerrar la reserva cuando no haya plazas libres o el avión esté próximo a
despegar. Como ampliación de este algoritmo, considere la opción de anulaciones
imprevistas de reservas
 */
		
		Scanner teclado=new Scanner(System.in);
		int eleccion;
		boolean controlar=true;
		do{
		System.out.println("Bienvenido a Ryanair");
		System.out.println("1.Compruebe si tenemos plazas libres de fumadores");
		System.out.println("2.Compruebe si tenemos plazas libres de no fumadores");
		System.out.println("3.Realiza la reserva de tu vuelo");
		System.out.println("4.Finalizar");
		eleccion=teclado.nextInt();
		switch(eleccion){
		case 1:
		comprobarasientoslibresfumadores();
		break;
		case 2:comprobarasientoslibresnofumadores();
		break;
		case 3:seleccionasiento();
		break;
		case 4:control=false;
		break;
		default: System.out.println("La eleccion no es valida");
		}}while(control);
		
		
		
		
	}

}
