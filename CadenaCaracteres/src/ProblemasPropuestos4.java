/*
 * 4. Realizar un programa que genera aleatoriamente un numero del 1 al 7 y nos
muestra en pantalla el dia de la semana siendo 1 lunes, 2 martes y asi
sucesivamente
 */
public class ProblemasPropuestos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A;

A=(int)(Math.random()*(7+1));
if(A==1){
	System.out.println("El dia de la semana es lunes");
}else if(A==2){
	System.out.println("El dia de la semana es martes");
}else if(A==3){
	System.out.println("El dia de la semana es miercoles");
}else if(A==4){
	System.out.println("El dia de la semana es jueves");
}else if(A==5){
	System.out.println("El dia de la semana es viernes");
}else if(A==6){
	System.out.println("El dia de la semana es sabado");
}else if(A==7){
	System.out.println("El dia de la semana es domingo");
}}}
