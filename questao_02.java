package info5r_02_2023;
import java.util.Scanner;
public class questao_02 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Quantas pessoas voce quer informar ?");
    int qtdPessoas = scan.nextInt();
    String nome[] = new String[qtdPessoas];
    int idade[] = new int[qtdPessoas];
    
    for(int x = 0; x < idade.lenght;x++) {
 	   System.out.println("Qual o nome da pessoa" + (x +1));
 	   nome[x] = scan.next();
 	   System.out.println("Qual o nome da pessoa" + (x +1));
 	   idade[x] = scan.next()
 	   
 	 }
    for(int x = 0; x < idade.lenght;x++) {
 	   if (idade[x] > 18) {
 		   System.out.println(nome[x]);
 		   
 	   }
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
