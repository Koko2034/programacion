import java.util.Scanner;

public class SieteyMedia {

	static int[][]baraja=new int[4][10];
	static double[]resultado=new double[10];
	static int[]jugadores=new int[10];
	static double carta;
	static String palo;
	static int numerojugadores=0;
	static int jugador=0;
	static void rellenarbaraja(){
		
		for(int i=0;i<baraja.length;i++){
			for(int j=0;j<baraja[0].length;j++){
				baraja[i][j]=1;
			}
		}
	}
	static void comienzojuego(){
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Vamos a jugar a las Siete y media");
		System.out.println("Normas");
		System.out.println("1.Cada carta vale su valor excepto las figuras");
		System.out.println("2.Cada figura vale 0,5");
		System.out.println("Gana el jugador que se acerca mas al valor de las 7.5");
		while(numerojugadores>10 || numerojugadores<2){
		System.out.println("Cuantos jugadores van a jugar?");
		numerojugadores=teclado.nextInt();
		if(numerojugadores<2 || numerojugadores>10)System.out.println("Son muchos jugadores, selecciona mas de 2 y menos de 10");
		
		}
		rellenarjugadores();
		}
	static void rellenarjugadores(){
			for(int i=0;i<numerojugadores;i++){
				jugadores[i]=(i+1);
			}
		}
	static void juegojugador(){
		Scanner teclado=new Scanner(System.in);
		
		
		
		
		while(jugador<numerojugadores){
			System.out.println("Le toca al jugador numero " + (jugador+1));
			boolean controlcontestacion=true;
			double valor=0;
			char contestacion;
			boolean controlfinal=true;
		do{
			controlcontestacion=true;
			contestacion='j';
			controlfinal=true;
		generarcarta();
		System.out.println("La carta que te han repartido es el " + carta + " de " + palo);
		valor=valor+carta;
		System.out.println("La puntuacion que llevas es " + valor);
		if(valor>7.5){valor=0;controlcontestacion=false;}
		while(controlcontestacion){
		System.out.println("Desea otra carta(s/n)???");
		contestacion=teclado.next().charAt(0);
		if(contestacion == 's'){controlcontestacion=false;}
		else if(contestacion == 'n'){controlfinal=false;controlcontestacion=false;}
		else System.out.println("La respuesta no es valida");
		}
		}while(controlfinal && valor<=7.5 && valor>0);
		resultado[jugador]=valor;
		jugador++;
		}
		}
	static void generarcarta(){
		boolean controljuego=true;
		int i=0;
		int j=0;
		
		while(controljuego){
			i=(int)(Math.random()*4);
			j=(int)(Math.random()*10);
			if(baraja[i][j]!=0){baraja[i][j]=0;controljuego=false;}
		}
		if(j<7)carta=(j+1);
		else carta=0.5;
		switch(i){
		case 0: palo="Oros"; 
		break;
		case 1:palo="Espadas";
		break; 
		case 2:palo="Bastos";
		break;
		case 3:palo="Copas";
		break;
		}
	}
	static void imprimir(){
		for(int i=0;i<numerojugadores;i++){
			System.out.println("El resultado del jugador numero " + (i+1) + " es " + resultado[i]);
		}
	}
	static void ganador(){
		
			for(int k=0;k<resultado.length-1;k++) {
			for(int f=0;f< resultado.length-1-k;f++) {
			if (resultado[f]>resultado[f+1]) {
			double aux;
			aux=resultado[f];
			resultado[f]=resultado[f+1];
			resultado[f+1]=aux;
			int auxjugador;
			auxjugador=jugadores[f];
			jugadores[f]=jugadores[f+1];
			jugadores[f+1]=auxjugador;
			}
			}
			}
			
			System.out.println("El jugador ganador es el jugador numero " + jugadores[9] + " con una puntuacion de " + resultado[9]);
				
					
				}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rellenarbaraja();
		comienzojuego();
		juegojugador();
		imprimir();
		ganador();
	}

}
