package br.com.mvabiguzzi.tdd.notaFiscal;

import java.util.Calendar;

public class GeradorDeNotaFiscal {
	
	private NfDao dao;
	private SAP sap;
	
	public GeradorDeNotaFiscal(NfDao dao, SAP sap) {
		this.dao = dao;
		this.sap = sap;
	}
	
	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(pedido.getCliente(), pedido.getValorTotal()*0.94, Calendar.getInstance());
		
		dao.persiste(nf);
		sap.envia(nf);
		
		return nf;
	}
	
}
