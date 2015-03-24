package br.com.mvabiguzzi.tdd.calculoSalario;

public class FuncionarioBuilder {
	
	private Funcionario funcionario;
	
	public FuncionarioBuilder defineSalario(double valor) {
		this.funcionario = new Funcionario("Funcionario", valor, Cargo.TESTADOR);
		
		return this;
	}
	
	public Funcionario cria() {
		return funcionario;
	}
	
}
