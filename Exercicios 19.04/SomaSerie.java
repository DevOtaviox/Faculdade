public class SomaSerie {
    public static void main(String[] args) {
        double soma = 0;

        for (int i = 1; i <= 50; i++) {
            double termo = (1000 - (997 * (i - 1))) / i;
            soma += (i % 2 == 0) ? -termo : termo; // Alterna entre adição e subtração
        }

        System.out.printf("Soma dos 50 primeiros termos: %.2f\n", soma);
    }
}



