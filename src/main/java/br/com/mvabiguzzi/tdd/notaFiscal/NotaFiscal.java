package br.com.mvabiguzzi.tdd.notaFiscal;

import java.util.Calendar;

public class NotaFiscal {
	
	private String cliente;
	private double valor;
	private Calendar data;
	
	public NotaFiscal(String cliente, double valor, Calendar data) {
		this.cliente = cliente;
		this.valor = valor;
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public Calendar getData() {
		return data;
	}
	
}
