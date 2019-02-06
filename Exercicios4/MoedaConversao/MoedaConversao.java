package MoedaConversao;

public class MoedaConversao {

	public static final double IOF = 0.06;
	
	public static double conversao(double qtdDollar, double dollarValor) {
		return qtdDollar * dollarValor * (1.0+IOF);
	}
	
}
