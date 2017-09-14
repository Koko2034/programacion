import java.util.Scanner;

public class ProblemasPropuestos2 {

	static int[][] mat= new int[5][3];
	static String[] nombres=new String[5];
	static int contabilidad=0;
	static int[] ventas=new int[3];
	static String[]productos=new String[3];
	static int[] precio=new int[3]; // tengo que cargar los datos
	
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Escriba el nombre del vendedor");
			nombres[i]=teclado.nextLine();
		}
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				mat[i][j]=(int)(Math.random()*9+1);
			}
		}
		for(int i=0;i<productos.length;i++){
			System.out.println("Introduzca el nombre del producto");
			productos[i]=teclado.nextLine();
		}
		
		
		}
	
	static void calcular1(){
		int p1=6;
		int p2=9;
		int p3=15;
		for(int i=0;i<mat.length;i++){
			contabilidad=0;
			contabilidad=(mat[i][0]*p1)+(mat[i][1]*p2)+(mat[i][2]*p3);
			System.out.println("el vendedor numero " + i + " que se llama " + nombres[i] + " ha ganado " + contabilidad + " euros");
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
		System.out.println("El vendedor numero " + vendedor + " cuyo nombre es " + nombres[vendedor] + " ha vendido del producto"+(i) + (mat[vendedor][i]));
		}
		
	}
	static void calcular5(){
			
		
		for(int i=0;i<5;i++){
			ventas[i]=(mat[i][0]*6)+(mat[i][1]*9)+(mat[i][2]*15);
		}
		for(int k=0;k<ventas.length-1;k++) {
			for(int f=0;f<ventas.length-1-k;f++) {
			if (ventas[f]<ventas[f+1]) {
			int auxventas;
			auxventas=ventas[f];
			ventas[f]=ventas[f+1];
			ventas[f+1]=auxventas;
			String auxnombre;
			auxnombre=nombres[f];
			nombres[f]=nombres[f+1];
			nombres[f+1]=auxnombre;
			}
			}
			}
		for(int i=0;i<ventas.length;i++){
			ventas[i]=(int) (ventas[i]*0.4);
		if(ventas[i]<60) ventas[i]=(int)(ventas[i]*0.97);
		}
		ventas[0]=(int)(ventas[0]*1.1);
		
		for(int i=0;i<5;i++){
			System.out.println("Las ventas del vendendor " + nombres[i] + " es " + ventas[i] + " euros");
		}
	}
	static void calcular6(){
		int sumaproducto=0;
		for( int i=0;i<mat.length;i++){
			sumaproducto=sumaproducto+(mat[0][i]);
		
		}
		System.out.println("Las ventas del producto " +  productos[0] + " es " + sumaproducto);
		sumaproducto=0;
		for( int i=0;i<mat.length;i++){
			sumaproducto=sumaproducto+(mat[1][i]);
		
		}
		System.out.println("Las ventas del producto " +  productos[1] + " es " + sumaproducto);
		sumaproducto=0;
		for( int i=0;i<mat.length;i++){
			sumaproducto=sumaproducto+(mat[2][i]);
		
		}
		System.out.println("Las ventas del producto " +  productos[2] + " es " + sumaproducto);
		
		
		}
	static void calcular7(){
		
		int suma;
		for(int c=0;c<3;c++){
			suma=0;
		for(int f=0;f<mat.length;f++){
		precio[c]+=mat[c][f];	
				
			}
		if(suma<5)System.out.println(" el producto " + productos[c] + " se han vendido menos de 5 unidades en total siendo las ventas" + suma);
		
			
		}
	}
	static void calcular8(){
		boolean control=true;
		int mayor=0;
		int menor=0;
		int productomas=0;
		int productomenos=0;
		for(int i=0;i<5;i++){
		if(control){control=false;mayor=precio[i];menor=precio[i];productomas=i;productomenos=i;}
		else{if(precio[i]>mayor){mayor=precio[i];productomas=i;}
		else if(precio[i]<menor){menor=precio[i];productomenos=i;}}
			
		}
		System.out.println("El producto mas vendido es " + productos[productomas] + " con un valor de " + mayor);
		System.out.println("El producto menos vendido es " + productos[productomenos] + " con un valor de " + menor);
			
	}
			
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
/*
 * 2. Con los datos anteriores y además un vector con los nombres de los 3
productos y otro con los nombres de los 10 vendedores; sabiendo que los
vendedores cobran un 40 % de las ventas que realizan y al vendedor con mayor
número de productos vendidos se le da un 10 % como incentivo y a cada
vendedor que venda menos de 60 € se le quitará un 3% de sus ventas
Se pide :
a) Cuanto ha ganado cada vendedor en un listado ordenado
alfabéticamente.
b) Cuanto se ha vendido de cada producto.
c) Visualizar sí hay algún producto del que se ha vendido menos de 5
unidades en total.
d) Producto del que ha vendido más y menos cada vendedor.
e) Ventas medias de cada producto en €
 */
		iniciar();
		calcular1();
		calcular2();
		calcular3();
		//calcular4();
		calcular5();
		calcular6();
		calcular7();
		calcular8();
		/*
		 * parte A lo tenemos en calcular5
		 * parte B lo tnemos en calcular6
		 * parte C lo tenemosen calcular7
		 * parte d
		 */
		
	}

}
