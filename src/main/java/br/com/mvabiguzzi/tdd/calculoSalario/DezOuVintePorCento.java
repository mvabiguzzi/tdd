package br.com.mvabiguzzi.tdd.calculoSalario;

public class DezOuVintePorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalario() > 3000.0) {
			return funcionario.getSalario()*0.8;
		}
		
		return funcionario.getSalario()*0.9;
	}

}
