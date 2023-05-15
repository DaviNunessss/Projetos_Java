package info5r_02_2023;
import java.util.Scanner;

public class questao_10 {

	public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     
     System.out.println("Digite o valor da primeira medida: ");
     int num1 = in.nextInt();
     
     System.out.println("Digigte o valor da segunda medida: ");
     int num2 = in.nextInt();
     
     System.out.println("Digite o valor da terceira medida: ");
     int num3 = in.nextInt();
     
     System.out.println("Digigte o valor da quarta medida: ");
     int num4 = in.nextInt();
     
     System.out.println("Digite o valor da quinta medida: ");
     int num5 = in.nextInt();
     
     int soma = num1+num2+num3+num4+num5;
     System.out.println("O perimetro é: " +soma);
		
	 int multi = num1*num2;
	 System.out.println("A area é:" +multi);
	
	 
	 
		
		
		
		
		

	}

}
