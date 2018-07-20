package oo;

public class Exercicio04_Musica extends Exercicio04_Midia {
	String artista;
	String album;
	String genero;
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

}
