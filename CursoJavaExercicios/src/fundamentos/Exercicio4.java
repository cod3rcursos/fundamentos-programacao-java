package fundamentos;

import java.util.Scanner;

public class Exercicio4 {
	/** 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. */
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		double valor = scanner.nextDouble();
		
		/** Existe tamb�m a seguinte possibilidade
		 * double quadrado = valor * valor;
		 * double cubo = valor * valor * valor;
		 */
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
		scanner.close();
	}

}