package PensionatoQuartos;

import java.util.Scanner;

import PensionatoMetodos.PensionatoMetodos;

/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos n�meros 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o n�mero de estudantes que v�o
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relat�rio de todas ocupa��es do pensionato, por ordem de quarto,
conforme exemplo.*/



public class Programa {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		PensionatoMetodos[] vetor = new PensionatoMetodos[10];
		
		
		System.out.print("Quantos quartos ser�o alugados? ");
		int n = sc.nextInt();
		
		for (int c=1;c<=n;c++) {
			System.out.println("Aluguel #"+ c + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto]  = new PensionatoMetodos(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int c=0;c<10;c++) {
		if (vetor[c] != null ) {
			System.out.println(c + ": " + vetor[c]);
		}
		}
		
		sc.close();
	}

}
