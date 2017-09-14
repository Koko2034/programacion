import java.util.Scanner;

public class InsercionNombres {
	static String nombres[]=new String[10];
	static String nombre;
	static int contador;

	static void iniciar(){
		nombres[0]="pepe";
		nombres[1]="jose";
		nombres[2]="miguel";
		nombres[3]="ramses";
		nombres[4]="ismael";
		nombres[5]="javier";
		nombres[6]="rodolfo";
	}
	
	static void ordenar(){
		for(int i=0;i<7;i++){
			for(int k=0;k<7-1-i;k++){
				if(nombres[k].compareTo(nombres[k+1])>0){
					String aux;
					aux=nombres[k];
					nombres[k]=nombres[k+1];
					nombres[k+1]=aux;
				}
			}
		}
	}
	
	static void introducirnombre(){
		
		Scanner teclado=new Scanner(System.in);
		
		contador=0;
		while(contador<3){
		System.out.println("Introduce un nombre");
		nombre=teclado.nextLine();
		
		colocarnombre();
		contador++;
		for(int r=0;r<7+contador;r++)System.out.println(nombres[r]);
		}
		}
	static void colocarnombre(){
		
		int introducido;
		int nombrado;
		int i=0;
		int nombrado2;
		int contadorletra=0;
		boolean controltotal=true;
		System.out.println(contador);
		while(i<=6+contador && controltotal){
			contadorletra=0;
			if(i==contador+6){nombres[contador+6+1]=nombre;
			}else {
			nombrado=(int)nombres[i].charAt(contadorletra);
			
			nombrado2=(int)nombres[i+1].charAt(contadorletra);
			
			introducido=(int)nombre.charAt(contadorletra);
			
			while(introducido==nombrado){
				contadorletra++;
				nombrado=(int)nombres[i].charAt(0+contadorletra);
				nombrado2=(int)nombres[i+1].charAt(contadorletra);
				introducido=(int)nombre.charAt(0+contadorletra);
				}
			if(introducido>nombrado && nombrado2>introducido){
				
				for(int h=0;h<6+contador-i;h++)
				nombres[contador+6+1-h]=nombres[contador+6-h];
				nombres[i]=nombre;
				controltotal=false;
				}
			
			
			i++;
				
			}
		} for(int p=0;p<nombres.length;p++)System.out.println(nombres[p]);
		}
		
	
	static void imprimir(){
		for(int i=0;i<7;i++)System.out.println(nombres[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		iniciar();
		ordenar();
		imprimir();
		introducirnombre();
}
}