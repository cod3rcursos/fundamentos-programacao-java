package classe;

public class Calculadora { //Classe para demonstrar todos os tipos de metodos
	double resultado;
	
	double somar(double a, double b) { // Recebe parametro e tem um retorno
		resultado = a + b;
		return resultado;
	}
	
	void acrescentar(double a) { // Recebe parametro e não tem retorno
		resultado += a;
	}
	
	double obterResultado() { // Não recebe parametro mas tem retorno
		return resultado;
	}
	
	void limpar() { // Não recebe parametro e não tem retorno 
		resultado = 0;
	}
	
}
