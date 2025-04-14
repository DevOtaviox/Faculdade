/*Faça um programa que imprima todos os 
resultados da tabuada de 5. Utilize laço "enquanto" 
e outras estruturas que julgar necessárias.*/


public class Tabuada {
	public static void main(String[] args) {
		int num, cont, result;
		num = 5;
		cont = 1;
		while (cont <= 10) {
			result = num * cont;
			System.out.println(num + " x " + cont + " = " + result);
			cont++;
		}
	}
	
}