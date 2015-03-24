package br.com.mvabiguzzi.tdd.lojaVirtual;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeComprasTest {
	
	private CarrinhoDeCompras carrinho;
	
	@Before
	public void inicializa() {
		this.carrinho = new CarrinhoDeComprasBuilder().cria();
	}
	
	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoComUmElemento() {
		carrinho = new CarrinhoDeComprasBuilder().comItens(900.0).cria();
		
		assertEquals(900.0, carrinho.maiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		carrinho = new CarrinhoDeComprasBuilder().comItens(900.0, 1500.0, 750.0).cria();
		
		assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
	}
}
