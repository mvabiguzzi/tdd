package br.com.mvabiguzzi.tdd.lojaVirtual;

public class MaiorPreco {
	
	public double encontra(CarrinhoDeCompras carrinho) {
		if(carrinho.getItens().size() == 0) return 0;
		
		double maior = carrinho.getItens().get(0).getValorTotal();
		
		for(Item item : carrinho.getItens()) {
			if(item.getValorTotal() > maior) {
				maior = item.getValorTotal();
			}
		}
		
		return maior;
	}
	
}
