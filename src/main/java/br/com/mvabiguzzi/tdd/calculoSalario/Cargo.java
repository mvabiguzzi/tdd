package br.com.mvabiguzzi.tdd.calculoSalario;

public enum Cargo {
	DESENVOLVEDOR(3000.0,0.9,0.8),
	DBA(2500.0,0.85,0.75),
	TESTADOR(2500.0,0.85,0.75);
	
	public double limite;
	public double descontoAbaixoLimite;
	public double descontoAcimaLimite;
	
	Cargo(double limite, double descontoAbaixoLimite, double descontoAcimaLimite) {
		this.limite = limite;
		this.descontoAbaixoLimite = descontoAbaixoLimite;
		this.descontoAcimaLimite = descontoAcimaLimite;
	}
}