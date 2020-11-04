package br.com.bytebank.banco.modelo;
/**
 * Classe que � uma moldura para a cria��o de uma conta
 * @author luks_
 *
 */

public abstract class Conta extends Object implements Comparable<Conta> {

	protected double saldo;	//n�o pode ser nem modificado nem lido, apenas a pr�pria classe pode fazer isso
	// protected � p�blico para os filhos
	private int agencia;
	private int numero;
	private transient Cliente titular;	//Cliente n�o � para serializar
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		total++;	// � um atributo da classe, pois � static
		this.agencia = agencia;	//� um atributo do objeto/da instancia 
		this.numero = numero;
	}
	
	/**
	 * Valor precisa ser maior que o saldo.
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public abstract void deposita(double valor);	// filhos devem implementar
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor );
		}
		
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	// m�todo que devolve o saldo, pois � a �nica maneira de ler um atributo privado
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if(novoNumero <= 0) {
			System.out.println("n�o permitido valores negativos");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("n�o � permitido valores negativos");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero: " + this.getNumero() + ", Agencia: " + this.agencia;
	}
	
	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
}
