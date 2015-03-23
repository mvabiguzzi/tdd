package br.com.mvabiguzzi.tdd.lojaVirtual;

public class MaiorPreco {
	
	public double encontra(CarrinhoDeCompras carrinho) {
		double maior = 0;
		
		for(Item item : carrinho.getItens()) {
			if(item.getValorTotal() > maior) {
				maior = item.getValorTotal();
			}
		}
		
		return maior;
	}
	
}
