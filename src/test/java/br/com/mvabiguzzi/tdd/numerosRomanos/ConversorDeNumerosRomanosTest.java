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
}
