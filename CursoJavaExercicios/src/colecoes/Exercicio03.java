package colecoes;

import java.util.ArrayList;

public class Exercicio03 {
	/** 3. Crie um programa que una dois vetores um um vetor só; */

	public static void main(String[] args) {

		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("1");
		lista1.add("2");
		lista1.add("3");
		System.out.println("Lista 1: " + lista1);

		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("4");
		lista2.add("5");
		lista2.add("6");
		System.out.println("Lista 2: " + lista2);

		ArrayList<String> lista3 = new ArrayList<String>();
		lista3.addAll(lista1);
		lista3.addAll(lista2);
		System.out.println("Lista Unificada: " + lista3);
	}
}
