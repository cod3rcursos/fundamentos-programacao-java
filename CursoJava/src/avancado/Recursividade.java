package avancado;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(fatorialFor(4));
		System.out.println(fatorial(4));
	}
	
	private static int fatorialFor(int numero) {
		int fatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}
		
		return fatorial;
	}
	
	private static int fatorial(int numero) {
		if(numero <= 1) {
			return 1;
		}
		
		return numero * fatorial(numero -1);
	}

}
