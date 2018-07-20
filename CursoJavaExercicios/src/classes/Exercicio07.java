package classes;

import java.util.Scanner;

/**
 * 7. Crie uma classe NumeroDecrescente que contenha um método que receba um
 * número inteiro e imprima, em ordem decrescente, o valor do número até 0.
 */
public class Exercicio07 {

	public static void imprimeDecrescente(int numero) {
		int lista;
		for (int i = 0; i < numero + 1; i++) {
			lista = numero - i;
			System.out.println(lista);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();

		imprimeDecrescente(numero);

		scanner.close();
	}
}
