package desafio;

public class Imovel implements Seguravel {

	private double valorMercado;
	private int areaConstruida;
	
	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}
	
	@Override
	public double calculcarValorApolice() {
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Im�vel com �rea constru�da de " + this.areaConstruida + "m2 e valor de mercado " 
				+ this.valorMercado;
	}

}
