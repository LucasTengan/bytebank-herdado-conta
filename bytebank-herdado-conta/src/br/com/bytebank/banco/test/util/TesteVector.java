package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;

public class TesteVector {

	public static void main(String[] args) {
		
		// Vector é uma thread safe, trabalhar com duas pilhas ao mesmo tempo
		List<Conta> lista = new Vector<Conta>();
	}
}
