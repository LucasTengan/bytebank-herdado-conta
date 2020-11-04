package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		ContaEspecial ce = new ContaEspecial(111, 222);
		
		Conta cc = new ContaCorrente(123, 321);
		
		
		ce.deposita(20);
		System.out.println(ce.getSaldo());
		ce.deposita(20);
		System.out.println(ce.getSaldo());
	}
}
