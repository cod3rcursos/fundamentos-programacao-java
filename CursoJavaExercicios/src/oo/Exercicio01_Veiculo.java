package oo;

public class Exercicio01_Veiculo {
	/**
	 * 1. Criar uma classe Veículo com os métodos: mover(), ligar() Adicione na
	 * classe os seguintes atributos: Tipo do Veículo, Nome do Veículo. Criar o
	 * construtor da classe Veículo. Criar as subclasses: Avião e Carro. As
	 * subclasses devem sobrescrever os métodos da classe Veículo.
	 */

	String tipoDeVeiculo;
	String nomeDoVeiculo;
	int distancia = 0;
	boolean ligado = false;

	public Exercicio01_Veiculo() {

	}

	void mover() {
		System.out.println("Sua distancia era: " + this.distancia);
		this.distancia++;
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