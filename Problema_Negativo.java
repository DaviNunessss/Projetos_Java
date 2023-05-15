package info5r_02_2023;
import java.util.Scanner;
public class Problema_Negativo {

	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
				
	 System.out.println("Quantos números você vai digitar?");
	 int qtd= in.nextInt();		
	 int[]numeros= new int[qtd];
				
	 for( int i = 0; i<numeros.length; i++) {
		 System.out.println("Digite um número: " + (i +1)+":");
		 numeros[1] = in.nextInt();
	 }
	 
	 for(int x : numeros) {
		 if (x < 0) {
			 System.out.println("Os números negativos são:" + x);
		 }
	 }

	
	}

				

}

