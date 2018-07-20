package classes;

import java.util.Scanner;

/**
 * 5. Valor Perfeito: Um número é considerado perfeito quando a soma dos seus
 * divisores – exceto ele – resulta o seu valor. Ex: 6 = 1 + 2 + 3 Crie uma
 * função que recebe como parâmetro um número e identifique se o número é
 * perfeito ou não.
 */
public class Exercicio05 {

	static void perfeitoOuNao(int num) {
		int dobro = 2 * num;
		int soma = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				soma = soma + i;
			}
		}

		if (soma == dobro) {
			System.out.printf("%d é um numero perfeito", num);
		} else {
			System.out.printf("%d não é um numero perfeito", num);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int num = scanner.nextInt();

		perfeitoOuNao(num);

		scanner.close();

	}

}
