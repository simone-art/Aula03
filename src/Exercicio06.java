import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		//Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom 
		//�DIADEFESTA�. Fa�a um programa onde o funcion�rio digite o valor da compra e um 
		//cupom, informando o valor final a ser pago
		
		Scanner leitor = new Scanner(System.in);
		double valorDaCompra;
		String nomeDoCupom;
		
		System.out.print("Por favor, digite o valor da compra: ");
		valorDaCompra = leitor.nextDouble();
		System.out.print("Por favor, digite o nome do cupom: ");
		nomeDoCupom = leitor.next();
		
		if(nomeDoCupom.equals("DiaDeFesta")) {
			valorDaCompra = valorDaCompra - (valorDaCompra * 0.03);
			System.out.println("==============================================");
			System.out.println("Voc� tem um desconto de 3% do valor da compra");
			System.out.println("O valor final a ser pago �: " + valorDaCompra);
			System.out.println("==============================================");
		}else {
			System.out.println("==============================================");
			System.out.println("A sua compra n�o tem desconto");
			System.out.println("O valor final a ser pago �: " + valorDaCompra);
			System.out.println("==============================================");
		}
		leitor.close();
		
	}

}
