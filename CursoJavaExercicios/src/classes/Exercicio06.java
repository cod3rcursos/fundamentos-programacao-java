package classes;

import java.util.Scanner;

/**
 * 6. Crie uma função que receba o nome e a idade de 3 pessoas e diga qual o
 * nome da pessoa mais velha e o nome da pessoa mais nova.
 */
public class Exercicio06 {

	static void maisVelhaEMaisNova(String nome1, int num1, String nome2, int num2, String nome3, int num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.printf("\nA pessoa mais velha é: %s ", nome1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("\nA pessoa mais velha é: %s ", nome2);
		} else {
			System.out.printf("\nA pessoa mais velha é: %s ", nome3);
		}

		if (num1 < num2 && num1 < num3) {
			System.out.printf("\nA pessoa mais nova é: %s ", nome1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.printf("\nA pessoa mais nova é: %s ", nome2);
		} else {
			System.out.printf("\nA pessoa mais nova é: %s ", nome3);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome da primeira pessoa: ");
		String nome1 = scanner.next();

		System.out.println("\nDigite a idade da primeira pessoa: ");
		int num1 = scanner.nextInt();

		System.out.println("\nDigite o nome da segunda pessoa: ");
		String nome2 = scanner.next();

		System.out.println("\nDigite a idade da segunda pessoa: ");
		int num2 = scanner.nextInt();

		System.out.println("\nDigite o nome da terceira pessoa: ");
		String nome3 = scanner.next();

		System.out.println("\nDigite a idade da terceira pessoa: ");
		int num3 = scanner.nextInt();

		maisVelhaEMaisNova(nome1, num1, nome2, num2, nome3, num3);

		scanner.close();
	}

}
