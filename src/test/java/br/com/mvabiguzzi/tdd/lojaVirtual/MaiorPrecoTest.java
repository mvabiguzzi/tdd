package br.com.mvabiguzzi.tdd.lojaVirtual;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaiorPrecoTest {
	
	private CarrinhoDeCompras carrinho;
	
	@Before
	public void inicializa() {
		this.carrinho = new CarrinhoDeCompras();
	}
	
	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoComUmElemento() {
		Produto geladeira = new Produto("Geladeira", 900.0);
		
		carrinho.adiciona(new Item(geladeira, 1));
		
		assertEquals(900.0, carrinho.maiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		Produto geladeira = new Produto("Geladeira", 900.0);
		Produto fogao = new Produto("Fogao", 1500.0);
		Produto maquinaDeLavar = new Produto("Maquina de Lavar", 750.0);
		
		carrinho.adiciona(new Item(geladeira, 1));
		carrinho.adiciona(new Item(fogao, 1));
		carrinho.adiciona(new Item(maquinaDeLavar, 1));
		
		assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
	}
}
