package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		// Operador OU
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		// Operadorador E
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		// Operador OU exclusivo (Apenas se ou 2 forem verdadeiros)
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = " + comprouSorvete);
		System.out.println("TV 50 = " + comprouTv50);
		System.out.println("TV 32 = " + comprouTv32);
		
		// Operador unário intruso
		System.out.println("Fome = " + !comprouSorvete);
		
	}
}
