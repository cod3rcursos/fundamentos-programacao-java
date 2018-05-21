package classe;

public class Calculadora {
	
	double resultado;
	
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;	
	}
	
	void acrescentar(double a) {
		resultado += a;
	}
	
	double obterResultado() {
		return resultado;
	}
	
	void limpar() {
		resultado = 0;
	}
}
