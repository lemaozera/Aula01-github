package ConversaoMoeda;

import java.util.Locale;
import java.util.Scanner;

import MoedaConversao.MoedaConversao;

/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
para ser respons�vel pelos c�lculos.*/

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dollar? ");
		double dollarValor = sc.nextDouble();
		System.out.print("Quantos dollars ir� comprar: ");
		double quantidade = sc.nextDouble();
		double resultado = MoedaConversao.conversao(quantidade, dollarValor);
		System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
		
		
		sc.close();
				
	}

}
