package oo;

public class Exercicio03_Zoologico {
	
	public static void main(String[] args) {
		Exercicio03_Leao leao = new Exercicio03_Leao("Leao", 200, "Rawr");
		Exercicio03_Macaco macaco = new Exercicio03_Macaco("Macaco", 100, "Uh-uh-uh");
		Exercicio03_Lobo lobo = new Exercicio03_Lobo("Leao", 80, "Auuuuuu");
		
		leao.som();
		macaco.som();
		lobo.som();
	}
}
