
public class ProblemasPropuestos3 {

	static int[][] mat= new int[40][5];
	static int[] media= new int[5];
	static int[] mediaalum= new int[40];
	static void iniciar(){
		
			System.out.println("Generamos la nota del alumno");
			for(int i=0;i<5;i++){
				for(int j=0;j<40;j++){
			mat[j][i]=(int)(Math.random()*10);
					
				}
			}
			}
	static void mediaasig(){
		System.out.println("Generamos la nota media por clase de cada asignatura");
		for(int i=0;i<5;i++){
			for(int j=0;j<40;j++){
		media[i]=media[i]+mat[j][i];
				
			}
			
		}
		for(int j=0;j<5;j++){
			media[j]=media[j]/40;
		}
		
	}
	
	static void medialumn(){
		System.out.println("Generamos la nota media por clase de cada asignatura");
		for(int i=0;i<40;i++){
			for(int j=0;j<5;j++){
		mediaalum[i]=mediaalum[i]+mat[i][j];
				
			}
			
		}
		for(int j=0;j<40;j++){
			mediaalum[j]=mediaalum[j]/5;
		}
		
	}
	
	static void imprimir(){
		for(int i=0;i<40;i++){
			for(int j=0;j<5;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();}
		
		for(int i =0;i<5;i++){
		System.out.println("La nota media por la asignatura " + (i+1) + " es " + media[i]);
		}
		
	for( int i=0;i<40;i++){
		System.out.println(" La nota media por alumno es " + (i+1) + " es " + mediaalum[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 3. Se dispone de una tabla con las notas de cada una de las 5 asignaturas que
tiene cada uno de los 40 alumnos de una clase.
Obtener :
a) La medía de cada asignatura.
b) La nota final de cada alumno.
 */
		
		iniciar();
		mediaasig();
		medialumn();
		imprimir();
	}

}
