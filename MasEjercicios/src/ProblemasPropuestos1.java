import java.util.Scanner;

public class ProblemasPropuestos1 {

	static int[][] mat= new int[5][3];
	static String[] nombres=new String[5];
	static int contabilidad=0;
	static int[] ventas=new int[3];
	
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Escriba el nombre del primer vendedor");
			nombres[i]=teclado.nextLine();
		}
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				mat[i][j]=(int)(Math.random()*9+1);
			}
		}
	}
	static void calcular1(){
		int p1=6;
		int p2=9;
		int p3=15;
		for(int i=0;i<mat.length;i++){
			contabilidad=0;
			contabilidad=(mat[i][0]*p1)+(mat[i][1]*p2)+(mat[i][2]*p3);
			System.out.println("el vendedor numero " + i + " que se llama " + nombres[i] + " ha ganado " + contabilidad);
		}
		
	}
	static void calcular2(){
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				contabilidad=0;
				contabilidad+=mat[j][i];
				ventas[i]=contabilidad;
			}
		}
		System.out.println(" El producto 1 se ha vendido " + (ventas[0]*6) + " en total ");
		System.out.println(" El producto 2 se ha vendido " + (ventas[1]*9) + " en total ");
		System.out.println(" El producto 3 se ha vendido " + ( ventas[2]*15) + " en total ");
	}
	static void calcular3(){
		boolean control=true;
		int mayor=0;
		int controlventas=0;
		for(int i=0;i<3;i++){
			if(control){ control=false;mayor=ventas[i];controlventas=i;}
			else{if(ventas[i]>mayor) {mayor=ventas[i];controlventas=i;}}
		}
		System.out.println("El producto numero " + controlventas + " es el de mayor ventas con un total de " + ventas[controlventas]);
	}
	static void calcular4(){
		Scanner teclado=new Scanner(System.in);
		int vendedor=0;
		
		do{
		System.out.println("Introduzca un numero de vendedor");
		vendedor=teclado.nextInt();
		
		}while(vendedor<0 && vendedor>5);
		for(int i=0;i<3;i++){
		System.out.println("El vendedor numero " + vendedor + " cuyo nombre es " + nombres[vendedor] + " ha vendido del producto"+(i+1) + (mat[vendedor][i]));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.-Se dispone de una tabla de dimensión 10 x 3 cuyo elemento genérico es V(I,J)
correspondiente a las ventas realizadas por el vendedor I, del producto J. Se
sabe el precio de cada producto es:
Producto 1 --- 6 €.
Producto 2 --- 9 €
Producto 3 --- 15 €
Se pide
a) Cuanto ha ganado cada vendedor.
b) Cuanto se ha vendido de cada producto.
c) De que producto se ha vendido más.
d) Visualizar el total de ventas de un vendedor cuyo número de
vendedor se introducirá por teclado.
 */
		iniciar();
		calcular1();
		calcular2();
		calcular3();
		calcular4();
		
	}

}
