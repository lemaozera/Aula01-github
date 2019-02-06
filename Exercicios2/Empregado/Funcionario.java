package Empregado;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void addSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;

	}

	public String tostring() {
		return nome + ", R$ " + String.format("%.2f", salarioLiquido());
	}
}
