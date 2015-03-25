package br.com.mvabiguzzi.tdd.notaFiscal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeradorDeNotaFiscalTest {
	
	private NfDao dao;
	private SAP sap;
	private GeradorDeNotaFiscal gerador;
	
	@Before
	public void setup() {
		this.dao = Mockito.mock(NfDao.class);
		this.sap = Mockito.mock(SAP.class);
		
		this.gerador = new GeradorDeNotaFiscal(dao, sap);
	}
	
	@Test
	public void deveGerarNotaFiscalComValorDeImpostoDescontado() {
		Pedido pedido = new Pedido("Marcos Vinícius", 1000.0, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		assertEquals(1000*0.94, nf.getValor(), 0.0001);
	}
	
	@Test
	public void devePersistirNfGerada() {
		Pedido pedido = new Pedido("Marcos Vinícius", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		Mockito.verify(dao).persiste(nf);
	}
	
	@Test
	public void deveEnviarNfGeradaParaSap() {
		Pedido pedido = new Pedido("Marcos Vinícius", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		Mockito.verify(sap).envia(nf);
	}
	
}
