package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        /*
        Altere o programa anterior (EXERC04) permitindo ao usuário
        informar as populações e as taxas de crescimento
        iniciais. Valide a entrada e permita repetir a
        operação.
         */
        Scanner sc = new Scanner(System.in);
        char resposta;
        do {
            int anos = 0;
            System.out.print("Digite a população inicial do país A: ");
            double A = sc.nextDouble();
            System.out.print("Digite a população inicial do país B: ");
            double B = sc.nextDouble();
            while (A >= B) {
                System.out.println("Valor de B deve ser maior que o de A, digite novamente os valores: ");
                System.out.print("Digite a população inicial do país A: ");
                A = sc.nextDouble();
                System.out.print("Digite a população inicial do país B: ");
                B = sc.nextDouble();
            }

            System.out.print("Digite a taxa de crescimento da população A (%): ");
            double taxaCrescimentoA = sc.nextDouble();
            System.out.print("Digite a taxa de crescimento da população B (%): ");
            double taxaCrescimentoB = sc.nextDouble();

            while (A <= B) {
                A += A * taxaCrescimentoA / 100;
                B += B * taxaCrescimentoB / 100;
                anos++;
            }
            System.out.printf("A = %.0f ---- B = %.0f\n", A, B);
            System.out.println("Quantidade de anos necessários para A se tornar maior que B = " + anos);
            System.out.print("Deseja fazer mais uma operação? (s/n) ");
            resposta = sc.next().charAt(0);
        }
        while(resposta == 'S' || resposta == 's');
        System.out.println("Programa encerrado.");
        sc.close();

    }
}
