package br.com.mvabiguzzi.tdd.calculoSalario;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalario() > 2500) {
			return funcionario.getSalario()*0.75;
		}
		
		return funcionario.getSalario()*0.85;
	}

}
