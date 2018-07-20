package colecoes;

public class Exercicio04 {
	/**
	 * 4. Crie um programa que realize a intersecção entre 2 vetores e armazene
	 * esses valores em um novo vetor;
	 */

	public static void main(String[] args) {
		int vetorA[] = { 1, 2, 3, 4, 5 };
		int vetorB[] = { 4, 5, 6, 7, 8 };
		int aib[] = new int[(vetorA.length + vetorB.length) / 2];

		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					aib[i] = vetorA[i];
					System.out.print("AIB " + aib[i] + " | ");
					break;
				}
			}
		}
	}
}
