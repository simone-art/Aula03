import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		//Programa onde o usuário digita dos números inteiros
		//Sem definir uma terceira variável, troque os valores de A e B entre si
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		System.out.print("Por favor, digite o primeiro número: ");
		
		numero1 = leitor.nextInt();
		
		int numero2;
		System.out.print("Por favor, digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		numero1 = numero2;
		numero2 =numero1;
		
		System.out.println("O valor do número 1 é: " + numero1);
		System.out.println("O valor do número 2 é: " + numero2);
		leitor.close();	
	}

}
