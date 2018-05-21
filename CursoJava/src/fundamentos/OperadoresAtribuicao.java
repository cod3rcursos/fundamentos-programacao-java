package fundamentos;

public class OperadoresAtribuicao {

    public static void main(String[] args){
        int a = 7;
        int b = 3;

        b += a; // b = b + a
        b *= 4; // b = b * 4
        b /= 2; // b = b / 2
        b -= 2; // b = b - 2
        // b %= 2; 

        System.out.println(b);
    }
}