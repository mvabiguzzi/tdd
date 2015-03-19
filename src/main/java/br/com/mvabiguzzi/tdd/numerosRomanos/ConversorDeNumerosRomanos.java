package br.com.mvabiguzzi.tdd.numerosRomanos;

public class ConversorDeNumerosRomanos {
	
	public int converte(String numeroEmRomano) {
		if(numeroEmRomano.equals("I")) return 1;
		else if(numeroEmRomano.equals("V")) return 5;
		
		return 0;
	}
	
}
