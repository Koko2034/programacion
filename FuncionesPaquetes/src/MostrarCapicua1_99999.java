

public class MostrarCapicua1_99999 {

	public static void iniciar(){
		for(int i=1;i<=99999;i++){
			
			if(Matematicas.Varias.esCapicua(i)){
				System.out.println("El numero "+ i + " es capicuo");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iniciar();
	}

}
