
public class ProblemasPropuestos14 {

	 static int[]botellas=new int[100];
	static int contador=0;
	static void iniciliazar(){
		for(int i=0;i<49;i++){
			int j=(int)(Math.random()*100+0);
		botellas[j]=1;
		}
		
	}
	static void contar(){
		for(int i=0;i<100;i++){
			if(botellas[i]==1)contador++;
		}
		System.out.println("El numero de botellas afectadas es "+  contador);
		System.out.println("El numero de botellas fabricadas es " + (100-contador));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 14.-En la pasta de vidrio para la fabricaci�n de 100 botellas, hay 50 part�culas de
impurezas que se distribuyen al azar durante el proceso de fabricaci�n, si una
botella resulta con una o m�s part�culas se considera defectuosa, Calcula el
n�mero de botellas que resultaron aceptadas en el proceso de fabricaci�n.
 */
		iniciliazar();
		contar();
	}

}
