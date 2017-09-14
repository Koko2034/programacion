/*
 * 3. Realiza un programa que genera tres números aleatorios entre 1 y 50 y dice
por pantalla si alguno de ellos es múltiplo de tres
 */
public class ProblemasPropuestos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A;
int B;
int C;

A=(int)(Math.random()*(50+5));
B=(int)(Math.random()*(50+5));
C=(int)(Math.random()*(50+5));
if(A%3==0){
	System.out.println("El primer numero generado " + A + " es multiplo de 3");
}if(B%3==0){
	System.out.println("El segundo numero generado " + B + " es multiplo de 3");
}if(C%3==0){
	System.out.println("El tercer numero generado " + C + " es multiplo de 3");
}
	}

}
