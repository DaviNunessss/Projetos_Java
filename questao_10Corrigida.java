package info5r_02_2023;
import java.util.Scanner;
public class questao_10Corrigida {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("== Progama para calcular a meida da area ==");
		System.out.println("Digite a medida da base");
		ret.base = ler.nextDouble();
		System.out.println("Digite a medida da altura");
		ret.altura = ler.nextDouble();
		double area = ret.CalcArea();
		double perimetro = ret.CalcPerimetro();
		double diagonal = Math.sqrt(perimetro);
		System.out.println("A medida da area é: "+area);
		System.out.println("A medida do perimetro é: "+perimetro);
		System.out.println("A medida da diagonal é: "+ diagonal);
			
		

	}

}
