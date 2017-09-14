import java.util.Scanner;

public class ProblemasPropuestos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		String A;
		System.out.println("Introduzca una frase por teclado");
		A=teclado.nextLine();
		System.out.println("Introduce la palabra a eliminar");
		String pclave;
		pclave=teclado.nextLine();
		int longitudcad=A.length();
		int longitudpclave=0;
		longitudpclave=pclave.length();
		int pos;
		pos=A.indexOf(pclave);
		String corte1;
		String corte2;
		corte1=A.substring(0, pos);
		corte2=A.substring((pos+longitudpclave),longitudcad);
		System.out.println("nuestra nueva frase es: "+ corte1 + corte2);
		
	}

}
