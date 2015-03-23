package br.com.mvabiguzzi.tdd.lojaVirtual;

import org.junit.Assert;
import org.junit.Test;

public class TestaMaiorMenor {
	@Test
	public void ordemDecrescente() {
		Produto geladeira = new Produto("Geladeira", 540.0);
		Produto liquidificador = new Produto("Liquidificador", 250.0);
		Produto jogoDePratos = new Produto("Jogo de pratos", 70.0);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Item(geladeira, 1));
		carrinho.adiciona(new Item(liquidificador, 1));
		carrinho.adiciona(new Item(jogoDePratos, 1));
		
		MaiorMenor algoritimo = new MaiorMenor();
		
		algoritimo.encontra(carrinho);
		
		Assert.assertEquals("Jogo de pratos", algoritimo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritimo.getMaior().getNome());
	}
	
	@Test
	public void apenasUmProduto() {
		Produto geladeira = new Produto("Geladeira", 540.0);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Item(geladeira, 1));
		
		MaiorMenor algoritimo = new MaiorMenor();
		
		algoritimo.encontra(carrinho);
		
		Assert.assertEquals("Geladeira", algoritimo.getMenor().getNome());
		Assert.assertEquals("Geladeira", algoritimo.getMaior().getNome());
	}
}
