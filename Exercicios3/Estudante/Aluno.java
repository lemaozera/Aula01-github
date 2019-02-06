package Estudante;

public class Aluno {

	public static String nome;
	public static double n1;
	public static double n2;
	public static double n3;
	
	public static double gradeFinal() {
		return n1 + n2 + n3;
	}
	
	public static double diferencaNota() {
			if(gradeFinal() < 60.0) {
				return 60.0 - gradeFinal();
		}
			else {
				return 0.0;
			}
		
		
		
		
	}
}
