

public class MostrarPrimos1_1000 {

	public static void iniciar(){
		
		for(int i=1;i<=10000;i++){
		if(Matematicas.Varias.esPrimo(i)){
			System.out.println("El numero " + i + " es un numero primo ");
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iniciar();
	}

}
