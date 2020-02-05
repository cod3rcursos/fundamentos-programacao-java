package controle;

import java.util.Scanner;

public class Exercicio9 {
	/**
	 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um numero: ");
			int valor = scanner.nextInt();

			//Recebe obrigatoriamente o primeiro valor digitado pelo usuário
			if(contador == 0){  
				maiorValor = valor;
			}
				
			else if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();
	}

}
