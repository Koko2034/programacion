import java.util.Scanner;

public class Raya4 {

	static char[][]tablero=new char[6][7];
	static boolean controljuego=true;
	static String ganador="inicio";
	static int f;
	static int c;
	static char seleccion;
	static char seleccion2;
	static void inicio(){
		System.out.println("VAMOS A JUGAR AL 4 EN RAYA");
		System.out.println("El tablero vacio es el siguiente");
		rellenar();
		imprimir();
		color();
		juego();
	}
	static void rellenar(){
		for(int i=0;i<tablero.length;i++){
			for(int j=0;j<tablero[0].length;j++){
				tablero[i][j]='=';
			}
		}
	}
	static void imprimir(){
		int contador=tablero.length;
		for(int i = 0; i<tablero.length;i++){
			System.out.print(contador + " ");
			for(int j = 0; j<tablero[0].length;j++){
				System.out.print((tablero[i][j])+" ");
			}
			System.out.println();
			contador--;
		}
		System.out.print("  ");
		for(int i=1;i<=tablero[0].length;i++)
			System.out.print(i + " ");
	System.out.println();
	}
	static void color(){
		
		Scanner teclado=new Scanner(System.in);
		
		while(seleccion!='B' && seleccion!='R'){
		System.out.println("Escoge un color: B o R");
		seleccion=teclado.next().charAt(0);
		if(seleccion=='B')seleccion2='R';
		else if (seleccion=='R')seleccion2='B';
		}
	}
	static void juego(){
		while(controljuego && seleccion=='R'){
			tiradamaquina();
			if(controljuego) tiradajugador();
		}
		while(controljuego && seleccion=='B'){
			tiradajugador();
			if(controljuego) tiradamaquina();
		}
		System.out.println("Ha acabado el juego. Ha ganado el jugador " + ganador);
	}
	static void tiradajugador(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Es tu turno");
		boolean controltirada=true;
		while(controltirada){
			System.out.println("Introduzca una columna");
			int i=tablero.length-1;
			int j=(teclado.nextInt())-1;
			while(controltirada && i<tablero.length && i>=0){
				
				if(tablero[i][j]=='='){controltirada=false;tablero[i][j]=seleccion;}
				i--;
			}
			
			comprobarganador();
			imprimir();
		}
	}
	static void tiradamaquina(){
		boolean controltirada=true;
		while(controltirada){
		int i=tablero.length-1;
		int j=(int)(Math.random()*tablero.length);
		while(controltirada && i<tablero.length && i>=0){
			if(tablero[i][j]=='=') {controltirada=false;tablero[i][j]=seleccion2;}
			i--;
		}
		
		comprobarganador();
		imprimir();
		}
	}
	static void comprobarganador(){
		int i=0;
		int j=0;
		while(controljuego && i<tablero.length){
			j=0;
			while(controljuego && j<tablero[0].length){
			if(tablero[i][j]=='B' || tablero[i][j]=='R'){
				f=i;
				c=j;
					metodohorizontal();
					metodovertical();
					metododiagonal();
					if(!controljuego && tablero[f][c]=='B') ganador="blancas";
					else if(!controljuego && tablero[f][c]=='R') ganador="rojas";
					
			}
			j++;
			}
			i++;
			
		}
		
	}
	static void metodohorizontal(){
		if(c<(tablero[0].length-3) && tablero[f][c]==tablero[f][c+1] && tablero[f][c+1]==tablero[f][c+2] && tablero[f][c+1]==tablero[f][c+3]) controljuego=false;
		
	}
	static void metodovertical(){
		if( f<(tablero.length-3) && tablero[f][c]==tablero[(f+1)][c] && tablero[f][c]==tablero[(f+2)][c] && tablero[f][c]==tablero[(f+3)][c]) controljuego=false;
		
	}
	static void metododiagonal(){
		
		if(f<(tablero.length-3) && c<(tablero[0].length-3) && tablero[f][c]==tablero[f+1][c+1] && tablero[f+1][c+1]==tablero[f+2][c+2] && tablero[f+1][c+1]==tablero[f+3][c+3]) controljuego=false;
		else if(f<tablero.length-3 && c>tablero[0].length-3 && tablero[f][c]==tablero[f+1][c-1] && tablero[f+1][c-1]==tablero[f+2][c-2] && tablero[f+1][c-1]==tablero[f+3][c-3]) controljuego=false;
		else if(f>tablero.length-3 && c>tablero[0].length-3 && tablero[f][c]==tablero[f-1][c-1] && tablero[f-1][c-1]==tablero[f-2][c-2] && tablero[f-1][c-1]==tablero[f-3][c-3]) controljuego=false;
		else if(f>tablero.length-3 && c<tablero[0].length-3 && tablero[f][c]==tablero[f-1][c+1] && tablero[f-1][c+1]==tablero[f-2][c+2] && tablero[f-1][c+1]==tablero[f-3][c+3]) controljuego=false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inicio();
	}

}
