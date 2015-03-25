package br.com.mvabiguzzi.tdd.notaFiscal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GeradorDeNotaFiscalTest {
	
	private List<AcaoAposGerarNota> acoes;
	
	@Before
	public void setup() {
		this.acoes = new ArrayList<AcaoAposGerarNota>();
	}
	
	@Test
	public void deveGerarNotaFiscalComValorDeImpostoDescontado() {
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);
		Pedido pedido = new Pedido("Marcos Vinícius", 1000.0, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		assertEquals(1000*0.94, nf.getValor(), 0.0001);
	}
	
	@Test
	public void devePersistirNfGerada() {
		NfDao dao = mock(NfDao.class);
		
		acoes.add(dao);
		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);
		Pedido pedido = new Pedido("Marcos Vinícius", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		verify(dao).executa(nf);
	}
	
	@Test
	public void deveEnviarNfGeradaParaSap() {
		SAP sap = mock(SAP.class);
		
		acoes.add(sap);
		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);
		Pedido pedido = new Pedido("Marcos Vinícius", 1000, 1);
		
		NotaFiscal nf = gerador.gera(pedido);
		
		verify(sap).executa(nf);
	}
	
}