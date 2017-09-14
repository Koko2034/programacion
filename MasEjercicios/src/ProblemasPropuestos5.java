import java.util.Scanner;

public class ProblemasPropuestos5 {

	static int[][]hundir= new int[8][8]; // nuestra colocacion de barcos
	static int[][]hundir2=new int[8][8]; // colocacion de la maquina de barcos
	static int[][]hundir3=new int[8][8]; // comprobacion de lo que va bombardeando la maquina
	static int[][]hundir4=new int[8][8]; // comprobacion de lo que vamos bombardeando nosotros
	static int[][]controlhundidos=new int[8][8]; // control de barcos hundidos
	static int [][]controlhundidosmaquina=new int[8][8]; // control de barcos hundidos maquina
	static int f;
	static int c;
	static int x;
	static int y;
	static boolean controlfinal=true;
	static boolean controlposicion=true;
	static boolean controlbarco=true;
	static boolean controlando=true;
	static int tama�o;
	static int numero;
	static int fm;
	static int cm;
	
	static void colocarbarcos(){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Comienza el juego de los barquitos");
		int opcion;
		numero=1;
		System.out.println("Colocar los barcos correspondientes");
		System.out.println("Cuantos barcos de 4 unidades quieres colocar?");
		opcion=teclado.nextInt();
		System.out.println("1. Coloca los " + opcion + " barcos de 4 unidades");
			tama�o=4;
			
			for(int i=0;i<opcion;i++){
				
			posicion();
			comprobar();
			
			cambiar();
			javier();
			numero++;
		}
			System.out.println("Cuantos barcos de 3 unidades quieres colocar?");
			opcion=teclado.nextInt();
		System.out.println("2. Coloca los "+ opcion + " barcos de 3 unidades");
			tama�o=3;
			for(int i=0;i<opcion;i++){
			posicion();
			comprobar();
			
			cambiar();
			javier();
			numero++;
			}
			System.out.println("Cuantos barcos de 2 unidades quieres colocar?");
			opcion=teclado.nextInt();
		System.out.println("3. Coloca los " + opcion + " barcos de 2 unidades");
			tama�o=2;
			for(int i=0;i<opcion;i++){
			posicion();
			comprobar();
			
			cambiar();
			javier();
			numero++;
		}
		
		rellenarbarcoshundidos();
	}
	static void posicion(){
		Scanner teclado=new Scanner(System.in);
		controlando=true;
		do{
		System.out.println("Cual es la fila de tu barco");
		f=teclado.nextInt();
		System.out.println("Cual es la columna de tu barco");
		c=teclado.nextInt();
		if(hundir[f][c]==0) { hundir[f][c]=1;controlando=false;}
		}while(controlando);
		}
	static void bombardeo(){
		Scanner teclado= new Scanner(System.in);
		
		boolean control=true;
		while(controlfinal){
			boolean controldisparomaquina=true;
		System.out.println("Que posicion desea bombardear");
		do{
			System.out.println("Escoja una opcion del eje Y:fila");
			f=teclado.nextInt();
			if(f>=0 && f<8){control=false;}
			}while(control);
		control=true;
		do{
		System.out.println("Escoja una opcion del eje X:columna");
		c=teclado.nextInt();
		if(c>=0 && c<8){control=false;}
		}while(control);
		if(hundir2[f][c]==0){System.out.println("UYYYYYYYYYYYYY.......AGUAAAAAAAAAAAAAA");
		hundir4[f][c]=70;}
		else {
			boolean barcoshundidos=true;
			int numerobarco=hundir2[f][c];
			hundir4[f][c]=hundir2[f][c];
			controlhundidos[f][c]=0;
		for(int i=0;i<8;i++){
			for(int k=0;k<8;k++){
				if(controlhundidos[i][k]==numero) barcoshundidos=false;
			}
			}
		if(!barcoshundidos){System.out.println("TOCADO Y HUNDIDO");
		int contadorfinal=0;
		for(int i=0;i<hundir.length;i++){
			for(int j=0;j<hundir.length;j++){
				if(controlhundidosmaquina[j][i]==0) {contadorfinal++;
				if(contadorfinal==64) controlfinal=false;}
			}
		}}
		else System.out.println("TOCADOOOOOOOOOOOOOOOOOO");}
		
		imprimir();
		System.out.println();
		System.out.println("DISPARA LA MAQUINA");
	while(controldisparomaquina){
		fm=(int)(Math.random()*7);
		cm=(int)(Math.random()*7);
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(hundir3[fm][cm]==0)controldisparomaquina=false;
							
			}
		}
	}
	
