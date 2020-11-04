package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef);
		
		Number refNumero = Integer.valueOf(29);	// polimorfismo
		
		List<Number> lista = new ArrayList<Number>();
	}
}
