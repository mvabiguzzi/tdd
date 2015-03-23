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
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoComUmElemento() {
		Produto geladeira = new Produto("Geladeira", 900.0);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Item(geladeira, 1));
		
		MaiorPreco algoritimo = new MaiorPreco();
		
		double valor = algoritimo.encontra(carrinho);
		
		assertEquals(900.0, valor, 0.0001);
	}
}
