package br.com.mvabiguzzi.tdd.lojaVirtual;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaiorPrecoTest {
	
	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		MaiorPreco algoritimo = new MaiorPreco();
		
		double valor = algoritimo.encontra(carrinho);
		
		assertEquals(0.0, valor, 0.0001);
	}
}
