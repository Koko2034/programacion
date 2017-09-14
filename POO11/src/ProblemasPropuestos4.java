import java.util.Scanner;

public class ProblemasPropuestos4 {
	
private int templeado,salario;

public void inicializar(){
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Introduce el tipo de empleado");
	System.out.println("1-Clase A");
	System.out.println("2-Clase B");
	templeado=teclado.nextInt();
}
public void calcular(){
	if(templeado==1) salario=1500;
	else if(templeado==2) salario=1000;
}
public void imprimir(){
	System.out.println("El sueldo es " + salario);
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		char respuesta='s';
		for(int i=0;i<1;i++){
			System.out.println("Desea continuar");
		respuesta=teclado.next().charAt(0);
		if(respuesta=='s')i--;
		ProblemasPropuestos4 empleado=new ProblemasPropuestos4();
		empleado.inicializar();
		empleado.calcular();
		empleado.imprimir();
		
				}
		
	}

}
