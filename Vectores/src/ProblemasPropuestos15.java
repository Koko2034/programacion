import java.util.Scanner;
public class ProblemasPropuestos15 {

	static int[]cromos=new int[100]; // coleccion de cromos
	// 1 sobre tiene 3 cromos;
	static int j=0;
	static int contador=0;
	static boolean control=true;
	static int cromo=0;
	static int cromo2=0;
	static Scanner teclado=new Scanner(System.in);
	static void comienzo(){
		for(int i=0;i<cromos.length;i++){
			cromos[i]=0;
		}
	}
	static void inicializar(){
		for(int i=0;i<15;i++){
			j=(int)(Math.random()*cromos.length+0);
			cromos[j]+=1;//METERLO COMO CONTADOR
			
		}
		}
	static void compra(){
		
		System.out.println("Introduzca el numero de sobres que te vas a comprar");
		cromo=3*(teclado.nextInt());
		for(int i=0;i<cromo;i++){
			j=(int)(Math.random()*cromos.length+0);
			cromos[j]+=1;
		
		}
		completar();
	
	}
	static void completar(){
		/*
		for(int j=0;j<cromos.length;j++){
			if(cromos[j]==0)control=false;
		}
		if(control)System.out.println("Enhorabuena has completado tu coleccion de cromos");
	}	
	*/
		int j=0;
		
		while(j<cromos.length && control){
		if(cromos[j]==0)control=false;	j++;
		}
		if(control)System.out.println("Enhorabuena has completado tu coleccion de cromos");
		}
	
	static void consulta(){
		System.out.println("introduce el cromo que deseas informacion");
		cromo=teclado.nextInt();
		if(cromos[cromo]!=0){
			System.out.println("Tenemos este cromo");
			System.out.println("Tenemos" + cromos[cromo] + " el cromo de la posicion "+ cromo);
		}
	}
	static void cambiar(){
		System.out.println("Introduzca el cromo que quiere cambiar");
		cromo=teclado.nextInt();
		System.out.println("Introduzca el 2º cromo por el que lo cambias");
		cromo2=teclado.nextInt();
		if(cromos[cromo]<1)System.out.println("No tienes cromos suficientes");
		else cromos[cromo]=cromos[cromo]-1;
		cromos[cromo2]+=1;
	}
	static void cromorepetido(){
		for(int i=0;i<cromos.length;i++){
			if(cromos[i]>1){
				System.out.println("Del cromo "+ i + "tenemos" + cromos[i] + "cromos");
			}
		}
	}
	static void cromospendientes(){
		for(int i=0;i<cromos.length;i++){
			if(cromos[i]<1){
				System.out.println("Los cromos pendientes son "+ i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion=0;
		comienzo();
		inicializar();
		do{
		System.out.println("Escoja una opcion del siguiente menu");
		System.out.println("1.Compra un nuevo cromo");
		System.out.println("2.Consulta sobre 1 cromo");
		System.out.println("3.Lista de cromo repetidos");
		System.out.println("4.Lista de cromos pendientes");
		System.out.println("5.Posibilidad de cambiar los cromos");
		System.out.println("6.Salir");
		opcion=teclado.nextInt();
		switch(opcion){
		case 1: compra();
		break;
		case 2: consulta();
		break;
		case 3: cromorepetido();
		break;
		case 4: cromospendientes();
		break;
		case 5: cambiar();
		break;
		case 6: opcion=6;
		break;
		default: System.out.println("Escoja una opcion de las anteriores");
		}}while(opcion!=6);
		
	}

}
