package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		// Apenas existem listas de refer�ncias, n�o aceitam primitivos
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing - transforma��o do primitivo para o objeto e vice-versa
		// Integer.valueOf(29) - isso � o que o autoboxing faz
		// existe uma classe Wrapper para cada tipo primitivo
		
		Integer idadeRef = Integer.valueOf(29);	//delegamos a cria��o para um m�todo
		int valor = idadeRef.intValue();	// Unboxing: recebe o primitivo, processo inverso
		
		System.out.println(idadeRef.doubleValue());
		
		String s = args[0];	// se for um valor inteiro, � recebido como uma string
//		Integer numero = Integer.valueOf(s);	// Parse: transforma��o da string para um tipo mais espec�fico
	
		int numero = Integer.parseInt(s);
	}
}
