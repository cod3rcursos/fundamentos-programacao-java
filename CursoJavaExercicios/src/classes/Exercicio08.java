package classes;

/**
 * 8. Crie uma classe ParImpar que contenha um método que imprima em tela a soma
 * dos números pares de 0 a 30 e a multiplicação dos números ímpares de 0 a 30.
 */
public class Exercicio08 {

	public static void sumImparMultiPar() {
		long par = 0;
		int impar = 0;

		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				if (i > 2) {
					par = par * i;
				} else {
					par = i;
				}
			} else {
				impar = impar + i;
			}
		}

		System.out.println(par);
		System.out.println(impar);
	}

	public static void main(String[] args) {
		sumImparMultiPar();
	}

}
