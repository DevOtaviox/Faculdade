/*Escrever um programa que leia o nome de um 
aluno e as notas das três provas que ele obteve
no semestre. No final informar o nome do aluno 
e a sua média (aritmética).*/

import java.util.Scanner;


public class CalcularMedia {
    public static void main(String[] args) {
        double n1, n2, n3, media;
        String nome;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite a nota da primeira prova: ");
        n1 = sc.nextInt();
        System.out.println("Digite a nota da segunda prova: ");
        n2 = sc.nextInt();
        System.out.println("Digite a nota da terceira prova: ");
        n3 = sc.nextInt();
        media = (n1 + n2 + n3)/3;
        System.out.println("Aluno: " + nome);
        System.out.println("A média da sua nota é: "+ media);
        sc.close();
    }
    
}