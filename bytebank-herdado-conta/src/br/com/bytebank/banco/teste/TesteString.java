package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura";	//nao precisa instanciar(dar new String) | Object literal
//		// Uma string não pode ser modificada -> imutabilidade
//		// String outro = new String("Alura");
//		
//		String modificada = nome.replace("A", "a");
//		
//		System.out.println(modificada);
		
		nome.charAt(2);
		nome.substring(1, 3);
		nome.length();
		nome.trim();
		nome.isEmpty();
		nome.contains("ali");
	}
}
