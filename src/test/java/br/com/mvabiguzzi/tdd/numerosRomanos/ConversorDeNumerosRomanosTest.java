package br.com.mvabiguzzi.tdd.numerosRomanos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDeNumerosRomanosTest {
	
	@Test
	public void deveEntenderSimboloI() {
		ConversorDeNumerosRomanos romano = new ConversorDeNumerosRomanos();
		
		int numero = romano.converte("I");
		
		assertEquals(1, numero);
	}
	
	@Test
	public void deveEntenterSimboloV() {
		ConversorDeNumerosRomanos romano = new ConversorDeNumerosRomanos();
		
		int numero = romano.converte("V");
		
		assertEquals(5, numero);
	}
	
	@Test
	public void deveEntenderDoisSimbulosComoII() {
		ConversorDeNumerosRomanos romano = new ConversorDeNumerosRomanos();
		
		int numero = romano.converte("II");
		
		assertEquals(2, numero);
	}
	
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConversorDeNumerosRomanos romano = new ConversorDeNumerosRomanos();
		
		int numero = romano.converte("XXII");
		
		assertEquals(22, numero);
	}
	
	@Test
	public void deveEntenderNumerosComoIX() {
		ConversorDeNumerosRomanos romano = new ConversorDeNumerosRomanos();
		
		int numero = romano.converte("IX");
		
		assertEquals(9, numero);
	}
	
	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
		ConversorDeNumerosRomanos romano = new ConversorDeNumerosRomanos();
		
		int numero = romano.converte("XXIV");
		
		assertEquals(24, numero);
	}
}
