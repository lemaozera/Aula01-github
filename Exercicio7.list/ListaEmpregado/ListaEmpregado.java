package ListaEmpregado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Opera��es.OperacoesEmpregado;

/*Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
N funcion�rios. N�o deve haver repeti��o de id.															
Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
conforme exemplos.
Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
aumento por porcentagem dada.*/


public class ListaEmpregado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<OperacoesEmpregado> list = new ArrayList<>();
		
		System.out.print("Quantos empregados ser�o registrados? ");
		int n = sc.nextInt();
		
		//parte 1 Informa��es
		for (int c=0;c<n;c++) {
			
			System.out.println();
			System.out.println("Empregado #" + (c+1) + ": ");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();
			list.add(new OperacoesEmpregado( id, nome, salario));
		  }
		
		
		//parte 2 Aumento de salario
		
		System.out.println();
		System.out.print("Entre com o ID do empregado que ter� aumento de sal�rio: ");
		int id = sc.nextInt();
		OperacoesEmpregado opEmp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(opEmp == null) {
			System.out.println("Est� ID n�o existe. ");
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
	
