package br.com.mvabiguzzi.tdd.calculoSalario;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraSalarioTest {
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
		CalculadoraSalario calculadora = new CalculadoraSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);
		
		double salario = calculadora.calculaSalario(desenvolvedor);
		
		assertEquals(1500.0*0.9, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraSalario calculadora = new CalculadoraSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);
		
		double salario = calculadora.calculaSalario(desenvolvedor);
		
		assertEquals(4000.0*0.8, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDbaComSalarioAbaixoDoLimite() {
		CalculadoraSalario calculadora = new CalculadoraSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 500.0, Cargo.DBA);
		
		double salario = calculadora.calculaSalario(desenvolvedor);
		
		assertEquals(500.0*0.85, salario, 0.00001);
	}
	
}
