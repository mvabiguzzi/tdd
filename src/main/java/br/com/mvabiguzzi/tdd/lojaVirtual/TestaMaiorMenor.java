package br.com.mvabiguzzi.tdd.lojaVirtual;

public class TestaMaiorMenor {
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Produto("Geladeira", 450.0));
		carrinho.adiciona(new Produto("Liquidificador", 250.0));
		carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
		
		MaiorMenor algoritimo = new MaiorMenor();
		algoritimo.encontra(carrinho);
		
		System.out.println("O menor produto: "+algoritimo.getMenor().getNome());
		System.out.println("O maior produto: "+algoritimo.getMaior().getNome());
	}
}
