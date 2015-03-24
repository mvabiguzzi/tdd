package br.com.mvabiguzzi.tdd.calculoSalario;

import static org.junit.Assert.*;

import org.junit.Test;

public class DezOuVintePorCentoTest {
	
	@Test
	public void deveDescontarDezPorCento() {
		Funcionario funcionario = new FuncionarioBuilder().defineSalario(1500).cria();
		
		double valor = new DezOuVintePorCento().calcula(funcionario);
		
		assertEquals(1500*0.9, valor, 0.0001);
	}
	
	@Test
	public void deveDescontarVintePorCento() {
		Funcionario funcionario = new FuncionarioBuilder().defineSalario(4000).cria();
		
		double valor = new DezOuVintePorCento().calcula(funcionario);
		
		assertEquals(4000*0.8, valor, 0.0001);
	}
	
}
