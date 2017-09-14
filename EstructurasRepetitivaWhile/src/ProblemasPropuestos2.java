/*
 * 2. Simular el lanzamiento de una moneda al aire, el programa termina cuando salen 3
caras seguidas. Al final interesa saber el número de tiradas, de caras y de cruces.
 */
public class ProblemasPropuestos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A;//nº tirada
		int B;//Numero de caras
		int C; //Numero de cruces
		int D; // Tirada
/*
 *tomamos como cara=1 y cruz=2 
 */
		A=0;
		B=0;
		C=0;
		
		
		
		while(B<3){
			D=(int)(Math.random()*2+1);
			A=A+1;
			System.out.println("El resultado de la tirada es " + D);
				if(D==1){B=B+1;}
					else{B=0;C=C+1;}		  
		}
		

		System.out.println("El numero de tiradas es " + A);
		System.out.println("El numero de tiradas con resultado Cruz son " + C);
		System.out.println("El numero de tiradas con resultado Cara son "+ (A-C));
		
		
	}

}
