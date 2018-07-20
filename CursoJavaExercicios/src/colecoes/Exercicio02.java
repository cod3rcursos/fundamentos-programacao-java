package colecoes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio02 {
	/** 2. Inverta a ordem dos valores de um vetor; */

	public static void main(String[] args) {

		String[] array = new String[] { "Felipe", "Luis", "Camila", "Anderson", "Flavio" };
		List<String> lista = Arrays.asList(array);
		Collections.reverse(lista);
		System.out.println(lista);

	}
}
