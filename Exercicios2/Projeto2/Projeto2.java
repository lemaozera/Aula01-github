package Projeto2;

import java.util.Locale;
import java.util.Scanner;

import Empregado.Funcionario;

/*Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe
projetada abaixo.*/


public class Projeto2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.next();
		System.out.print("Sal�rio: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.println("Empregado: "+ funcionario);
		System.out.print("Porcentagem para aumento do salario: ");
		double porcentagem = sc.nextDouble();
		funcionario.addSalario(porcentagem);
		System.out.println();
		System.out.println("Dados atualizados: "+ funcionario);
		
		
		sc.close();
	}

}
