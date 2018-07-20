package oo;

public class Exercicio04_Video extends Exercicio04_Midia {
	String qualidade;
	boolean telaCheia = false;
	boolean tocando = false;

	void play() {
		if (this.tocando == false) {
			this.tocando = true;
			System.out.println("Tocando arquivo!");
		} else {
			System.out.println("Arquivo já está tocando!");
		}
	}

	void pause() {
		if (this.tocando == true) {
			this.tocando = false;
			System.out.println("Parando de tocar arquivo!");
		} else {
			System.out.println("Arquivo já está sem tocar!");
		}
	}

	void telaCheia() {
		if (this.telaCheia == false) {
			this.telaCheia = true;
			System.out.println("Em tela cheia!");
		} else {
			System.out.println("Já está em tela cheia!");
		}
	}
}
