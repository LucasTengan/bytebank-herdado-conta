package br.com.bytebank.banco.modelo;

import java.io.Serializable;

// herença captura o que é comum e isola aquilo que é diferente
public class ContaCorrente extends Conta implements Tributavel, Serializable {
	
	// Ao herdar, herda-se tudo, menos o construtor
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);	// o super() é chamado implicitamente
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorSacado = valor + 0.2;
		super.saca(valorSacado);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
	}
	
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	public void andar() {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaCorrente, " + super.toString();
	}
}
