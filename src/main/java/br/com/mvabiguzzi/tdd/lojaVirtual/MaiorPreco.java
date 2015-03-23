package br.com.mvabiguzzi.tdd.lojaVirtual;

public class MaiorPreco {
	
	public double encontra(CarrinhoDeCompras carrinho) {
		if(carrinho.getItens().size() == 0) return 0;
		
		return carrinho.getItens().get(0).getValorTotal();
	}
	
}
