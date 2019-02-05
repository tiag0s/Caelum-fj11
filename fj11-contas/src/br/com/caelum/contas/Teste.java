package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;


public class Teste {

	public static void main(String[] args) {
		
		Conta teste = new Conta(1);
		teste.setTitular("jose");
		
		Conta teste1 = new Conta(2);
		teste1.setTitular("maria");
		
		Conta teste2 = new Conta(5);
		teste2.setTitular("joao");
		
		int total = Conta.identificador;
		
		System.out.println(teste.getTitular() + " " );
	
		System.out.println(total);
		
		
		


	}
}