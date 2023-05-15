package info5r_02_2023;
import java.util.Scanner;

import Entidade.Nota;
public class questao_12_Nota {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Nota nota = new Nota();
		
	System.out.println("Qual o seu nome ? ");
	nota.setNome(in.next());
	System.out.println("Digite as notas dos tres primeiros bimestres: ");
	nota.n1 = in.nextDouble();
	nota.n2 = in.nextDouble();
	nota.n3 = in.nextDouble();
		
	if(nota.CalcMedia() > 60) {
		System.out.println("Voce foi aprovado!");
	}else {
		System.out.println("Voce foi reprovado, faltou" + nota.CalcAprovacao() + "pontos");
		                   
	}
		
		
		
		
		
		
		
		
		
		
		
		
	
	in.close();
	}

}
