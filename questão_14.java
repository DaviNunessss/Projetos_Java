package info5r_02_2023;
import java.util.Scanner;
public class questão_14 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("Quantas pessoas são ?");
		 int qtd= in.nextInt();		
		 int[]numeros= new int[qtd];
	     String [] nome =  new String [qtd];
	     int [] idade = new int [qtd];
	     for (int i = 0; i <numeros.length; i++) {
	    	 System.out.println("seu nome");
	    	 nome[i] = in.next();
	    	 System.out.println("qual sua idade");
	    	 idade[i] = in.nextInt();
	     }
	     for (int n = 0;n<numeros.length;n++) {
	    	 if (idade[n] < 18) {
	    		 System.out.println(" os menores de idade sao: " + nome[n] );
	    	 }
	     }
	}

}
 