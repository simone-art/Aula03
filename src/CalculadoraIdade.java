import java.util.Scanner;

public class CalculadoraIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crie um programa que calcula e mostra a sua idade
		
		System.out.println("Programa que calcula a idade");
		
		Scanner leitor = new Scanner(System.in);
	    System.out.println("Digite o seu ano de nascimento: ");
	    int anoNascimento;
	    int anoAtual = 2021;
	    
	    anoNascimento = leitor.nextInt();
	    int idade = anoAtual -anoNascimento;
	    
	    System.out.println("Você tem : " + idade + " anos");
	    leitor.close();

	}

}
