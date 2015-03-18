package br.com.mvabiguzzi.tdd.lojaVirtual;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> produtos;

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void adiciona(Produto produto) {
		if(this.produtos == null) {
			this.produtos = new ArrayList<Produto>();
		}
		
		this.produtos.add(produto);
	}
}
