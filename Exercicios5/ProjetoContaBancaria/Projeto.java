package ProjetoContaBancaria;

import java.util.Locale;
import java.util.Scanner;

import DadosBancarios.DadosBancarios;

/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

Numero da conta
Nome titular
valor inicial (opcional) se nao depositar = 0



Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

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
			System.out.print("Digite o valor do depósito inicial: ");
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
		
		System.out.print("Digite o valor para depósito: ");
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
