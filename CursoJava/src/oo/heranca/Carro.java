package oo.heranca;

public class Carro {
	
	protected int VELOCIDADE_MAXIMA = 200;
	private int velocidadeAtual = 0;
	
	protected final void acelerarMais(int velocidade) {
		if (velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += velocidade;
		}
	}
	
	protected final void frearMais(int velocidade) {
		if(velocidadeAtual - velocidade < 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= velocidade;
		}
	}
	
	public void acelerar() {
		acelerarMais(5);
	}
	
	public void frear() {
		frearMais(5);
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
}
