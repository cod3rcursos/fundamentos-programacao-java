package fundamentos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = scanner.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = scanner.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = scanner.nextInt();

		int delta = (b * b) - (4 * a * c);

		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta é: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		scanner.close();
	}

}
