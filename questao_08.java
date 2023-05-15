package info5r_02_2023;
import java.util.Scanner;
public class questao_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do triangulo A: ");
		int a = in.nextInt();
		
		System.out.println("Digite o valor do triangulo B: ");
		int b = in.nextInt();
		
		System.out.println("Digite o valor do triangulo C: ");
		int c = in.nextInt();
		
		if (a < b | a < c);{
		System.out.printf("Este é o menor deles: %d\n" , a);
		}
		
		if (a > b | a > c);{
		System.out.printf("Este é o maoir deles: %d\n" , a);
		}
		
		if (b < a | b < c);{
		System.out.printf("Este é o menor deles: %d\n" , b);	
		}
		
		if (b > a | b > c);{
		System.out.printf("Este é o maior deles: %d\n" , b);	
		}
		
		if (c < a | c < b);{
		System.out.printf("Este é o menor deles: %d\n" , c);	
		}

		if (c > a | c > b);{
		System.out.printf("Este é o menor deles: %d\n" , c);	
		}

		
		
		
		
		
		
		
		

	}

}
