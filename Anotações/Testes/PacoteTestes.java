package Testes;

import java.util.Scanner;

public class PacoteTestes {

	public static void main(String[] args) {

		

		String nome = "João";
		   imprimeNome("Empty");
		   
	}
		   
	public static void imprimeNome(String nome) {
		   if(!nome.isEmpty()){
			    System.out.println("Tudo bem " + nome + "?");
		   } else { 
			    System.out.println("O nome é " + nome +"?");
		   }
	}
	}
		/*int[] vet = new int[501];  //ALGORITMO QUE ARMAZENA O MULTIPLO DE 5 EM UM INTERVALO FECHADO DE 1 A 500
		for(int c=1;c<vet.length;c++) {
			vet[c] = c;
			if(c%5==0) {
				
				System.out.println( vet[c]);			
			}
		}*/
		
				
		
		/*int[] vet = new int[101];
		
		for(int c=0;c<vet.length;c++) {
			//vet[100 - c] = c; //decrescente
			vet[c] = c; 
		}
		for(int c=0;c<vet.length;c++) {
			System.out.println(c + " " + (vet[c]+100));
		}
		*/
		
		
		/*
		 * String nome = "Anthony"; //nome decrescente char[] vet = new char[7]; for
		 * (int c=nome.length()-1;c>=0;c--){ vet[c] = nome.charAt(c);
		 * System.out.print(vet[c]); } System.out.println(); for (char x : vet) {
		 * System.out.print(x); }
		 */

		/*----------------------------------------------------------------------------------------------
		 int x = 10;
		 if(x>0) {
			int y = 20; //variavel declarada dentro do metodo, fica somente dentro do metodo.
			System.out.println(y);  
		 }
		 
		System.out.println(x);*/

		//----------------------------------------------------------------------------------------------
		/*
		 * Vetores
		 * 
		 * int n = sc.nextInt(); double[] vetor = new double[n];
		 * 
		 * for (int i = 0; i < n; i++) { vetor[i] = sc.nextDouble(); }
		 * 
		 * double soma = 0; for(int i = 0; i < n; i++) { soma += vetor[i]; } double
		 * media = soma / n;
		 * 
		 * System.out.printf("Media = %.2f", media);
		 */

		// ----------------------------------------------------------------------------------------------

		// OPERADOR TERNARIO atribuir um valor ou outro pra uma mesma variavel.
		/*
		 * int n1 = sc.nextInt(); int n2 = sc.nextInt();
		 * 
		 * int maior = n1 > n2 ? n1 "(n1+n2)" : n2; apos a interrogação ira fazer a
		 * comparação e mostrar o resultado, podendo fazer ate operações.
		 * 
		 * 
		 * System.out.println(maior);
		 * 
		 * "int x = 8, y = 3; int w = x/y; String z = (w % 2 == 0)?"frase1":"frase2";
		 * 
		 * 
		 * System.out.println(z);"
		 */
		// ----------------------------------------------------------------------------------------------

		/*
		 * String parte1 = "Anthony"; String parte2 = " Macedo"; String parte3 = parte1
		 * + parte2; String parte4 = "Anthony Macedo"; System.out.println(parte3 ==
		 * parte4); //compara a variavel, se sao iguais ou diferentes. false
		 * System.out.println(parte3.equals(parte4)); //aqui ele compara o conteudo da
		 * "String". true
		 */
		// ----------------------------------------------------------------------------------------------
		// PERNAS usando condicional switch. Usa somente numeros inteiros
		/*
		 * System.out.print("Quantas pernas:"); int pernas = sc.nextInt(); String tipo;
		 * System.out.print("isso é um(a) "); switch (pernas){ case 1: tipo = "saci";
		 * break; case 2: tipo = "Normal"; break; case 3: tipo = "TRIPE"; break; case 4:
		 * tipo = "Quadrupede"; default: tipo = "ET"; }
		 * 
		 * System.out.println(tipo);
		 */

		// ----------------------------------------------------------------------------------------------

		/*
		 * Estrutura for "for (c=0;c<3;c++)"
		 * de  c de 0  ate 2  faca c+1
		 * int c=0; while (c<3;) System.out.print("contagem") c++;
		 * 
		 */
		// ----------------------------------------------------------------------------------------------
		/*
		 * for (int i=0;i<=15;i+=2) { //'break' tem a função de jogar pra fora do laço
		 * se verdadeiro. if(i % 3 == 0) continue; //"continue" se verdadeiro faz a
		 * repetiçao sem seguir os comandos de baixo. System.out.println(i); }
		 */

		
	


