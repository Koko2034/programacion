
public class ProblemasPropuestos2 {

	static int[]numeros1=new int[4];
	static int[]numeros2=new int[4];
	static int[]resultado=new int[4];
	static void iniciar(){
		for(int i=0;i<4;i++){
			numeros1[i]=(int)(Math.random()*10+0);
			numeros2[i]=(int)(Math.random()*10+0);
		}
		
	}
	static void sumar(){
		for(int i=0;i<numeros1.length;i++)resultado[i]=numeros1[i]+numeros2[i];
	}
	static void imprimir(){
		for(int i=0;i<resultado.length;i++)System.out.print(numeros1[i]);
		System.out.println();
		for(int i=0;i<resultado.length;i++)System.out.print(numeros2[i]);
		System.out.println();
		for(int i=0;i<resultado.length;i++)System.out.print(resultado[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 2.-Realizar un programa que pida la carga de dos vectores numéricos enteros de 4
elementos. Obtener la suma de los dos vectores, dicho resultado guardarlo en un
tercer vector del mismo tamaño. Sumar componente a componente.

 */
		
		iniciar();
		sumar();
		imprimir();
	}

}
