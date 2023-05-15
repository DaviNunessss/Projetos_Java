package info5r_02_2023;
import java.util.Scanner;

import Entidade.Nota;
public class Problema_Soma_de_vetor {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Nota nota = new Nota();
		nota.setNome(in.next());
		 System.out.println("Quantos números você vai digitar?");
		 int qtd= in.nextInt();		
		 int[]numeros= new int[qtd];
		 
		 for( int i = 0; i<numeros.length; i++) {
			 System.out.println("Digite um número: " + (i +1)+":");
			 numeros[1] = in.nextInt();
		 }
					
		 nota.n1 = in.nextDouble();
			nota.n2 = in.nextDouble();
			nota.n3 = in.nextDouble();
		 System.out.println("A soma é");
		 
	}

}
