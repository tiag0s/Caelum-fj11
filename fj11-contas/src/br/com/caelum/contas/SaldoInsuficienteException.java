package br.com.caelum.contas;

public class SaldoInsuficienteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6827828613747288036L;


	public SaldoInsuficienteException() {}
	
	
	public SaldoInsuficienteException(double valor) {
		super ("Saldo insuficiente para sacar o valor de: " +valor);
	}
	
	
}
