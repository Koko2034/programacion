
public class ProblemasPropuestos3 {

	static int[]claseA=new int[5];
	static int[]claseB=new int[5];
	static int claseApromedio=0;
	static int claseBpromedio=0;
	static void iniciar(){
		
		for(int i=0;i<claseA.length;i++){
			claseA[i]=(int)(Math.random()*10+0);
			claseB[i]=(int)(Math.random()*10+0);
		}
	}
	static void calcular(){
		
		for(int i=0;i<claseA.length;i++){
			claseApromedio+=claseA[i];
		}
		claseApromedio=claseApromedio/claseA.length;
		for(int i=0;i<claseB.length;i++){
			claseBpromedio+=claseB[i];
		}
		claseBpromedio=claseBpromedio/claseA.length;
		
	}
	static void impresioncontrol(){
		for(int i=0;i<claseA.length;i++){
			System.out.print(claseA[i]);
		}
		System.out.println();
		for(int i=0;i<claseB.length;i++){
			System.out.print(claseB[i]);
		}
		System.out.println();
	}
	static void imprimir(){
		if(claseApromedio>claseBpromedio)System.out.println("La clase A tiene un mayor promedio de notas siendo " + claseApromedio);
	else System.out.println("La clase B tiene un mayor promedio de notas siendo " + claseBpromedio);; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3.-Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso A y el
curso B, cada curso cuenta con 5 alumnos.
Realizar un programa que muestre el curso que obtuvo el mayor promedio general.

 */
		iniciar();
		calcular();
		impresioncontrol();
		imprimir();
		
		
	}

}
