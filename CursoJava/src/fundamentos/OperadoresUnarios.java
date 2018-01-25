package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		num1++;
		System.out.println(num1);
		--num1;
		System.out.println(num1);

		System.out.println(++num1 == num2--);
		System.out.println(num1 == num2);

		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));

		System.out.println(!true);
	}
}
