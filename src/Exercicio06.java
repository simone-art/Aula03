import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		//Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom 
		//“DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e um 
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
			System.out.println("Você tem um desconto de 3% do valor da compra");
			System.out.println("O valor final a ser pago é: " + valorDaCompra);
			System.out.println("==============================================");
		}else {
			System.out.println("==============================================");
			System.out.println("A sua compra não tem desconto");
			System.out.println("O valor final a ser pago é: " + valorDaCompra);
			System.out.println("==============================================");
		}
		leitor.close();
		
	}

}
