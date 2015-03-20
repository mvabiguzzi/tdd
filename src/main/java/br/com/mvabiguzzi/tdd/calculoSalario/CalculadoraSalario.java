package br.com.mvabiguzzi.tdd.calculoSalario;

public class CalculadoraSalario {
	
	public double calculaSalario(Funcionario funcionario) {
		if(funcionario.getSalario()>funcionario.getCargo().limite) {
			return funcionario.getSalario()*funcionario.getCargo().descontoAcimaLimite;
		}
		
		return funcionario.getSalario()*funcionario.getCargo().descontoAbaixoLimite;
	}
	
}
