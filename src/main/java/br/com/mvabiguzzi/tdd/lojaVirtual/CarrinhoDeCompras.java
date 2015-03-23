package br.com.mvabiguzzi.tdd.lojaVirtual;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itens;
	
	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}
	
	public List<Item> getItens() {
		return this.itens;
	}
	
	public void adiciona(Item item) {
		if(this.itens == null) {
			this.itens = new ArrayList<Item>();
		}
		
		this.itens.add(item);
	}
}
