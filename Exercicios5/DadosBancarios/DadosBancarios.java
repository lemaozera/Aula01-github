package DadosBancarios;

/*Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

public class DadosBancarios {

	
	private int numConta;
	private String nomeConta;
	private double saldoConta;
	
	
	public DadosBancarios (int numConta, String nomeConta) {
		this.numConta = numConta;
		this.nomeConta = nomeConta;
	}
	
	public DadosBancarios(int numConta, String nomeConta, double depositoInicial) {
		super();
		this.numConta = numConta;
		this.nomeConta = nomeConta;
		deposito(depositoInicial);
	}

	
	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public int getNumConta() {
		return numConta;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void deposito(double valorDeposito) {
		 saldoConta += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		 saldoConta -= valorSaque + 5.0;
	}
	
	
	
	public String toString(){
		return  "Conta: "
				+ numConta
				+ ", Titular: "
				+ nomeConta 
				+ ", Saldo: R$ "
				+ String.format("%.2f", saldoConta);
				
	}
	
	}
	
	
	
	
	
	

