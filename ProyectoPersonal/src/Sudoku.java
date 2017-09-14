import java.util.Scanner;

public class Sudoku {

	static int [][]juego=new int[9][9];
	static void derechabajo(){
		System.out.println("1.En la posicion " + " " + (pos1+1) + "," + pos2 + "/"+ (pos1+2) + "," + pos2 +"/"+ (pos1+3) + "," + pos2 ) ;
		System.out.println("1.En la posicion " + " " + pos1 + "," + (pos2+1) + "/"+ pos1 + "," + (pos2+2) +"/"+ pos1 + "," + (pos2+3) );
		
		
	}
	static void derechabajoizquierda(){
		System.out.println("1.En la posicion " + " " + (pos1-1) + "," + pos2 + "/"+ (pos1-2) + "," + pos2 +"/"+ (pos1-3) + "," + pos2 ) ;
		System.out.println("1.En la posicion " + " " + pos1 + "," + (pos2+1) + "/"+ pos1 + "," + (pos2+2) +"/"+ pos1 + "," + (pos2+3) );
		
		
	}
	static void izquierdabajo(){
		System.out.println("1.En la posicion " + " " + (pos1-1) + "," + pos2 + "/"+ (pos1-2) + "," + pos2 +"/"+ (pos1-3) + "," + pos2 ) ;
		System.out.println("1.En la posicion " + " " + pos1 + "," + (pos2+1) + "/"+ pos1 + "," + (pos2+2) +"/"+ pos1 + "," + (pos2+3) );
		
	}
static int[]barcosseleccionados=new int[3];
	
static void seleccionbarco4(){
	Scanner teclado=new Scanner (System.in);
	int pos1,pos2;
	int opcion=0;
	System.out.println("Escoge la primera posicion de tu barco");
	System.out.println("Selecciona la columna entre 1 y 9");
	pos1=teclado.nextInt();
	System.out.println("Selecciona la fila entre 1 y 9");
	pos2=teclado.nextInt();
	juego[pos1][pos2]=1;
	if(pos1<6 && pos2<6){
	while(opcion!=1 || opcion!=2){
	System.out.println("Escoge entre la opcion siguiente para poner el resto del barco");
	System.out.println("1.En la posicion " + " " + (pos1+1) + "," + pos2 + "/"+ (pos1+2) + "," + pos2 +"/"+ (pos1+3) + "," + pos2 ) ;
	System.out.println("1.En la posicion " + " " + pos1 + "," + (pos2+1) + "/"+ pos1 + "," + (pos2+2) +"/"+ pos1 + "," + (pos2+3) );
	opcion=teclado.nextInt();
	switch(opcion){
	case 1:
	juego[pos1+1][pos2]=1;
	juego[pos1+2][pos2]=1;
	juego[pos1+3][pos2]=1;
	break;
	case 2:
	juego[pos1][pos2+1]=1;
	juego[pos1][pos2+2]=1;
	juego[pos1][pos2+3]=1;
	break;
	default:System.out.println("La opcion no es correcta");
	}}
	
	}
}
static void seleccionbarco3(){
	
}
static void seleccionbarco2(){
	
}
static void imprimir(){
	for(int i=0;i<9;i++){
		
		for(int k=0;k<9;k++){
			System.out.println("juego[i][k]");
		}
	}
		
	
}
	public static void main(String[] args) {
	
		Scanner teclado=new Scanner(System.in);
		int control=0;
		System.out.println("Comienza el juego");
		System.out.println("Selecciona donde vas a colocar tus barcos");
		System.out.println("1. 2 Barco de 4 unidades de longitud");
		System.out.println("2. 2 Barcos de 3 unidades de longitud");
		System.out.println("3. 2 Barcos de 2 unidades de longitud");
		
		seleccionbarco4();
		imprimir();


		
	}
	}
  