/*
 * 2. Realizar un programa que genera un numero de mes (de 1 a 12)
aleatoriamente y nos muestra solo el numero de dias que tiene ese mes. Para
Febrero utilizaremos 28 dias
 */


public class ProblemasPropuestos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A;
A=(int)(Math.random()*12+1);

if(A==1){
	System.out.println("El mes de enero tiene 31 dias");
}else if(A==2){
	System.out.println("El mes de febrero tiene 28 dias");
}else if(A==3){
	System.out.println("El mes de marzo tiene 31 dias");
}else if(A==4){
	System.out.println("El mes de abril tiene 30 dias");
}else if(A==5){
	System.out.println("El mes de mayo tiene 31 dias");
}else if(A==6){
	System.out.println("El mes de junio tiene 30 dias");
}else if(A==7){
	System.out.println("El mes de julio tiene 31 dias");
}else if(A==8){
	System.out.println("El mes de agosto tiene 31 dias");
}else if(A==9){
	System.out.println("El mes de septiembre tiene 30 dias");
}else if(A==10){
	System.out.println("El mes de octubre tiene 31 dias");
}else if(A==11){
	System.out.println("El mes de noviembre tiene 30 dias");
}else if(A==12){
	System.out.println("El mes de diciembre tiene 31 dias");
}
	}

}
