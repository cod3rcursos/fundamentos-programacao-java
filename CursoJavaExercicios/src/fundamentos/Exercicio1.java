package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	
	/** 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = celsius * 1.8 + 32;
		
		System.out.print("Valor em Farenheit: " + conversao);
		
		scanner.close();
	}

}
