package br.com.mvabiguzzi.tdd.calculoSalario;

public class CalculadoraSalario {
	
	public double calculaSalario(Funcionario funcionario) {
		if(funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)) {
			if(funcionario.getSalario() > 3000) {
				return funcionario.getSalario()*0.8;
			}
			
			return funcionario.getSalario()*0.9;
		}
		
		return funcionario.getSalario()*0.85;
	}
	
}
