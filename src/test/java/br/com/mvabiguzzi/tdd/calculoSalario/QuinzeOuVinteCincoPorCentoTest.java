package br.com.mvabiguzzi.tdd.calculoSalario;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuinzeOuVinteCincoPorCentoTest {
	
	@Test
	public void deveDescontarQuinzePorCento() {
		Funcionario funcionario = new FuncionarioBuilder().defineSalario(1500).cria();
		
		double valor = new QuinzeOuVinteCincoPorCento().calcula(funcionario);
		
		assertEquals(1500*0.85, valor, 0.0001);
	}
	
	@Test
	public void deveDescontarVinteCincoPorCento() {
		Funcionario funcionario = new FuncionarioBuilder().defineSalario(3500).cria();
		
		double valor = new QuinzeOuVinteCincoPorCento().calcula(funcionario);
		
		assertEquals(3500*0.75, valor, 0.0001);
	}
	
}
