package ProjetoContaBancaria;

import java.util.Locale;
import java.util.Scanner;

import DadosBancarios.DadosBancarios;

/*Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito
inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua
conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.

Numero da conta
Nome titular
valor inicial (opcional) se nao depositar = 0



Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J�
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por
exemplo).

Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger
isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for
suficiente para realizar o saque e/ou pagar a taxa.

Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o
informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre
mostrando os dados da conta ap�s cada opera��o.*/

public class Projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		DadosBancarios dadosbancarios;
		
		
		System.out.print("Entre com o numero da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String nomeConta = sc.nextLine();
		System.out.print("Existe um deposito inicial (s/n)?");
		char resposta = sc.next().charAt(0);
		
		
		if(resposta == 's') {
			System.out.print("Digite o valor do dep�sito inicial: ");
			 double depositoInicial = sc.nextDouble();
			 dadosbancarios = new DadosBancarios(numConta, nomeConta, depositoInicial);
		}
		else {
			dadosbancarios = new DadosBancarios(numConta, nomeConta);
		}
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(dadosbancarios);
		System.out.println();
		
		System.out.print("Digite o valor para dep�sito: ");
		double deposito = sc.nextDouble();
		dadosbancarios.deposito(deposito); 
		System.out.println("Dados da Conta atualizados:");
		System.out.println(dadosbancarios);
		System.out.println();
		
		System.out.print("Digite o valor para saque: ");
		double saque = sc.nextDouble();
		dadosbancarios.saque(saque);
		System.out.println("Dados da conta atualizados: ");
		System.out.print(dadosbancarios);
		System.out.println();
		
		
		sc.close();
	}

}
