package br.com.mvabiguzzi.tdd.lojaVirtual;

public class Produto {
	private String nome;
	private Double valor;
	
	public Produto(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
