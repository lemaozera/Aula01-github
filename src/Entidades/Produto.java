package Entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEstoque() {
		return  preco * quantidade;
	}
	public void addproduto(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removeproduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String tostring() {
		return nome
			+ ", R$ "
			+ String.format("%.2f", preco)
			+ ", "
			+ quantidade
			+ " unidades, Total: R$  "
			+ String.format("%.2f", valorTotalEstoque());
		
	}
	
	
	
	
}
