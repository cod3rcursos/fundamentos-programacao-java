package colecoes;

public class Exercicio05b {
	/**
	 * Ordene uma lista de inteiros com os seguintes algoritmos de ordenação:
	 * Selection Sort;
	 */

	void sort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int min = i;

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		Exercicio05b ob = new Exercicio05b();
		int arr[] = { 64, 25, 12, 22, 11 };
		ob.sort(arr);
		System.out.println("Array Selection Sort");
		ob.printArray(arr);
	}

}
