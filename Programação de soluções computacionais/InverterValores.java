/*Ler dois valores para as variáveis A e B, e 
efetuar as trocas dos valores de forma que a 
variável A passe a possuir o valor da variável 
B e a variável B passe a possuir o valor da 
variável A. Apresentar os valores trocados.*/
import java.util.Scanner;

public class InverterValores {
    public static void main(String[] args) {
        int a, b, invetA, invertB;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro para A: ");
        a = sc.nextInt();
        System.out.println("Digite um numero inteiro para B: ");
        b = sc.nextInt();
        sc.close();
        invetA = b;
        invertB = a;
        System.out.println("O numero invertido de A: " + invetA);
        System.out.println("O numero invertido de B: " + invertB);
    }
    
}