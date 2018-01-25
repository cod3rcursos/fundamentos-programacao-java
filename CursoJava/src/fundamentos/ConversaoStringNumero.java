package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1? ");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota 2? ");
		//Como é uma String, o operador de soma esta apenas concatenando
		//Para de fato somar, precisamos converter a String para um double
		System.out.println(resposta1 + resposta2);
		
		// Converter string para double
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		// Cada tipo primitivo tem um metodo parse para converter um string para um primitivo 
		double total = nota1 + nota2;
		System.out.println(total /2);
		
		
		
	}
}
