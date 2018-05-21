package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota = 0;
        int numeroDeNotas = 0;

        while (nota != -1) {
            nota = scanner.nextDouble();

            if (nota <= 10 && nota >= 0) {
                somaDasNotas += nota;
                numeroDeNotas++;
            }
        }
        scanner.close();
        System.out.printf("A média é %.2f", somaDasNotas / numeroDeNotas);
    }
}