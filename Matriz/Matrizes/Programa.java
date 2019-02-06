package Matrizes;
/*Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo n�meros inteiros,
podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
esquerda, acima, � direita e abaixo de X, quando houver, conforme
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
					System.out.println("Posi��o "+ l +", "+ c + ": ");
					
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
