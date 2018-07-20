package classes;

import java.util.Scanner;

/**
 * 9. Crie uma classe TrocaNumero que contenha um método que receba dois
 * números, NumA e NumB ( nessa ordem ), e imprima na ordem inversa, isto é, se
 * NumA = 5 e NumB = 10, por exemplo, devem ser impressos na ordem NumA = 10 e
 * NumB = 5.
 */
public class Exercicio09 {

	public static void inversao(int a, int b) {
		int reserva = a;
		a = b;
		b = reserva;
		System.out.printf("\n\nAgora seu numA é: %d", a);
		System.out.printf("\nAgora seu numB é: %d", b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numA: ");
		int numA = scanner.nextInt();

		System.out.printf("\nSeu numA é: %d", numA);

		System.out.println("\n\nDigite o numB: ");
		int numB = scanner.nextInt();

		System.out.printf("\nSeu numB é: %d", numB);

		inversao(numA, numB);

		scanner.close();
	}

}
