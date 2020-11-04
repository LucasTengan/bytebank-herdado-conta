package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		
		// A remo��o � mais rapida e direta, por�m para pegar um elemento � custoso, pois precisa iterar desde o come�o
		List<Conta> lista = new LinkedList<Conta>();	// s� aceita contas
		
		Conta cc = new ContaCorrente(11, 22);
		Conta cc2 = new ContaCorrente(11, 11);
		Conta cc3 = new ContaCorrente(11, 33);
		
//		Cliente cliente = new Cliente();
//		lista.add(cliente);	//n�o permite pois falamos que o arraylist s� aceita apenas contas.
		
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);	// o cast agora � desnecess�rio
		System.out.println(ref.getAgencia());
		
		for(Conta o : lista) {	// s� funciona colocando o tipo Conta pois informamos na declara��o
			System.out.println(o);
		}
	}
}
