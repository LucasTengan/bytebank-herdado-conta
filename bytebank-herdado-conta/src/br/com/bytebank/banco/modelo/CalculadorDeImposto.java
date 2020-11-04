package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {
	
	private double total;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.total += valor;
	}
	
	public double getTotal() {
		return this.total;
	}
}
