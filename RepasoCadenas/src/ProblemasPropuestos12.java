import java.util.Scanner;


public class ProblemasPropuestos12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * optar por un while y con una booleana
 */
		
		Scanner teclado=new Scanner(System.in);
		String palabraclave="javier";
		String palabrajugador="";
		System.out.println("Juego del ahorcado");
		
		
		
		int i=0;
			for(int conterror=1;conterror<=6;conterror++){
			System.out.println("Averigua la palabra:- - - - - -");
			palabrajugador=teclado.nextLine();
		if(palabraclave.charAt(i)==palabrajugador.charAt(0)){
			System.out.println(palabraclave.substring(0, i+1));
			i++;
			conterror--;
			if(i==6){
				System.out.println("Has ganado");
				conterror=10;
			}
		}else if(palabraclave.charAt(i)!=palabrajugador.charAt(0)){
			
			switch(conterror){
			case 1:
			System.out.println(" O ");
			break;
			case 2:
			System.out.println(" O ");
			System.out.println(" | ");
			break;
			case 3:
			System.out.println("_O");
			System.out.println(" | ");
			break;
			case 4:
			System.out.println("_O_");
			System.out.println(" | ");
			break;
			case 5:
			System.out.println("_O_");
			System.out.println(" | ");
			System.out.println("/ ");
			break;
			case 6:
			System.out.println("_O_");
			System.out.println(" | ");
			System.out.println("/ \\");
			break;
			}
			
		}
		}
	

}
}
