package Projeto3;

import java.util.Scanner;

import Estudante.Aluno;

/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.*/
 
public class Projeto3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		Aluno.nome = sc.nextLine();
		Aluno.n1 = sc.nextDouble();
		Aluno.n2 = sc.nextDouble();
		Aluno.n3 = sc.nextDouble();
				
		System.out.printf("Grade Final: %.2f\n", Aluno.gradeFinal());
		if (Aluno.gradeFinal() < 60.0) {
			System.out.println("Reprovado. ");
			System.out.printf("Nota em falta %.2f pontos. %n", Aluno.diferencaNota());
		}
		else {
			System.out.println("Aprovado. ");
		}
		
		
		sc.close();
	}

}
