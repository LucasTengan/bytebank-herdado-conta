package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5];	//inicializa o array com os valores padr�es, array nao � dinamico
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * 2;
		}
	}
}
