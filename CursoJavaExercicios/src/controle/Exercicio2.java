package controle;

import java.util.Scanner;

public class Exercicio2 {
	/** 2. Criar um programa informa se o ano atual é um ano bissexto; */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();

		/**
		 * 1. De 4 em 4 anos é ano bissexto.
		 * 2. De 100 em 100 anos não é ano bissexto.
         * 3. De 400 em 400 anos é ano bissexto.
         * 4. Prevalecem as últimas regras sobre as primeiras.
         * 
         * https://pt.wikipedia.org/wiki/Ano_bissexto
		 */
		
		int bissextoTest1 = ano % 4;
		int bissextoTest2 = ano % 100;
		int bissextoTest3 = ano % 400;

		if (bissextoTest3 == 0 || ( bissextoTest1 == 0 && bissextoTest2 != 0 ) ) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();
	}

}
