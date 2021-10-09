import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		/*
		 * Crie um programa que permita ao usu�rio escolher o elogio que gostaria de
		 * receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio
		 * f�sico, 3 - Elogio pessoal Caso digite qualquer outro n�mero, deve ser
		 * exibida a mensagem "op��o inv�lida"
		 */
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("ELOGIADOR!");
		System.out.println("Selecione a op��o desejada:\n1-Elogio profissional\n2-Elogio f�sico\n3-Elogio pessoal");
		opcao = leitor.nextInt();

		// Aqui precisamos de uma estrutura para validar a op��o inserida.
		// Break para o funcionamento do case e sai da estrutura

		switch (opcao) {
		case 1:
			System.out.println("Os seus commit s�o lindos!");
			break;
		case 2:
			System.out.println("O seu nariz aspira bastante ar");
			break;
		case 3:
			System.out.println("Voc� � uma pessoa maravilhosa");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}

		leitor.close();
	}
}
