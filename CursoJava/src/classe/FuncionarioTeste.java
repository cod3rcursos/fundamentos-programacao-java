package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("Luan", 15000, "Diretor");
		Funcionario funcionario2 = new Funcionario();

		funcionario2.nome = "Tamires";
		funcionario2.salario = 20000;
		funcionario2.funcao = "Gerente Administrativo";

		System.out.println(funcionario2.apresentar());
		System.out.println(funcionario1.apresentar());

	}
}
