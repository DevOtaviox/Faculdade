/*Faça um programa que apresente o menu abaixo 
e pare de apresenta-lo quando o usuário digitar 
a opção S.

"N. Novo arquivo
A. Abrir arquivo
F. Fechar arquivo
S. Sair"

Quando o usuário escolher N exibir 
"novo arquivo criado com sucesso!",
quando o usuário escolher A exibir 
"Abrindo arquivo!", quando o usuário
escolher F exibir "Arquivo fechado com sucesso!" 
e quando o usuário escolher
S exibir "Obrigado por utilizar o sistema!".
Obs:Utilize laço "Para" e outras estruturas 
que julgar necessárias.*/
import java.util.Scanner;

public class MenuArquivo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for( ; ; ){
			System.out.println(" Digite: N Novo arquivo \n Digite: A Abrir arquivo \n Digite: F Fechar arquivo \n Digite: S Para sair" );
			System.out.print("Digite sua opção:");
			char escolha = sc.next().toUpperCase().charAt(0);
			if (escolha == 'N') {
				System.out.println("Novo arquivo criado com sucesso!");
			} else if (escolha == 'A') {
				System.out.println("Abrindo arquivo!");
			} else if (escolha == 'F') {
				System.out.println("Arquivo fechado com sucesso!");
			} else if (escolha == 'S') {
				System.out.println("Obrigado pr utilizar o sistema!");
				break;
			} else{
				System.out.println("Opção incorreta.");
			}			
		}
		sc.close();
	}
	
}