package classes;

import java.util.Scanner;

/**
 * 2. Crie uma função que múltiplos números inteiros, e retorne o maior
 * número.
 */
public class Exercicio02 {

	static int maiorNumero;

	static void maiorNumero(int a, int b, int c) {

		if (a > b && a > c) {
			maiorNumero = a;
		} else if (b > a && b > c) {
			maiorNumero = b;
		} else {
			maiorNumero = c;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int n1 = scanner.nextInt();

		System.out.println("Digite o segundo numero: ");
		int n2 = scanner.nextInt();

		System.out.println("Digite o terceiro numero: ");
		int n3 = scanner.nextInt();

		maiorNumero(n1, n2, n3);

		System.out.println(maiorNumero);

		scanner.close();
	}

}
