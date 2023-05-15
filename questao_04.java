package info5r_02_2023;
import java.util.Scanner;
public class questao_04 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite um numero");
		int num = scan.next();
		int num1 = Integer.parseInt(num);
		if (num1 > 0) {
		System.out.println("Numero positivo");
		
		}else {
			System.out.println("Numero negativo");
		}
		
		scan.close();	

	}

}
