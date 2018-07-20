package oo;

public class Exercicio02_ContaPoupança extends Exercicio02_Conta {

	double juros;

	public Exercicio02_ContaPoupança(int agencia, int conta, String titular, double juros) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.juros = juros;
	}
}
