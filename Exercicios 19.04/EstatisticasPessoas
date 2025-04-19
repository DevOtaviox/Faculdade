import java.util.Scanner;

public class EstatisticasPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];
        double[] pesos = new double[10];
        double[] alturas = new double[10];
        int totalAcima90kg = 0;
        int totalEntre10e30 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Digite o peso da pessoa " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();

            if (pesos[i] > 90 && alturas[i] < 1.5) {
                totalAcima90kg++;
            }
        }

        double mediaIdades = 0;
        for (int idade : idades) {
            mediaIdades += idade;
        }
        mediaIdades /= 10;

        for (int i = 0; i < 10; i++) {
            if (idades[i] >= 10 && idades[i] <= 30 && alturas[i] > 1.9) {
                totalEntre10e30++;
            }
        }

        System.out.printf("Média das idades: %.2f\n", mediaIdades);
        System.out.println("Total de pessoas com mais de 90kg e altura inferior a 1,50m: " + totalAcima90kg);
        System.out.printf("Porcentagem de pessoas entre 10 e 30 anos que medem mais de 1,90m: %.2f%%\n", 
            (double) totalEntre10e30 / 10 * 100);

        scanner.close();
    }
}

