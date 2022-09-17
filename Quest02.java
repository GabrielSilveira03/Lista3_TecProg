package lista3Funcoes;

import java.util.Scanner;

public class Quest02 {

	public static int pesquisarIndice(int numero,int vetor[]) {
		for (int contador = 0; contador < vetor.length; contador++) {
			if(contador==numero) {
				return vetor[contador];
			}
		}
		return -999;
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
		
		System.out.println("Informe a posição que deseja pesquisar no vetor:");
		int indice = entrada.nextInt();
		if(pesquisarIndice(indice, vetor)==-999) {
			System.out.println("A posição informada não existe no vetor");
		} else {
			System.out.println("Resposta: " + pesquisarIndice(indice, vetor));
		}
		
		entrada.close();
	}

}
