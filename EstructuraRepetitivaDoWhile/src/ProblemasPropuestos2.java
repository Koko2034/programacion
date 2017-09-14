/*
 * En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada
cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de datos
debe finalizar al ingresar un valor negativo en el número de cuenta.
Se pide confeccionar un programa que lea los datos de las cuentas corrientes e
informe:
a)De cada cuenta: número de cuenta y estado de la cuenta según su
saldo, sabiendo que el estado de la cuenta es:
'Acreedor' si el saldo es >0.
'Deudor' si el saldo es <0.
'Nulo' si el saldo es =0.
b) La suma total de los saldos acreedores
 */

import java.util.Scanner;

public class ProblemasPropuestos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int A=0;//Saldo de la cuenta
	int B=0; // numero de cuenta
	int C=0;//Suma de acreedores
	Scanner teclado=new Scanner(System.in);
	
	do{
	System.out.println("Introduzca un valor de numero de cuenta");
	B=teclado.nextInt();
	System.out.println("Introduzca el saldo de la cuenta anterior");
	A=teclado.nextInt();
	if(A<0){C=C+A;}
		if(A>0) {System.out.println("El cliente es deudor");}
		else if(A<0) {System.out.println("El cliente es acreedor");}
		else if(A==0){System.out.println("El cliente es nulo");}
	
	}while(B>0);
	
	System.out.println("El saldo total de los acreedores es "+ C);
	
	
}
}
