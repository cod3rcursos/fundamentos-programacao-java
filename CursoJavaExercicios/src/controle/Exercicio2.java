package controle;

import java.util.Scanner;

public class Exercicio2 {
	/** 2. Criar um programa informa se o ano atual é um ano bissexto; */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();

		int bissextoTest1 = ano % 4;

		int bissextoTest2 = ano % 100;

		int bissextoTest3 = ano % 400;

		if (bissextoTest3 == 0 || (bissextoTest1 == 0 && bissextoTest2 != 0)) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();
	}

}
