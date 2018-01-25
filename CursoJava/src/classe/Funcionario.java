package classe;

public class Funcionario {

	String nome;
	double salario;
	String funcao;
	
	Funcionario(){
		
	}
	Funcionario(String n,double s,String f){
		nome = n;
		salario = s;
		funcao = f;
	}
	
	String apresentar() {
		return String.format("Nome: " + nome + "\nSalario: " + salario + "\nFunção: " + funcao + "\n");
		
	}
}
