import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		//Programa onde o usu�rio digita dos n�meros inteiros
		//Sem definir uma terceira vari�vel, troque os valores de A e B entre si
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		System.out.print("Por favor, digite o primeiro n�mero: ");
		
		numero1 = leitor.nextInt();
		
		int numero2;
		System.out.print("Por favor, digite o segundo n�mero: ");
		numero2 = leitor.nextInt();
		
		numero1 = numero2;
		numero2 =numero1;
		
		System.out.println("O valor do n�mero 1 �: " + numero1);
		System.out.println("O valor do n�mero 2 �: " + numero2);
		leitor.close();	
	}

}
