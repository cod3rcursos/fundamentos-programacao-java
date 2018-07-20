package classes;

import java.util.Scanner;

/**
 * 4. Crie uma função que recebe um número como argumento e retorna os números
 * "Primos" até ele.
 */
public class Exercicio04 {

	private static boolean ehPrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();
		
		for (int i = 2; i <= numero; i++) {
			if (ehPrimo(i))
				System.out.println(i + " é primo.");
		}
		
		scanner.close();
	}
}
