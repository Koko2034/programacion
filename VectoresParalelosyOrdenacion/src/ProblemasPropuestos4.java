import java.util.Scanner;

public class ProblemasPropuestos4 {

	static int[]habitantes=new int[5];
	static String[]pais=new String[5];
	
static void iniciar(){
	Scanner teclado=new Scanner(System.in);
	for(int i=0;i<pais.length;i++){
	System.out.println("introduzca el nombre del pais");
	pais[i]=teclado.nextLine();
	habitantes[i]=(int)(Math.random()*100+0);
	}
}	
static void ordenar(){
	int mayor=habitantes[0];
	int pos=0;
	String paismayor=pais[0];
	for(int k=0;k<habitantes.length-1;k++) {
		for(int f=0;f< habitantes.length-1-k;f++) {
		if (habitantes[f]>habitantes[f+1]) {
		int aux;
		aux=habitantes[f];
		habitantes[f]=habitantes[f+1];
		habitantes[f+1]=aux;
		String axu;
		axu=pais[f];
		pais[f]=pais[f+1];
		pais[f+1]=axu;
		}
		}
		}
		}

static void imprimir(){
	for(int i=0;i<pais.length;i++)
	System.out.println("El " + pais[i] + " tiene " + habitantes[i] + " habitantes ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 4.-Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad
de habitantes del mismo. Ordenar alfabéticamente e imprimir los resultados. Por
último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e
imprimir nuevamente.
		 */
	iniciar();
	ordenar();
	imprimir();
	
	}

}
