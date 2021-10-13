import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		//– Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. 
		//Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles 
		//deve ser carregado pelo drone
		
		Scanner leitor = new Scanner(System.in);
		double lixo1, lixo2, lixo3;
		
		System.out.print("Por favor, digite o peso do seu primeiro lixo: " );
		lixo1 = leitor.nextDouble();
		
		System.out.print("Por favor, digite o peso do seu segundo lixo: " );
		lixo2 = leitor.nextDouble();
		
		System.out.print("Por favor, digite o peso do seu terceiro lixo: " );
		lixo3 = leitor.nextDouble();
		
		if(lixo1<lixo2 && lixo1<lixo3) {
			System.out.println("O drone vai carregar o lixo número 1" );
		}else if(lixo2<lixo1 && lixo2<lixo3) {
			System.out.println("O drone vai carregar o lixo número 2" );
		}else if(lixo3<lixo1 && lixo3<lixo2) {
			System.out.println("O drone vai carregar o lixo número 3" );
		}
		leitor.close();
	}

}
