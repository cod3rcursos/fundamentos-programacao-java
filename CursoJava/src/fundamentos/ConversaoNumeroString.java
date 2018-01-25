package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//Objeto primitivo
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		//Tipo primitivo
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		//Seria igual ao exemplo abaixo:
		System.out.println(("" + num2).length());
	}
}
