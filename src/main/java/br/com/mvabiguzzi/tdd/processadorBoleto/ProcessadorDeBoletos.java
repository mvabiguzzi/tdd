package br.com.mvabiguzzi.tdd.processadorBoleto;

import java.util.List;

public class ProcessadorDeBoletos {
	
	public void processa(List<Boleto> boletos, Fatura fatura) {
		double valorTotal = 0;
		
		for(Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			
			fatura.getPagamentos().add(pagamento);
			
			valorTotal += boleto.getValor();
		}
		
		if(fatura.getValor() <= valorTotal) {
			fatura.setPago(true);
		}
	}
	
}
