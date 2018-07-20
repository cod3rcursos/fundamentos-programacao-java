package classes;

public class Exercicio14 {
	/**
	 * 8. Modele uma classe Produto com os seguintes atributos: Nome do produto,
	 * Preço do produto, Id do produto e Desconto a ser aplicado no produto. Crie
	 * um método que calcule o preço do produto com desconto. Realize um reajuste
	 * no atributo Desconto de forma que altere o desconto em todos os outros
	 * produtos.
	 */

	String nomeDoProduto;
	double precoDoProduto;
	int idDoProduto;
	static double descontoDoProduto = 0.8;

	public void calcDesc() {
		double precoComDesconto = this.precoDoProduto * descontoDoProduto;
		System.out.println("Preco com Desconto: " + precoComDesconto);
	}

	public static void main(String[] args) {
		Exercicio14 produto = new Exercicio14();
		produto.precoDoProduto = 17.2;
		produto.calcDesc();

	}
}
