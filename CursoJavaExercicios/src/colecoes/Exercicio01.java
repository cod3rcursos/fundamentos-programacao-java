package colecoes;

import java.util.Random;

public class Exercicio01 {
	/** 1. Copie os valores de um vetor para um outro vetor; */

	public static void main(String[] args) {

		int[] a = new int[5];

		Random numeros = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = numeros.nextInt(10);
			System.out.println("a[" + i + "]=" + a[i]);
		}

		System.out.println();

		int[] b = a.clone();

		for (int i = 0; i < a.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}
	}

}