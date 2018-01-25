package fundamentos;

public class ObjetosPrimitivos {

	public static void main(String[] args) {
		/*Um pritivo se transforma em objeto quando esctrito com a primeira letra maiscula
		 *Exemplo:
		 *boolean -> Primitivo
		 *Boolean -> Objeto primitivo
		 *
		 *Com exeção do char e do int que ficam:
		 *char -> Character 
		 *int -> Integer
		 */
		Character c = 'a';
		Boolean bo = true;
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		Float f = 5.1f;
		Double d = 6.1;
		
		//Converte o booleano para string e conta a quatidade de caracteres:
		System.out.println(bo.toString().length());
		
		
	}
}
