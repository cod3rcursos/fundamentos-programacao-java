package classes;

import java.util.Scanner;

/**
 * 1. Crie uma função que recebe dois números e imprima a soma desses dois
 * números.
 */
public class Exercicio01 {

	static void somatorio(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		int n1 = scanner.nextInt();

		System.out.println("Digite o segundo numero: ");
		int n2 = scanner.nextInt();

		somatorio(n1, n2);

		scanner.close();
	}

}
