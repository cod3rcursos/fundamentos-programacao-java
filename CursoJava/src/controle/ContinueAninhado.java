package controle;

public class ContinueAninhado {
	
	public static void main(String[] args) {
		externo: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					continue externo;
				}
				
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println("Fim");
	}
}
