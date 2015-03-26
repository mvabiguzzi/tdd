package br.com.mvabiguzzi.tdd.processadorBoleto;

public class Pagamento {
	
	private double valor;
	private MeioDePagamento meioDePagamento;
	
	public Pagamento(double valor, MeioDePagamento meioDePagamento) {
		this.valor = valor;
		this.meioDePagamento = meioDePagamento;
	}

	public double getValor() {
		return valor;
	}

	public MeioDePagamento getMeioDePagamento() {
		return meioDePagamento;
	}
	
}
