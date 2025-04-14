/*Escrever um programa que leia o nome de um 
vendedor, o seu salário fixo e o total de 
vendas efetuadas por ele no mês (em dinheiro).
Sabendo que estevendedor ganha 15% de comissão 
sobre suas vendas efetuadas, informar o seu 
nome, o salário fixo e salário no final do mês.*/
import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        String nome;
        double salario, vendas, salariofinal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("Digite o valor do salário: ");
        salario = sc.nextInt();
        System.out.println("Digite o valor das vendas: ");
        vendas = sc.nextInt();
        sc.close();
        
        salariofinal = (vendas * 0.15) + salario;

        System.out.println("Funcionário: "+ nome);
        System.out.println("Salário final é: " + salariofinal);
    }
    
}

