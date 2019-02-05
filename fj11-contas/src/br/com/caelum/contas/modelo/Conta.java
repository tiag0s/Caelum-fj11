package br.com.caelum.contas.modelo;



public abstract class Conta implements Comparable<Conta> {
	private int numero;
	private String titular;
	private String agencia;
	private String dataDeAbertura;
	protected double saldo;
	public static int identificador;
	
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
		
	}
	
	@Override
	public String toString()
	{
		return "[titular=" + titular.toUpperCase() + ", numero=" + numero + ", agencia=" + agencia + "]";	
	}
	
	public boolean equals (Object obj) {
		if (obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero &&
				this.agencia.equals(outraConta.agencia);
	}
	

	public Conta() {
	}

	public Conta(int identificador) {
		Conta.identificador = identificador + 1;
	}

	public Conta(String titular) {
		this.titular = titular;
	}

	public static int getTotalIdentificador() {
		return Conta.identificador;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;

	}

	public double pegaSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setAgencia (String agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	

	
	
	public boolean saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("voce tentou sacar" + " um valor negativo");
		}else {
		this.saldo= saldo - valor;
		return false;
		}
	}
	
	
	
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("voce tentou depositar" + " um valor negativo");
		}else {
			this.saldo +=valor;
		}
	}
	
	
/*teste
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

*/
	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não deu pra sacar!
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	double Rendimento() {

		saldo = saldo * 0.1;

		return saldo;
	}

	public double getRendimento() {
		return this.saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	
	String recupera() {
		String dados = "Titular:" + this.titular;
		dados += "\nAgencia:" + this.agencia;
		dados += "\nNumero:" + this.numero;
		dados += "\nSaldo atual:" + this.saldo;
		dados += "\nData de Abertura:" + this.dataDeAbertura;

		return dados;

	}

	
	
	public abstract String getTipo();
		
	
	public void transfere(double valor, Conta conta) {
	     this.saca(valor);
	     conta.deposita(valor);
	 }
	
	
	
}

 
 
 
 



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
