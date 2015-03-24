package br.com.mvabiguzzi.tdd.calculoSalario;

public class CalculadoraSalario {
	
	public double calculaSalario(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
	
}
