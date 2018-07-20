package oo;

public class Exercicio01_Carro extends Exercicio01_Veiculo {

	void mover() {
		System.out.println("Sua distancia era: " + this.distancia);
		this.distancia += 2;
		System.out.println("Sua distancia é: " + this.distancia);
	}

	void ligar() {
		if (this.ligado == false) {
			this.ligado = true;
			System.out.println(this.nomeDoVeiculo + " está ligado!");
		} else {
			System.out.println("O veiculo já está ligado!");
		}
	}
}
