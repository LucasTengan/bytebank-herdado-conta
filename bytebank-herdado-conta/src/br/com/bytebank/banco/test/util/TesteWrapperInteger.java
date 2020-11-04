package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		// Apenas existem listas de referências, não aceitam primitivos
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing - transformação do primitivo para o objeto e vice-versa
		// Integer.valueOf(29) - isso é o que o autoboxing faz
		// existe uma classe Wrapper para cada tipo primitivo
		
		Integer idadeRef = Integer.valueOf(29);	//delegamos a criação para um método
		int valor = idadeRef.intValue();	// Unboxing: recebe o primitivo, processo inverso
		
		System.out.println(idadeRef.doubleValue());
		
		String s = args[0];	// se for um valor inteiro, é recebido como uma string
//		Integer numero = Integer.valueOf(s);	// Parse: transformação da string para um tipo mais específico
	
		int numero = Integer.parseInt(s);
	}
}
