package lista3Funcoes;

import java.util.Scanner;

public class Quest01 {

	public static int pesquisarNumero(int numero,int vetor[]) {
		for (int contador = 0; contador < vetor.length; contador++) {
			if(vetor[contador]==numero) {
				return contador;
			}
		}
		return -100;
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe de que tamanho será o vetor:");
		int tamanho = entrada.nextInt();
		
		int vetor[] = new int[tamanho];
		for (int contador = 0; contador < tamanho; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + ":");
			vetor[contador] = entrada.nextInt();
		}
		
		System.out.println("Informe o número que deseja pesquisar no vetor:");
		int numero = entrada.nextInt();
		System.out.println("Resposta: " + pesquisarNumero(numero, vetor));
		
		entrada.close();
	}

}
