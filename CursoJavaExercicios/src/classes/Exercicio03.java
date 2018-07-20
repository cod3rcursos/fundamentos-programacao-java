package classes;

import java.util.Scanner;

/**
 * 3. Crie uma função que calcule a sequência de fibonacci. Desafio: Tente
 * fazer de forma recursiva!
 */
public class Exercicio03 {

	static int n1 = 0, n2 = 1, n3 = 0;

	static void imprimirFibonacci(int contador) {
		if (contador > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			imprimirFibonacci(contador - 1);
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para o contador: ");
		int contador = scanner.nextInt();

		System.out.print(n1 + " " + n2);
		imprimirFibonacci(contador - 2);

		scanner.close();
	}
}
