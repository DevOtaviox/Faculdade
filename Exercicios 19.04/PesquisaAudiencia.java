import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PesquisaAudiencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> audiencia = new HashMap<>();
        int totalPessoas = 0;

        while (true) {
            System.out.print("Digite o número do canal (0 para encerrar): ");
            int canal = scanner.nextInt();
            if (canal == 0) break;

            System.out.print("Digite o número de pessoas assistindo: ");
            int pessoas = scanner.nextInt();

            audiencia.put(canal, audiencia.getOrDefault(canal, 0) + pessoas);
            totalPessoas += pessoas;
        }

        System.out.println("Porcentagem de audiência por canal:");
        for (Map.Entry<Integer, Integer> entry : audiencia.entrySet()) {
            int canal = entry.getKey();
            int quantidade = entry.getValue();
            double porcentagem = (double) quantidade / totalPessoas * 100;
            System.out.printf("Canal %d: %.2f%%\n", canal, porcentagem);
        }

        scanner.close();
    }
}

