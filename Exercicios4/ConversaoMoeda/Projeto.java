package ConversaoMoeda;

import java.util.Locale;
import java.util.Scanner;

import MoedaConversao.MoedaConversao;

/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.*/

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dollar? ");
		double dollarValor = sc.nextDouble();
		System.out.print("Quantos dollars irá comprar: ");
		double quantidade = sc.nextDouble();
		double resultado = MoedaConversao.conversao(quantidade, dollarValor);
		System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
		
		
		sc.close();
				
	}

}