	if(hundir[fm][cm]==0){System.out.println("UYYYYYYYYYYYYY.......AGUAAAAAAAAAAAAAA");
	hundir3[fm][cm]=70;}
	else  { boolean barcohundidos=true;
		int numerobarco=hundir[fm][cm];
		hundir3[fm][cm]=hundir[fm][cm];
		controlhundidosmaquina[fm][cm]=0;
		for(int i=0;i<8;i++){
			for(int k=0;k<8;k++){
				if(controlhundidos[i][k]==numero)
					barcohundidos=false;
			}
		}
		if(barcohundidos) System.out.println("TOCADO y HUNDIDO");
		else System.out.println("TOCADOOOOOOOOOOOOOOOOOOOOOO");
	}
		
	}
	}
	
	static void comprobar(){
		do{
		controlderecha();
		if(controlposicion){
		controlizquierda();}
		if(controlposicion){
		controlarriba();}
		if(controlposicion){
		controlabajo();}
		}while(controlposicion);
		}
	static void controlarriba(){
		Scanner teclado=new Scanner(System.in);
		boolean controlbarco=true;
		controlposicion=true;
		char opcion;
		int i=1;
		while(i<tama�o && controlbarco){
			
			if((f-i)<0 || hundir[(f-i)][c]!=0){
				controlbarco=false;
			}
			i++;
		}
		if(controlbarco){
			System.out.println("El barco puede estar en las posicion desde arriba ");
			System.out.println("Desea esta opcion(s/n)");
			opcion=teclado.next().charAt(0);
			if(opcion=='s'){for(i=0;i<tama�o;i++){hundir[f-i][c]=1;}controlposicion=false;}
			
		}else System.out.println("El barco no puede estar dirigido hacia arriba");
	}
	static void controlabajo(){
		Scanner teclado=new Scanner(System.in);
		boolean controlbarco=true;
		controlposicion=true;
		char opcion;
		
		int i=1;
		while(i<tama�o && controlbarco){
			
			if((f+i)>7 || hundir[(f+i)][c]!=0){
				controlbarco=false;
			}
			i++;
		}
		if(controlbarco){
			System.out.println("El barco puede estar en las posicion desde abajo ");
			System.out.println("Desea esta opcion(s/n)");
			opcion=teclado.next().charAt(0);
			if(opcion=='s'){for(i=0;i<tama�o;i++){hundir[f+i][c]=1;}controlposicion=false;}
			
		}else System.out.println("El barco no puede estar dirigido hacia abajo");
	}
	static void controlderecha(){
		Scanner teclado=new Scanner(System.in);
		controlbarco=true;
		controlposicion=true;
		char opcion;
		int i=1;
		while(i<tama�o && controlbarco){
			
			if( (c+i)>7  ||hundir[f][(c+i)]!=0){
				controlbarco=false;
			}
			i++;
		}
		if(controlbarco){
			System.out.println("El barco puede estar en las posicion desde derecha ");
			System.out.println("Desea esta opcion(s/n)");
			opcion=teclado.next().charAt(0);
			if(opcion=='s'){for(i=0;i<tama�o;i++){hundir[f][c+i]=1;}controlposicion=false;}
			
			
		}else System.out.println("El barco no puede estar dirigido hacia derecha");
	}
	static void controlizquierda(){
		Scanner teclado=new Scanner(System.in);
		controlbarco=true;
		char opcion;
		controlposicion=true;
		int i=1;
		while(i<tama�o && controlbarco){
			
			if((c-i)<0 || hundir[(f)][c-i]!=0){
				controlbarco=false;
			}
			i++;
		}
		if(controlbarco){
			System.out.println("El barco puede estar en las posicion desde izquierda ");
			System.out.println("Desea esta opcion(s/n)");
			opcion=teclado.next().charAt(0);
			if(opcion=='s'){for(i=0;i<tama�o;i++){hundir[f][c-i]=1;}controlposicion=false;}
			
		}else System.out.println("El barco no puede estar dirigido hacia izquierda");
		
		}	
	static void cambiar(){
		for( int i=0;i<8;i++){
			for(int k=0;k<8;k++){
				if(hundir[i][k]==1)hundir[i][k]=numero;
			}
		}
	}

	
	static void imprimir(){
		
		System.out.println("Mi matriz");
		for(int k=0;k<8;k++)System.out.print("___");
		System.out.println();
		  for(int i=0;i<hundir.length;i++){
			  
				System.out.print("|");
			for (int j=0;j<hundir.length;j++){
				System.out.print(hundir[i][j]+" |");
				
				
			} System.out.println();
			for(int k=0;k<8;k++)System.out.print("___");
			System.out.println();
		}
		System.out.println("Tablero en blanco para saber donde disparo");
		for(int k=0;k<8;k++)System.out.print("___");
		System.out.println();
		  for(int i=0;i<hundir4.length;i++){
			  
				System.out.print("|");
			for (int j=0;j<hundir4.length;j++){
				System.out.print(hundir4[i][j]+" |");
				
				
			} System.out.println();
			for(int k=0;k<8;k++)System.out.print("___");
			System.out.println();
		}
		  
		
		System.out.println();
		System.out.println("Tablero de la maquina");
		for(int i=0;i<hundir2.length;i++){
			for (int j=0;j<hundir2.length;j++){
				System.out.print(hundir2[i][j]+" ");
				
			} System.out.println();
		}
		System.out.println("controlhundidosmaquina");
		for(int i=0;i<hundir2.length;i++){
			for (int j=0;j<hundir2.length;j++){
				System.out.print(controlhundidosmaquina[i][j]+" ");
				
			} System.out.println();
	}System.out.println("controlhundidos");
	for(int i=0;i<hundir2.length;i++){
		for (int j=0;j<hundir2.length;j++){
			System.out.print(controlhundidos[i][j]+" ");
			
		} System.out.println();
}
	}
	
	static void javier(){
		boolean controlmaquina=true;
		do{
		fm=(int)(Math.random()*7);
		cm=(int)(Math.random()*7);
		if(hundir2[fm][cm]==0){controlmaquina=false;hundir2[fm][cm]=1;}
		}while(controlmaquina);
		
		maquina();
	} 
	static void maquina(){
		do{
			
		int maquina=(int)(Math.random()*4+1);
		
		if(maquina==1){controlarribamaquina();}
		else if(maquina==2){controlabajomaquina();}
		else if(maquina==3){controlizquierdamaquina();}
		else if(maquina==4){controlderechamaquina();}
		
		
		}while(controlposicion);
	}
	static void controlarribamaquina(){
		
		boolean controlbarco=true;
		controlposicion=true;
		
		int i=1;
		while(i<tama�o && controlbarco){
			
			if((fm-i)<0 || hundir2[(fm-i)][cm]!=0){
				controlbarco=false;
			}
			i++;
		}
		if(controlbarco){
			for(i=0;i<tama�o;i++){hundir2[fm-i][cm]=1;}
			controlposicion=false;
			cambiarmaquina();
			}
			
		
	}
	static void controlabajomaquina(){
		
		boolean controlbarco=true;
		controlposicion=true;
		
		
		int i=1;
		while(i<tama�o && controlbarco){
			
			if((fm+i)>7 || hundir2[(fm+i)][cm]!=0){
				controlbarco=false;
			}
			i++;
		}
		if(controlbarco){
			for(i=0;i<tama�o;i++){hundir2[fm+i][cm]=1;}
			controlposicion=false;
			cambiarmaquina();}
			
		}
	
	static void controlizquierdamaquina(){
		
		controlbarco=true;
		
		controlposicion=true;
		int i=1;
		while(i<tama�o && controlbarco){
			
			if((cm-i)<0 || hundir2[(fm)][cm-i]!=0){
				controlbarco=false;
			}
			i++;
		}
		if(controlbarco){
			for(i=0;i<tama�o;i++){hundir2[fm][cm-i]=1;}
			controlposicion=false;
			cambiarmaquina();}
			
		
		
	}
	static void controlderechamaquina(){
		
		controlbarco=true;
		controlposicion=true;
		int i=1;
		while(i<tama�o && controlbarco){
			
			if( (cm+i)>7  ||hundir2[fm][(cm+i)]!=0){
				controlbarco=false;
			}
			i++;
		}
		if(controlbarco){
			for(i=0;i<tama�o;i++){hundir2[fm][cm+i]=1;}
			controlposicion=false;
			cambiarmaquina();}
			
			
		
	}
	static void cambiarmaquina(){
		for( int i=0;i<8;i++){
			for(int k=0;k<8;k++){
				if(hundir2[i][k]==1)hundir2[i][k]=numero;
			}
		}
	}
	static void rellenarbarcoshundidos(){
		for(int i=0;i<8;i++){
			for(int k=0;k<8;k++){
				controlhundidos[i][k]=hundir[i][k];
				controlhundidosmaquina[i][k]=hundir2[i][k];
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  Escribe la funci�n HundirLaFlota que simula el cl�sico juego de hundir la flota pero en
versi�n solitario (para hacerlo m�s simple). Para guardar los datos del juego, usaremos
un array de 8x8 enteros que contendr� los datos de los barcos y las casillas ya
bombardeadas. En este array, colocaremos antes de jugar los barcos usando los
siguientes valores para cada casilla: [0]: Agua [1]: Barco. Podemos usar diferentes
valores (2, 3, etc.) para diferentes barcos; as� podremos saber si hemos hundido cada
barco o s�lo lo hemos tocado. [100]: Agua ya bombardeada. [101]: Barco ya
bombardeado. Una vez rellenada la matriz con valores 0 y 1 (y 2, 3, 4, etc., si queremos
marcar cada barco de manera independiente), le iremos pidiendo al jugador las
coordenadas que quiere bombardear, mostr�ndole el tablero despu�s de cada jugada.
Cuando el jugador elige una casilla, esa casilla se marca como bombardeada (se le suma
100) y se le muestra el resultado
 */		
		colocarbarcos();
		bombardeo();
		imprimir();
		
	}


/*
 * REalizamos un lanzamiento, si esta en agua sale que ha sido agua
 * 
 * 
*/
}