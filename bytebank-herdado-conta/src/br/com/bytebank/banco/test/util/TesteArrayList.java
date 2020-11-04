package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();	// só aceita contas
		
		Conta cc = new ContaCorrente(11, 22);
		Conta cc2 = new ContaCorrente(11, 11);
		Conta cc3 = new ContaCorrente(11, 33);
		
//		Cliente cliente = new Cliente();
//		lista.add(cliente);	//não permite pois falamos que o arraylist só aceita apenas contas.
		
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);	// o cast agora é desnecessário
		System.out.println(ref.getAgencia());
		
		for(Conta o : lista) {	// só funciona colocando o tipo Conta pois informamos na declaração
			System.out.println(o);
		}
	}
}
