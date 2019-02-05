package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.Conta;

public   class ContaCorrente extends Conta implements Tributavel {
	public String getTipo() {
		
		return "Conta Corrente";
		
	}
	
	@Override
	public boolean saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("voce tentou sacar" + " um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}else
		this.saldo -=(valor+0.10);
		return false;
		}
	
	
	public double getvalorImposto() {
		return this.getSaldo() *0.01;
		
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
