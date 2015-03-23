package br.com.mvabiguzzi.tdd.lojaVirtual;

public class MaiorMenor {
	private Produto menor;
	private Produto maior;
	
	public void encontra(CarrinhoDeCompras carrinho) {
		for(Item item: carrinho.getItens()) {
			if(menor == null || item.getProduto().getValor() < menor.getValor()) {
				menor = item.getProduto();
			}
			
			if(maior == null || item.getProduto().getValor() > maior.getValor()) {
				maior = item.getProduto();
			}
		}
	}

	public Produto getMenor() {
		return menor;
	}

	public Produto getMaior() {
		return maior;
	}
}
