package Aplicação;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;

public class Projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		System.out.println();
		
		System.out.println("Dados do Produto: " + produto.tostring());
		System.out.println();
		
		System.out.print("Entre o numero de produtos para ser adicionado ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addproduto(quantidade);
		System.out.println();
		
		System.out.println("Produtos Atualizados: " + produto.tostring());
		System.out.println();
		
		System.out.print("Entre o numero de produtos para ser removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removeproduto(quantidade);
		System.out.println();
		
		System.out.println("Produtos Atualizados: " + produto.tostring());
		
		
		sc.close();
	}

}
