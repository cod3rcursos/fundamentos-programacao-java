package oo;

public class Exercicio04_Foto extends Exercicio04_Midia {
	String extensao;
	boolean mostrar = false;

	void Mostrar() {
		if (mostrar == false) {
			mostrar = true;
			System.out.println("Mostrando a foto!");
		} else {
			System.out.println("A foto já está aparecendo!");
		}
	}

}
