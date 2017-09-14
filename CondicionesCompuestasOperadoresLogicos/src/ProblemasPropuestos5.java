/*
 * 5. Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir dos valores enteros x e y (distintos a cero). Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
 */
import  java.util.Scanner;

public class ProblemasPropuestos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado= new Scanner(System.in);
int X,Y;

System.out.println("Introduzca la coordenada X");
X=teclado.nextInt();
System.out.println("Introduzca la coordenada Y");
Y=teclado.nextInt();
if (X>0 && Y>0){
	System.out.println("La coordenada (" + X+","+Y+") esta en el 1º cuadrante");
}else if(X<0 && Y>0){
	System.out.println("La coordenada (" + X+","+Y+") esta en el 2º cuadrante");
}else if(X<0 && Y<0){
	System.out.println("La coordenada (" + X+","+Y+") esta en el 3º cuadrante");
}else if(X>0 && Y<0){
	System.out.println("La coordenada (" + X+","+Y+") esta en el 4º cuadrante");
}
	}

}