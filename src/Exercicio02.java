import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int minutos;
		int segundos;
		double horas;
		DecimalFormat formatador = new DecimalFormat("#00");
		System.out.println("Por favor, informe a duração do filme em minutos: ");
		
		minutos = leitor.nextInt();
		segundos = minutos * 60;
		horas = minutos / 60.0;

		System.out.println("o filme tem " + segundos + " segundos de duração ");
		System.out.println("o filme tem " + horas + " horas de duração ");
		
		//Formatando as horas
		
		System.out.println("o filme tem " + formatador.format(horas) + "horas de duração ");
		leitor.close();	
	}

}
