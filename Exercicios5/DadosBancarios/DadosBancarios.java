package DadosBancarios;

/*Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J�
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por
exemplo).

Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger
isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for
suficiente para realizar o saque e/ou pagar a taxa.

Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o
informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre
mostrando os dados da conta ap�s cada opera��o.*/

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
	
	
	
	
	
	

