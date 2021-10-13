import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		//Programa onde um robô de combate só deve ativar sua arma principal quando o inimigo está a 
		//menos de 70cm de distância. Faça um programa onde o usuário informe a distância do 
		//inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do 
		//status da arma
		
		Scanner leitor = new Scanner(System.in);
		int distancia;
		System.out.print("Por favor, infome a distancia da sua arma principal: ");
		distancia = leitor.nextInt();
		
		if(distancia<70) {
			System.out.println("ATIVADO");
		}else {
			System.out.println("DESATIVADO");
		}
		leitor.close();	
	}

}
