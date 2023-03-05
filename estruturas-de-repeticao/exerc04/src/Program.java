public class Program {
    public static void main(String[] args) {

        /*
        Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento
        de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa
        que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a
        população do país B, mantidas as taxas de crescimento.
         */

        int anos = 0;
        double A = 80000;
        double B = 200000;
        while (A <= B) {
            A += A * 0.03;
            B += B * 0.015;
            anos++;
        }
        System.out.printf("A = %.0f ---- B = %.0f\n", A, B);
        System.out.println("Quantidade de anos necessários para A se tornar maior que B = " + anos);
    }
}