import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String codigo;
    String nome;
    double valorUnitario;
    String tipoUnidade;

}

public class LojinhaAbu {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Alterar produto");
            System.out.println("3. Excluir produto");
            System.out.println("4. Realizar venda");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Lógica para cadastrar produto
                    break;
                case 2:
                    // Lógica para alterar produto
                    break;
                case 3:
                    // Lógica para excluir produto
                    break;
                case 4:
                    // Lógica para realizar venda
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
