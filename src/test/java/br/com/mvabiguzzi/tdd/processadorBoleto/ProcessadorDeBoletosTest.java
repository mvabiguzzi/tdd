package br.com.mvabiguzzi.tdd.processadorBoleto;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ProcessadorDeBoletosTest {
	
	@Test
	public void deveProcessarPagamentoViaBoletoUnico() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		Boleto b1 = new Boleto(150.0);
		List<Boleto> boletos = Arrays.asList(b1);
		
		processador.processa(boletos, fatura);
		
		assertEquals(1, fatura.getPagamentos().size());
		assertEquals(150.0, fatura.getPagamentos().get(0).getValor(), 0.0001);
	}
	
	@Test
	public void deveProcessarPagamentosViaMultiplosBoletos() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		
		Fatura fatura = new Fatura("Cliente", 300.0);
		Boleto b1 = new Boleto(100.0);
		Boleto b2 = new Boleto(200.0);
		List<Boleto> boletos = Arrays.asList(b1, b2);
		
		processador.processa(boletos, fatura);
		
		assertEquals(2, fatura.getPagamentos().size());
		assertEquals(100.0, fatura.getPagamentos().get(0).getValor(), 0.0001);
		assertEquals(200.0, fatura.getPagamentos().get(1).getValor(), 0.0001);
	}
	
	@Test
	public void deveMarcarFaturaComoPagaCasoUmUnicoBoletoPagueTudo() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		
		Boleto b1 = new Boleto(150.0);
		List<Boleto> boletos = Arrays.asList(b1);
		
		processador.processa(boletos, fatura);
		
		assertTrue(fatura.isPago());
	}
	
}