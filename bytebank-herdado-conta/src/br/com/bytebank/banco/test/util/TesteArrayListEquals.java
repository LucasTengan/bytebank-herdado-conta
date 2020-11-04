package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// Problemas do ArrayList: "tamanho" e "remoção" - é custoso
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 22);
		Conta cc3 = new ContaCorrente(22, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
		boolean existe = lista.contains(cc3);	// o contains usa por baixo dos panos o equals, e o equals compara valor, diferente do == que compara referencia
		// porém nós devemos implementar essa comparação de valor a valor, pois, por padrao, o equals compara referencias
		
		System.out.println(existe);
//		for(Conta conta : lista) {
//			if(conta.ehIgual(cc3)) {	// o == compara referencias
//				System.out.println("Ja existe!");
//			}
//		}
	}
}
