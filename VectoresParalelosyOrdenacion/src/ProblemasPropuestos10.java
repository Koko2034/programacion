import java.util.Scanner;

public class ProblemasPropuestos10 {
	
	static int[]edad=new int[11];
	static String[]nombre={"luis","anabel","javier","perico", "zuribi","manuel", "rodolfo", "jose" , "pepe", "ataulfo", "eustaquio"};
	static void iniciar(){
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Generamos los nombres");
		

		System.out.println("Generamos las edades");
		for(int i=0;i<edad.length;i++){
	edad[i]=(int)(Math.random()*50);
}
	
	}
	static void opcion1(){
		for(int i=0;i<nombre.length;i++){
			char cont=nombre[i].charAt(0);
			if(cont=='a' || cont=='m'){
				if(edad[i]>18)
				System.out.println("el nombre es " + nombre[i] + " y su edad es " + edad[i]);
			}
		}
	}
	static void opcion2(){
		for(int k=0;k<edad.length-1;k++) {
			for(int f=0;f<edad.length-1-k;f++) {
			if (edad[f]>edad[f+1]) {
			int auxedad;
			auxedad=edad[f];
			edad[f]=edad[f+1];
			edad[f+1]=auxedad;
			String auxnombre;
			auxnombre=nombre[f];
			nombre[f]=nombre[f+1];
			nombre[f+1]=auxnombre;
			}
			}		
	} 
		for(int h=0;h<edad.length;h++){
		if(edad[h]<18)
			System.out.println("la edad de " + nombre[h] + " es " + edad[h]);
		
	}
	}
	static void opcion3(){
		for(int k=0;k<edad.length-1;k++) {
			for(int f=0;f<edad.length-1-k;f++) {
			if (edad[f]<edad[f+1]) {
			int auxedad;
			auxedad=edad[f];
			edad[f]=edad[f+1];
			edad[f+1]=auxedad;
			String auxnombre;
			auxnombre=nombre[f];
			nombre[f]=nombre[f+1];
			nombre[f+1]=auxnombre;
			}
			}		
	} System.out.println(nombre[0]);
	}
	static void opcion4(){
		
		for(int i=0;i<nombre.length;i++){
			if(nombre[i].equalsIgnoreCase("luis"))
				System.out.println("Existe un luis y su edad es " + edad[i]);
		}
		}
	
	static void opcion5(){
		System.out.println("La edad de " + nombre[3] + " es " + edad[3]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 10.- Crea una lista de 25 nombres (char 30) con sus respectivas edades (int)
seguidamente realiza las siguientes operaciones:
a. indica cuantos nombres empezaban por 'a' o 'm' y pertenecían a
alguien mayor de edad.
b. saca una lista de nombres ordenada por edad de menor a mayor
teniendo en cuenta solo los menores de edad.
c. nombre de la persona de mayor edad.
d. alguien se llama 'luis'.
e. nombre y edad de los datos introducidos en la posición 12ª.
		 */
		iniciar();
		boolean control=true;
		do{Scanner teclado=new Scanner(System.in);
		int opcion=0;
		System.out.println("Menu:");
		System.out.println("1.Nombre que empiezan por a o m");
		System.out.println("2.Lista de nombres ordenada por edad de menor a mayor teniendo en cuenta solo los menores de edad");
		System.out.println("3.nombre de la persona de mayor edad");
		System.out.println("4.Alguien se llama luis?");
		System.out.println("5.nombre y edad de los datos introducidos en la posicion 3");
		System.out.println("6.Salir");
		opcion=teclado.nextInt();
		switch(opcion){
		case 1: opcion1();
		break;
		case 2: opcion2();
		break;
		case 3: opcion3();
		break;
		case 4: opcion4();
		break;
		case 5: opcion5();
		break;
		case 6: control=false;
		break;
		default: System.out.println("Opcion erronea, vuelva a elegir"); 
		}}while(control);
		
	}

}
