package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		// A remoção é mais rapida e direta, porém para pegar um elemento é custoso, pois precisa iterar desde o começo
		List<Conta> lista = new LinkedList<Conta>();	// só aceita contas
		
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
