package ListaEmpregado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Operações.OperacoesEmpregado;

/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.															
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.*/


public class ListaEmpregado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<OperacoesEmpregado> list = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();
		
		//parte 1 Informações
		for (int c=0;c<n;c++) {
			
			System.out.println();
			System.out.println("Empregado #" + (c+1) + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			list.add(new OperacoesEmpregado( id, nome, salario));
		  }
		
		
		//parte 2 Aumento de salario
		
		System.out.println();
		System.out.print("Entre com o ID do empregado que terá aumento de salário: ");
		int id = sc.nextInt();
		OperacoesEmpregado opEmp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(opEmp == null) {
			System.out.println("Está ID não existe. ");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			opEmp.addSalario(porcentagem);
		}
		
		//parte 3 Mostrar lista de empregados.
		System.out.println();
		System.out.println("Lista de empregados: ");
		for (OperacoesEmpregado obj : list )
		System.out.println(obj);
		
		
		sc.close();
	}	
}
	
