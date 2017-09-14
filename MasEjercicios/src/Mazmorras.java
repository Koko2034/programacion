public class Mazmorras {static int[]mazmorras=new int[50];static void iniciar(){
for(int i=0;i<mazmorras.length;i++){for(int j=0;j<mazmorras.length;j++){if((j+1)%(i+1)==0){if(mazmorras[i]==0){mazmorras[i]=1;}else mazmorras[i]=0;}}}}
static void imprimir(){for(int i=0;i<mazmorras.length;i++){if(mazmorras[i]==1)System.out.println("La mazmorra numero " + (i+1)+ " esta abierta.");}}
public static void main(String[] args) {iniciar();imprimir();}}
