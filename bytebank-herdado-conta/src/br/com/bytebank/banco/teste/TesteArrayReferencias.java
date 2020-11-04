package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];	//contas criadas com o valor padrão null
		
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 33);
		referencias[1] = cc2;
		
//		Object referenciaGenerica = contas[1];
//		System.out.println(referenciaGenerica.getAgencia());	precisa fazer um casting
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];	
		// o compilador não sabe se de fato contas[1] é do tipo ContaPoupanca, pra isso devemos fazer um cast
		// porém, se fizermos o cast errado, recebemos a exceção: ClassCastException
		// ref aponta para a mesma referencia que cc2 e contas[1]
		// existem 3 referencias apontando para o objeto criado 
		ref.getNumero();
	}
}
