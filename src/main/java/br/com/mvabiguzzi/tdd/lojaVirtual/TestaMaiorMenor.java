package br.com.mvabiguzzi.tdd.lojaVirtual;

import junit.framework.Assert;

import org.junit.Test;

public class TestaMaiorMenor {
	@Test
	public void ordemDecrescente() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Produto("Geladeira", 540.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
		
		MaiorMenor algoritimo = new MaiorMenor();
		
		algoritimo.encontra(carrinho);
		
		Assert.assertEquals("Jogo de pratos", algoritimo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritimo.getMaior().getNome());
	}
	
	@Test
	public void apenasUmProduto() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Produto("Geladeira", 540.0));
		
		MaiorMenor algoritimo = new MaiorMenor();
		
		algoritimo.encontra(carrinho);
		
		Assert.assertEquals("Geladeira", algoritimo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritimo.getMaior().getNome());
	}
}
