package info5r_02_2023;
import java.util.Scanner;
public class questao_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");
        int numero = scan.nextInt();
        System.out.println("Os divisores de" + numero);
        for(int x = 1; x <= numero; x++ ) {
        	if (numero % x == 0) {
        		System.out.println(x);
        	}
        }

	}

}
