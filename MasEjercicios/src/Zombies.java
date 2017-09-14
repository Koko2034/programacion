import java.util.Scanner;

public class Zombies {

	static char[][]jugador1=new char[5][5];
	static char[][]jugador2=new char[5][5];
	static char[][]mostrarjugador1=new char[5][5];
	static char[][]mostrarjugador2=new char[5][5];
	static boolean controlzombis=true;
	static char jugador1posicion='O';
	static char jugador2posicion='X';
	static int posicionfilajugador1;
	static int posicioncolumnajugador1;
	static int posicionfilajugador2;
	static int posicioncolumnajugador2;
	static char zombie='Z';
	static int vidasjugador1=3;
	static int vidasjugador2=3;
	static boolean controlfinaljuego=true;
	static int fila;
	static int columna;
	static char pocima='P';
	static void inicio(){
		System.out.println("VAMOS A JUGAR AL JUEGO DE LOS ZOMBIS");
	}
	static void llenadojugador1(){
		/*
		 * Asi colocamos la posicion del 1º jugador
		 */
		int i=(int)(Math.random()*5);
		posicionfilajugador1=i;
		int j=(int)(Math.random()*5);
		posicioncolumnajugador1=j;
		jugador1[i][j]=jugador1posicion;
		for(int h=0;h<jugador1.length;h++){
			for(int x=0;x<jugador1[0].length;x++){
				if(jugador1[h][x]!=jugador1posicion)jugador1[h][x]='L';
			}			
		}
		
	}
	static void llenadojugador1mostrar(){
		for(int h=0;h<mostrarjugador1.length;h++){
			for(int x=0;x<mostrarjugador1[0].length;x++){
				if(mostrarjugador1[h][x]!=jugador1posicion)mostrarjugador1[h][x]='L';
			}			
		}
		mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;
	}
	static void llenadojugador2mostrar(){
		for(int h=0;h<mostrarjugador2.length;h++){
			for(int x=0;x<mostrarjugador2[0].length;x++){
				if(mostrarjugador2[h][x]!=jugador2posicion)mostrarjugador2[h][x]='L';
			}			
		}
		mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2]=jugador2posicion;
	}
	static void llenadojugador2(){
		/*
		 * Asi ponemos la posicion del 2º jugador
		 */
		int i=(int)(Math.random()*5);
		posicionfilajugador2=i;
		int j=(int)(Math.random()*5);
		posicioncolumnajugador2=j;
		jugador2[i][j]=jugador2posicion;
		for(int h=0;h<jugador2.length;h++){
			for(int x=0;x<jugador2[0].length;x++){
				if(jugador2[h][x]!=jugador2posicion)jugador2[h][x]='L';
			}			
		}
	}
	static void llenadozombiejugador1(){
		int h=0;
		while(h<5){
		do{
			int i=(int)(Math.random()*5);
			int j=(int)(Math.random()*5);
			if(jugador1[i][j]=='L'){jugador1[i][j]=zombie;controlzombis=false;}
		}while(controlzombis);
			h++;
		}
	}
	static void llenadozombiejugador2(){
		int h=0;
		while(h<5){
		do{
			int i=(int)(Math.random()*5);
			int j=(int)(Math.random()*5);
			if(jugador2[i][j]=='L'){jugador2[i][j]=zombie;controlzombis=false;}
		}while(controlzombis);
			h++;
		}
	}
	static void llenadopocimajugador1(){
		int h=0;
		int contadorpocima=3;
		while(h<5){
		do{
			int i=(int)(Math.random()*5);
			int j=(int)(Math.random()*5);
			if(jugador1[i][j]=='L'){jugador1[i][j]=pocima;contadorpocima--;}
		}while(contadorpocima<0);
			h++;
		}
	}
	static void llenadopocimajugador2(){
		int h=0;
		int contadorpocima=3;
		while(h<5){
		do{
			int i=(int)(Math.random()*5);
			int j=(int)(Math.random()*5);
			if(jugador1[i][j]=='L'){jugador2[i][j]=pocima;contadorpocima--;}
		}while(contadorpocima<0);
			h++;
		}
	}
	static void comprobarvidasjugador1(){
		
		if(vidasjugador1<=0){controlfinaljuego=false;System.out.println("HA GANADO EL JUGADOR2");}
	} 
	static void comprobarvidasjugador2(){
		
		if(vidasjugador2<=0){controlfinaljuego=false;System.out.println("HA GANADO EL JUGADOR 1");}
	}
	static void pruebas(){
		Scanner teclado=new Scanner(System.in);
		char opcion;
		boolean controlmovimiento=true;
		System.out.println();
		while(controlmovimiento){
		System.out.println("HACIA DONDE QUIERES MOVERTE JUGADOR1");
		opcion=teclado.next().charAt(0);
		
	switch(opcion){
	case 'D': 
		if(posicioncolumnajugador1+1<=5){
			controlmovimiento=false;
			mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]='-';
			if(jugador1[posicionfilajugador1][posicioncolumnajugador1+1]=='Z')
				mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1+1]='Z';
			else mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1+1]=jugador1posicion;
	jugador1[posicionfilajugador1][posicioncolumnajugador1]='L';
	if(jugador1[posicionfilajugador1][posicioncolumnajugador1+1]=='Z'){
		comprobarvidasjugador1();
	}else System.out.println("No hay zombissssssss");
	posicioncolumnajugador1++;
	jugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;}
	else System.out.println("Movimiento no permitido");
	break;
	case 'A':
		if(posicioncolumnajugador1-1>=0){
			controlmovimiento=false;
			mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]='-';
			if(jugador1[posicionfilajugador1][posicioncolumnajugador1-1]=='Z')
				mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1-1]='Z';
			else mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1-1]=jugador1posicion;
	jugador1[posicionfilajugador1][posicioncolumnajugador1]='L';
	if(jugador1[posicionfilajugador1][posicioncolumnajugador1-1]=='Z'){
		comprobarvidasjugador1();
	}else System.out.println("No hay zombissssssss");
	posicioncolumnajugador1--;
	jugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;
		}else System.out.println("Movimiento no permitido");
	break;
	case 'W': 
		if(posicionfilajugador1-1>=0){
		controlmovimiento=false;
		mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]='-';
		if(jugador1[posicionfilajugador1-1][posicioncolumnajugador1]=='Z')
			mostrarjugador1[posicionfilajugador1-1][posicioncolumnajugador1]='Z';
		else mostrarjugador1[posicionfilajugador1-1][posicioncolumnajugador1]=jugador1posicion;
	jugador1[posicionfilajugador1][posicioncolumnajugador1]='L';
	if(jugador1[posicionfilajugador1-1][posicioncolumnajugador1]=='Z'){
		comprobarvidasjugador1();
	}else System.out.println("No hay zombissssssss");
	posicionfilajugador1--;
	jugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;
	}else System.out.println("Movimiento no permitido");
	break;
	case 'S': 
		if(posicionfilajugador1+1<=5){
			controlmovimiento=false;
			mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]='-';
			if(jugador1[posicionfilajugador1+1][posicioncolumnajugador1]=='Z')
				mostrarjugador1[posicionfilajugador1+1][posicioncolumnajugador1]='Z';
			else mostrarjugador1[posicionfilajugador1+1][posicioncolumnajugador1]=jugador1posicion;
	jugador1[posicionfilajugador1][posicioncolumnajugador1]='L';
	if(jugador1[posicionfilajugador1+1][posicioncolumnajugador1]=='Z'){
		comprobarvidasjugador2();
	}else System.out.println("No hay zombissssssss");
	posicionfilajugador1++;
	jugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;
	}else System.out.println("Movimiento no permitido");
	break;
	default: System.out.println("La opcion seleccionada no es correcta");
	}
		}
	
	}
	
	static void opcionmovimientojugador1(){
		Scanner teclado=new Scanner(System.in);
		char opcion;
		boolean controlmovimiento=true;
		System.out.println();
		while(controlmovimiento){
		System.out.println("HACIA DONDE QUIERES MOVERTE JUGADOR1");
		opcion=teclado.next().charAt(0);
		switch(opcion){
		case 'D': 
			if(posicioncolumnajugador1+1<=5){
				controlmovimiento=false;
				mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]='-';
				if(jugador1[posicionfilajugador1][posicioncolumnajugador1+1]=='Z')
					mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1+1]='Z';
				else mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1+1]=jugador1posicion;
		jugador1[posicionfilajugador1][posicioncolumnajugador1]='L';
		if(jugador1[posicionfilajugador1][posicioncolumnajugador1+1]=='Z'){
			vidasjugador1--;
			comodin1();
			comprobarvidasjugador2();
		}else if(jugador1[posicionfilajugador1][posicioncolumnajugador1+1]=='P'){vidasjugador1++;System.out.println("Has ganado una vida");jugador1[posicionfilajugador1][posicioncolumnajugador1+1]='L';}
		else System.out.println("No hay zombissssssss");
		posicioncolumnajugador1++;
		jugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;}
		else System.out.println("Movimiento no permitido");
		break;
		case 'A':
			if(posicioncolumnajugador1-1>=0){
				controlmovimiento=false;
				mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]='-';
				if(jugador1[posicionfilajugador1][posicioncolumnajugador1-1]=='Z')
					mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1-1]='Z';
				else mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1-1]=jugador1posicion;
		jugador1[posicionfilajugador1][posicioncolumnajugador1]='L';
		if(jugador1[posicionfilajugador1][posicioncolumnajugador1-1]=='Z'){
			comodin1();
			vidasjugador1--;
			comprobarvidasjugador1();
		}else if(jugador1[posicionfilajugador1][posicioncolumnajugador1-1]=='P') {vidasjugador1++; System.out.println("Has ganado una vida");jugador1[posicionfilajugador1][posicioncolumnajugador1-1]='L';}
		else System.out.println("No hay zombissssssss");
		posicioncolumnajugador1--;
		jugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;
			}else System.out.println("Movimiento no permitido");
		break;
		case 'W': 
			if(posicionfilajugador1-1>=0){
			controlmovimiento=false;
			mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]='-';
			if(jugador1[posicionfilajugador1-1][posicioncolumnajugador1]=='Z')
				mostrarjugador1[posicionfilajugador1-1][posicioncolumnajugador1]='Z';
			else mostrarjugador1[posicionfilajugador1-1][posicioncolumnajugador1]=jugador1posicion;
		jugador1[posicionfilajugador1][posicioncolumnajugador1]='L';
		if(jugador1[posicionfilajugador1-1][posicioncolumnajugador1]=='Z'){
			comodin1();
			vidasjugador1--;
			comprobarvidasjugador1();
		}else if(jugador1[posicionfilajugador1-1][posicioncolumnajugador1]=='P'){vidasjugador1++;System.out.println("Has ganado una vida");jugador1[posicionfilajugador1-1][posicioncolumnajugador1]='L';}
		else System.out.println("No hay zombissssssss");
		posicionfilajugador1--;
		jugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;
		}else System.out.println("Movimiento no permitido");
		break;
		case 'S': 
			if(posicionfilajugador1+1<=5){
				controlmovimiento=false;
				mostrarjugador1[posicionfilajugador1][posicioncolumnajugador1]='-';
				if(jugador1[posicionfilajugador1+1][posicioncolumnajugador1]=='Z')
					mostrarjugador1[posicionfilajugador1+1][posicioncolumnajugador1]='Z';
				else mostrarjugador1[posicionfilajugador1+1][posicioncolumnajugador1]=jugador1posicion;
		jugador1[posicionfilajugador1][posicioncolumnajugador1]='L';
		if(jugador1[posicionfilajugador1+1][posicioncolumnajugador1]=='Z'){
			comodin1();
			vidasjugador1--;
			comprobarvidasjugador1();
		}else if (jugador1[posicionfilajugador1+1][posicioncolumnajugador1]=='P'){vidasjugador1++;System.out.println("Has ganado una vida");jugador1[posicionfilajugador1+1][posicioncolumnajugador1]='L';}
		else System.out.println("No hay zombissssssss");
		posicionfilajugador1++;
		jugador1[posicionfilajugador1][posicioncolumnajugador1]=jugador1posicion;
		} else System.out.println("Movimiento no permitido");
		break;
		default: System.out.println("La opcion seleccionada no es correcta");
		}
			}
	
	}
	static void opcionmovimientojugador2(){
		Scanner teclado=new Scanner(System.in);
		char opcion;
		boolean controlmovimiento=true;
		System.out.println();
		while(controlmovimiento){
		System.out.println("HACIA DONDE QUIERES MOVERTE JUGADOR2");
		opcion=teclado.next().charAt(0);
		
	switch(opcion){
	case 'D': 
		if(posicioncolumnajugador2+1<=5){
			controlmovimiento=false;
			mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2]='-';
			if(jugador2[posicionfilajugador2][posicioncolumnajugador2+1]=='Z')
				mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2+1]='Z';
			else mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2+1]=jugador2posicion;
	jugador2[posicionfilajugador2][posicioncolumnajugador2]='L';
	if(jugador2[posicionfilajugador2][posicioncolumnajugador2+1]=='Z'){
		comodin2();
		vidasjugador2--;
		comprobarvidasjugador2();
	}
	else if(jugador2[posicionfilajugador2][posicioncolumnajugador2+1]=='P'){vidasjugador2++;System.out.println("Has ganado una vida");jugador2[posicionfilajugador2][posicioncolumnajugador2+1]='L';
		
	}else System.out.println("No hay zombissssssss");
	posicioncolumnajugador2++;
	jugador2[posicionfilajugador2][posicioncolumnajugador2]=jugador2posicion;}
	else System.out.println("Movimiento no permitido");
	break;
	case 'A':
		if(posicioncolumnajugador2-1>=0){
			controlmovimiento=false;
			mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2]='-';
			if(jugador2[posicionfilajugador2][posicioncolumnajugador2-1]=='Z')
				mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2-1]='Z';
			else mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2-1]=jugador2posicion;
	jugador2[posicionfilajugador2][posicioncolumnajugador2]='L';
	if(jugador2[posicionfilajugador2][posicioncolumnajugador2-1]=='Z'){
		comodin2();
		vidasjugador2--;
		comprobarvidasjugador2();
	}else if(jugador2[posicionfilajugador2][posicioncolumnajugador2-1]=='P'){vidasjugador2++;System.out.println("Has ganado una vida");jugador2[posicionfilajugador2][posicioncolumnajugador2-1]='L';}
	else System.out.println("No hay zombissssssss");
	posicioncolumnajugador2--;
	jugador2[posicionfilajugador2][posicioncolumnajugador2]=jugador2posicion;
		}else System.out.println("Movimiento no permitido");
	break;
	case 'W': 
		if(posicionfilajugador2-1>=0){
		controlmovimiento=false;
		mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2]='-';
		if(jugador2[posicionfilajugador2-1][posicioncolumnajugador2]=='Z')
			mostrarjugador2[posicionfilajugador2-1][posicioncolumnajugador2]='Z';
		else mostrarjugador2[posicionfilajugador2-1][posicioncolumnajugador2]=jugador2posicion;
	jugador2[posicionfilajugador2][posicioncolumnajugador2]='L';
	if(jugador2[posicionfilajugador2-1][posicioncolumnajugador2]=='Z'){
		comodin2();
		vidasjugador2--;
		comprobarvidasjugador2();
	}else if(jugador2[posicionfilajugador2-1][posicioncolumnajugador2]=='P'){vidasjugador2++;System.out.println("Has ganado una vida");jugador2[posicionfilajugador2-1][posicioncolumnajugador2]='L';}
	else System.out.println("No hay zombissssssss");
	posicionfilajugador2--;
	jugador2[posicionfilajugador2][posicioncolumnajugador2]=jugador2posicion;
	}else System.out.println("Movimiento no permitido");
	break;
	case 'S': 
		if(posicionfilajugador2+1<=5){
			controlmovimiento=false;
			mostrarjugador2[posicionfilajugador2][posicioncolumnajugador2]='-';
			if(jugador2[posicionfilajugador2+1][posicioncolumnajugador2]=='Z')
				mostrarjugador2[posicionfilajugador2+1][posicioncolumnajugador2]='Z';
			else mostrarjugador2[posicionfilajugador2+1][posicioncolumnajugador2]=jugador2posicion;
	jugador2[posicionfilajugador2][posicioncolumnajugador2]='L';
	if(jugador2[posicionfilajugador2+1][posicioncolumnajugador2]=='Z'){
		comodin2();
		vidasjugador1--;
		comprobarvidasjugador2();
	}else if(jugador2[posicionfilajugador2+1][posicioncolumnajugador2]=='P'){vidasjugador2++;System.out.println("Has ganado una vida");jugador2[posicionfilajugador2+1][posicioncolumnajugador2]='L';}
	else System.out.println("No hay zombissssssss");
	posicionfilajugador2++;
	jugador2[posicionfilajugador2][posicioncolumnajugador2]=jugador2posicion;
	}else System.out.println("Movimiento no permitido");
	break;
	default: System.out.println("La opcion seleccionada no es correcta");
	}
		}
	
	}
	static void comodin1(){
		Scanner teclado=new Scanner(System.in);
		int numero=2;
		int numeroacertar=(int)(Math.random()*6);
		while(numero<0 && numero>5)
		System.out.println("Di un numero de 0 a 5, si aciertas ganaras una vida");
		numero=teclado.nextInt();
		if(numero==numeroacertar)vidasjugador1++;
	}
	static void comodin2(){
		Scanner teclado=new Scanner(System.in);
		int numero=2;
		int numeroacertar=(int)(Math.random()*6);
		while(numero<0 && numero>5)
		System.out.println("Di un numero de 0 a 5, si aciertas ganaras una vida");
		numero=teclado.nextInt();
		if(numero==numeroacertar)vidasjugador2++;
	}
	static void comienzojuego(){
		while(controlfinaljuego){
			opcionmovimientojugador1();
			imprimirmostrarjugador1();
			comprobarvidajugador1();
			if(controlfinaljuego){
			opcionmovimientojugador2();
			imprimirmostrarjugador2();
			comprobarvidajugador2();}
		}
	}
	static void imprimirjugador2(){
		for(int h=0;h<jugador2.length;h++){
			System.out.print((jugador2.length-h)+" ");
			for(int x=0;x<jugador2[0].length;x++){
				System.out.print(jugador2[h][x]+" ");
			}System.out.println();
		}System.out.print("  ");
		for(int x=0;x<jugador2.length;x++)
		System.out.print((x+1) +" ");
	}
	static void imprimirjugador1(){
		for(int h=0;h<jugador1.length;h++){
			System.out.print((jugador1.length-h)+" ");
			for(int x=0;x<jugador1[0].length;x++){
				System.out.print(jugador1[h][x]+" ");
			}System.out.println();
		}System.out.print("  ");
		for(int x=0;x<jugador1.length;x++)
		System.out.print((x+1) +" ");
	}
	static void imprimirmostrarjugador1(){
		for(int h=0;h<mostrarjugador1.length;h++){
			System.out.print((mostrarjugador1.length-h)+" ");
			for(int x=0;x<mostrarjugador1[0].length;x++){
				System.out.print(mostrarjugador1[h][x]+" ");
			}System.out.println();
		}System.out.print("  ");
		for(int x=0;x<mostrarjugador1.length;x++)
		System.out.print((x+1) +" ");
	}
	static void imprimirmostrarjugador2(){
		for(int h=0;h<mostrarjugador2.length;h++){
			System.out.print((mostrarjugador2.length-h)+" ");
			for(int x=0;x<mostrarjugador1[0].length;x++){
				System.out.print(mostrarjugador2[h][x]+" ");
			}System.out.println();
		}System.out.print("  ");
		for(int x=0;x<mostrarjugador2.length;x++)
		System.out.print((x+1) +" ");
	}
	static void comprobarvidajugador1(){
		System.out.println();
		System.out.println("Las vidas del jugador 1 son " + vidasjugador1);
	}
	static void comprobarvidajugador2(){
		System.out.println();
		System.out.println("Las vidas del jugador 2 son " + vidasjugador2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inicio();
		llenadojugador1();
		llenadojugador2();
		llenadojugador1mostrar();
		llenadojugador2mostrar();
		llenadozombiejugador1();
		llenadozombiejugador2();
		comienzojuego();
		System.out.println("Jugador 1");
		imprimirmostrarjugador1();
		System.out.println();
		System.out.println("Jugador 2");
		imprimirmostrarjugador2();
		
	}

}
