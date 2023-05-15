package info5r_02_2023;
import java.util.Scanner;
public class questao_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = scan.nextInt();
		int fatorial = 1;
		for(int x = numero; x > 0; x-- ) {
			fatorial = fatorial * numero;
		}
		System.out.println("O fatorial de" + numero + "é:" + fatorial);
		
		scan.close();	
		

	}

}
