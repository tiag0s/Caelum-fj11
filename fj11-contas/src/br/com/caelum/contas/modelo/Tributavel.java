package br.com.caelum.contas.modelo;

public abstract interface Tributavel {
	public double getValorImposto();
	public String getTitular();
	public String getTipo();

}
