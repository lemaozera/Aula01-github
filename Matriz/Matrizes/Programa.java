package Matrizes;
/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.*/
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m =sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int l=0;l<mat.length;l++) {
			for(int c=0;c<mat[l].length;c++) {
				mat[l][c] = sc.nextInt();
			}
		}
			System.out.println();
		for (int l=0;l<mat.length;l++) {
			for(int c=0;c<mat[l].length;c++) {
				System.out.printf(mat[l][c]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------");
		
		int x = sc.nextInt();
		
		for (int l=0;l<mat.length;l++) {
			for (int c=0;c<mat[l].length;c++) {
				if(mat[l][c] == x) {
					System.out.println("Posição "+ l +", "+ c + ": ");
					
						if (c > 0) {
							System.out.println("Left: " + mat[l][c-1]);
						}
						if (l > 0) {
							System.out.println("Up: " + mat[l-1][c]);
						}
						if (c < mat[l].length-1) {
							System.out.println("Right: " + mat[l][c+1]);
						}
						if (c < mat.length-1) {
							System.out.println("Down: " + mat[l+1][c]);
					}
				}
			}
		}
	
		
		sc.close();
	}

}
