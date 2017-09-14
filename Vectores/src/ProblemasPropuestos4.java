
public class ProblemasPropuestos4 {

	static void introducir(int[]s){
		for(int f=0;f<10;f++){
		s[f]=(int)(Math.random()*100+1);
		System.out.println(s[f]);}
		System.out.println("Se han generado los 10 numeros de forma aleatoria");
	}
	static void parimpar(int[]s){
		int suma=0;
		int impar=1;
		for(int f=0;f<10;f++){
			if(s[f]%2==0){
				suma=suma+s[f];
			}else{impar=impar*s[f];
			System.out.println(impar);}
		}
		System.out.println("La suma de todos los valores pares es "+ suma);
		System.out.println("El producto de todos los valores impares es " + impar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4. Haz un programa que introduzca 10 números en un vector y calcule la suma de los
números almacenados en índice par y el producto de los almacenados en índice impar
 */
		int[]numeros=new int[10];
	introducir(numeros);
	parimpar(numeros);
	}

}
