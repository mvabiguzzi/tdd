package br.com.mvabiguzzi.tdd.lojaVirtual;

public class CarrinhoDeComprasBuilder {
	
	private CarrinhoDeCompras carrinho;
	
	public CarrinhoDeComprasBuilder() {
		this.carrinho = new CarrinhoDeCompras();
	}
	
	public CarrinhoDeComprasBuilder comItens(double... valores) {
		for(double valor : valores) {
			Produto produto = new Produto("Produto", valor);
			Item item = new Item(produto, 1);
			carrinho.adiciona(item);
		}
		
		return this;
	}
	
	public CarrinhoDeCompras cria() {
		return carrinho;
	}
	
}
