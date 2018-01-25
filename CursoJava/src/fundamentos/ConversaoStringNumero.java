package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1? ");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota 2? ");
		System.out.println(resposta1 + resposta2);

		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		System.out.println(total / 2);
	}
}
