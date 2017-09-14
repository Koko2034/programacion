import java.util.Scanner;

public class ProblemasPropuestos7 {

	static String [][]matriz= new  String [6][7];
	static char color=' ';
	static boolean controlrojas=true;
	static char jugador;
	static int fila;
	static int columna;
	static boolean controltirada=true;
	static boolean controltiradasalida=true;
	static boolean control=true;
	static boolean controljuego=true;
	static void limpiezatablero(){
		for(int i =0;i<matriz.length;i++){
			for(int j = 0; j<matriz[0].length;j++){
				matriz[i][j]="L";
				
			}
			
		}
		
	}
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		char inicio=' ';
		System.out.println("JUEGO 4 EN LINEA");
		System.out.println("Desea iniciar el juego(s/n)");
		inicio=teclado.next().charAt(0);
		if(inicio=='s') {
			teclado.nextLine();
			
		while(control){
			System.out.println("Que color desea blanco o rojo(b/r)");
		color=teclado.next().charAt(0);
		
		if(color=='b' || color=='r')control=false;
		
		System.out.println(color);
		jugador=color;
		}
		}else System.out.println("Ha finalizado el juego");
		control=true;
		System.out.println("BLANCAS EMPIEZAN A JUGAR");
	
	
	}
	static void control(){
		if(jugador=='b'){
		
			juegojugador();
		}else
			
				juegomaquina();
			
				
			
		}
	static void jugar(){
		int i=0;
		boolean controlsalida=true;
		control=true;
		while(control){
		while(i<=6 && controlsalida){
			System.out.println("hello");
			if(matriz[6-1-i][columna-1]=="L"){
				matriz[6-1-i][columna-1]=color+"";
				controlsalida=false;
				fila=6-1-i;
		}else if(i<=6)i++;
		else if(i>6){switch(color){
		case 'b': if(jugador=='b')juegojugador();else juegomaquina();
		break;
		case 'r': if(jugador=='r')juegojugador();else juegomaquina();
		break;
		}
			
		}
		}
		comprobarganador();
		imprimir();
		switch(color){
		case 'b': color='r';if(jugador=='b')juegomaquina();else juegojugador();
		break;
		case 'r': color='b';if(jugador=='r')juegomaquina();else juegojugador();
		break;
		}
		}
		}	
	static void juegojugador(){
		Scanner teclado=new Scanner(System.in);
		controltirada=true;
		while(controltirada){
		System.out.println("COLUMNA?????");
		columna=teclado.nextInt();
		
		if(columna<8 && columna>=1){
			controltirada=false;
		}
		
		}
		jugar();
		
	}
	
	static void juegomaquina(){
		
		columna=(int)(Math.random()*7+1);
		System.out.println();
		jugar();
	}
	static void comprobarganador(){
	control=true;
	/*int i= fila-1;
	int j=columna-1;
				
				if(matriz[i][j]==matriz[i-1][j] && matriz[i-1][j]==matriz[i-2][j] && matriz[i-2][j]==matriz[i-3][j]){
					control=false;
					System.out.println("El jugador que ha ganado es:" + color);
				}else if(matriz[i][j]==matriz[i+1][j] && matriz[i+1][j]==matriz[i+2][j] && matriz[i+2][j]== matriz[i+3][j]){
					control=false;
					System.out.println("El jugador que ha ganado es:" + color);
				}else if(matriz[i][j]==matriz[i][j+1] && matriz[i][j+1]==matriz[i][j+2] && matriz[i][j+2]==matriz[i][j+3]){
					control=false;
					System.out.println("El jugador que ha ganado es:" + color);
				}else if(matriz[i][j]==matriz[i][j-1] && matriz[i][j-1]==matriz[i][j-2] && matriz[i][j-2]==matriz[i][j-3]){
					control=false;
					System.out.println("El jugador que ha ganado es:" + color);
				}else if(matriz[i][j]==matriz[i+1][j+1] && matriz[i+1][j+1]==matriz[i+2][j+2] && matriz[i+2][j+2]==matriz[i+3][j+3]){
					control=false;
					System.out.println("El jugador que ha ganado es:" + color);
				}else if(matriz[i][j]==matriz[i+1][j-1] && matriz[i+1][j-1]==matriz[i+2][j-2] && matriz[i+2][j-2]==matriz[i+3][j-3]){
					control=false;
					System.out.println("El jugador que ha ganado es:" + color);
				}else if(matriz[i][j]==matriz[i-1][j+1] && matriz[i-1][j+1]==matriz[i-2][j+2] && matriz[i-2][j+2]==matriz[i-3][j+3]){
					control=false;
					System.out.println("El jugador que ha ganado es:" + color);
				}else if(matriz[i][j]==matriz[i-1][j-1] && matriz[i-1][j-1]==matriz[i-2][j-2] && matriz[i-2][j-2]==matriz[i-3][j-3]){
					control=false;
					System.out.println("El jugador que ha ganado es:" + color);
				}
				
		if(color==jugador && !control){
			System.out.println("HAS GANADO");
		}else if(color==jugador && !controljuego)System.out.println("HAS PERDIDO");
		*/
		}
	
	
	static void imprimir(){
		int columna=6;
		int fila=1;
		for(int i =0;i<matriz.length;i++){
			System.out.print (columna + " ");
			for(int j = 0; j<matriz[0].length;j++){
			System.out.print( matriz[i][j] + " ");
				
			}
			System.out.println();
			columna--;
		}
		System.out.print("  ");
		for(int h=1;h<=matriz[0].length;h++){
			System.out.print(h + " ");
			}
		System.out.println();
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
/*5. El juego de las 4 en línea consta de un tablero formado por siete columnas y seis
filas.
En una partida participan dos jugadores, uno con fichas blancas y otro
rojas. Inicialmente todas las posiciones del tablero están libres. Cada jugador
coloca alternativamente una ficha en una columna. La ficha colocada cae por su
propio peso hasta el fondo de la columna correspondiente (primera fila de la
columna libre); por ejemplo, en la figura si el jugador Rojo coloca una ficha en la
columna 2, la ficha se coloca en la fila 3. La partida la gana el jugador que
coloque en primer lugar cuatro de sus fichas en línea horizontal, vertical o en
diagonal. La partida queda en tablas si ninguno de los jugadores es capaz de
alinear cuatro fichas después de llenar el tablero.
a) Codifica las estructuras de datos necesarias para jugar una partida.
b) Escribe un subprograma inicializarJuego() que quite todas las fichas
del tablero y prepare el tablero de juego.
c) Escribe un subprograma colocarFicha() que dado un jugador (blanco o
rojo) y una columna (1 a 7), coloque la ficha en la posición correspondiente.
d) Escribe un subprograma presentarTablero() que visualice en la pantalla
el estado del tablero (como en la figura, excepto la rejilla).
e) Escribe un subprograma comprobarGanador() que, dado un jugador
(blanco o rojo) y una determinada casilla (1 a 6, 1 a 7), determine si hay
cuatro fichas del mismo jugador alineadas en horizontal a partir de esa
posición hacia la derecha.

 * 
 */	
			
			limpiezatablero();
			iniciar();
			control();
			jugar();
	}

		
}
