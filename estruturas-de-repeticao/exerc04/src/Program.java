public class Program {
    public static void main(String[] args) {

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