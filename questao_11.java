package info5r_02_2023;
import java.util.Scanner;
import Entidade.Produto;
public class questao_11 {

	public static void main(String[] args) {
   		Scanner in = new Scanner(System.in);
   		
		System.out.println("Digite as informações do produto");
		System.out.println("Nome");
		String nome = in.next();
		System.out.println("Preço: ");
		Double preço = in.nextDouble();
		//System.out.println("Quantidade: ");
		//prod.quantidade = in.nextInt();
		
		Produto prod = new Produto(nome,preço);
		System.out.println("Digite uma quantidade a ser adicionada: ");
		int quant = in.nextInt();
        prod.AddProduto(quant);
        System.out.println("Informações atualizadas: " + prod.getNome +
        		            " Quantidade: " + prod.quantidade +
        		            " Valor total: " + prod.preço);
        System.out.println("Digite uma quantidade a ser removida: ");
		quant = in.nextInt();
        prod.AddProduto(quant);
		System.out.println("Informações atualizadas: " + prod.setNome +
				            " Quantidade: " + prod.quantidade +
				            " Valor total: "+ prod.ValorTotal());
		
		in.close();
		
		
		

	}

}
