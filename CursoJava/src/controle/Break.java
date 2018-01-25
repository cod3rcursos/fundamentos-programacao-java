package controle;

public class Break {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if(i == 2) {
				break; // O break nunca esta relaciodado à estrutura de repetição 'if'.
			}
			
			System.out.println(i);
		}
		System.out.println("FIM");
	}
}
