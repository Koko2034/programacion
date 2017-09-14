
public class EjerciciosVariados {

	public static int BinarioDecimal(int num){
		int decimal=0;
		String numero="";
		numero=String.valueOf(num);
		
		for(int i=0;i<numero.length();i++){
			char letra=numero.charAt((numero.length()-1-i));
			int posicion = Integer.parseInt(""+letra);
		decimal+=(posicion*(Math.pow(2,i)));	
		}
		
		return decimal;
	}
	public static int DecimalBinario(int num,int bits){
		String binario="";
		int control=(int)Math.pow(2,bits);
		while(control>=1){
			
			if(num>=control){
				num=num-control;
				binario+="1";
			}else{
				binario+="0";
			}
			control=control/2;
		}
		int numbinario = Integer.parseInt(binario);
		return numbinario;
	}
	public static int BinarioOctal(int num){
		String octal= "";
		String aux="";
		String numero=String.valueOf(num);
		boolean control = true;
		
		while(control){
			int multiplicador=1;
			int totalauxiliar=0;
		if(numero.length()>3){
			aux=numero.substring(numero.length()-4, numero.length()-1);
		}else{
			aux=numero;
			control=false;
		}
		for(int i=aux.length();i>=0;i--){
			char letra = aux.charAt(i);
			int numaux = Integer.parseInt(""+letra);
			totalauxiliar+=(numaux*multiplicador);
			multiplicador+=multiplicador;
		}
		String Cont =String.valueOf(totalauxiliar);
		octal += Cont;
		
		
		}
		int numoctal = Integer.parseInt(octal);
		return numoctal;
	}
	public static int BinarioHexadecimal(int num){
		String hexadecimal="";
		String aux="";
		String numero=String.valueOf(num);
		boolean control = true;
		while(control){
			int multiplicador=1;
			int totalauxiliar=0;
			if(numero.length()>4){
				aux = numero.substring(numero.length()-4, numero.length()-1);
			}else {
				aux=numero;
				control=false;
			}
			for ( int i=aux.length();i>=0;i--){
				char letra = aux.charAt(i);
				int numaux= Integer.parseInt("" + letra );
				totalauxiliar +=(numaux * multiplicador);
				multiplicador+=multiplicador;
			}
			String Cont = String.valueOf(totalauxiliar);
			switch(Cont){
			case "10": Cont = "A";
			break;
			case "11": Cont = "B";;
			break;
			case "12": Cont = "C";;
			break;
			case "13": Cont = "D";;
			break;
			case "14": Cont = "E";;
			break;
			case "15": Cont = "F";;
			break;
			
			}
			hexadecimal += hexadecimal;
		}
		int numhexadecimal = Integer.parseInt(hexadecimal);
		return numhexadecimal;
	}
}
