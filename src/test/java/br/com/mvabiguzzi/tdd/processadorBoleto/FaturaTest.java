package br.com.mvabiguzzi.tdd.processadorBoleto;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FaturaTest {
	
	@Test
	public void deveManterFaturaComoNaoPagaCasoUmUnicoBoletoNaoPagueTudo() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		
		Boleto b1 = new Boleto(100.0);
		List<Boleto> boletos = Arrays.asList(b1);
		
		processador.processa(boletos, fatura);
		
		assertFalse(fatura.isPago());
	}
	
	@Test
	public void deveManterFaturaComoNaoPagaCasoMultiplosBoletosNaoPaguemTudo() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		
		Fatura fatura = new Fatura("Cliente", 300.0);
		
		Boleto b1 = new Boleto(100.0);
		Boleto b2 = new Boleto(100.0);
		Boleto b3 = new Boleto(50.0);
		List<Boleto> boletos = Arrays.asList(b1, b2, b3);
		
		processador.processa(boletos, fatura);
		
		assertFalse(fatura.isPago());
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
	
	@Test
	public void deveMarcarFaturaComoPagaCasoMultiplosBoletosPaguemTudo() {
		ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
		
		Fatura fatura = new Fatura("Cliente", 150.0);
		
		Boleto b1 = new Boleto(75.0);
		Boleto b2 = new Boleto(75.0);
		Boleto b3 = new Boleto(75.0);
		Boleto b4 = new Boleto(75.0);
		List<Boleto> boletos = Arrays.asList(b1, b2, b3, b4);
		
		processador.processa(boletos, fatura);
		
		assertTrue(fatura.isPago());
	}
	
}
