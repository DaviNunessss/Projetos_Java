package info5r_02_2023;
import java.util.Scanner;
public class questao_13 {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.println("Seja bem vindo ao caixa 24 horas!");
	
System.out.println("Digite o valor do seu saque!");
int num1 = in.nextInt();		
System.out.println("Dejesa adicionar mais alguma coisa ao valor inicial?");
int num2 = in.nextInt();
int soma = num1+num2;	
System.out.println("Saque concluido! O valor total do saque foi: R$" + soma);

System.out.println("Tenha um bom dia!");
	}

}


