package Projeto;

import java.util.Scanner;

import Entidades.Retangulo;

/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

public class Projeto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a largura e depois altura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f \n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f \n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f \n", retangulo.diagonal());
		
		
		
		sc.close();
	}

}
