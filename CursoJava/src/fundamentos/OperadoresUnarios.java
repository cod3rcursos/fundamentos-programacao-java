package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		// Incremento e decremento
		num1++; //Acrecenta +1 na variavel (tambem poderia ser escrito como ++num1
		System.out.println(num1);
		--num1;
		System.out.println(num1);
			
		//Neste caso o valor de num2 so mudou depois da comparação (pós-fixado), por isso o resultado deu true
		System.out.println(++num1 == num2--);
		System.out.println(num1 == num2);
		
		// Complemento binário
		System.out.println(Integer.toBinaryString(50));
		// o til (~) faz o complemento binario (inverte os bits)
		System.out.println(Integer.toBinaryString(~50));
		
		// Negacao
		System.out.println(!true);
		
	}
}
