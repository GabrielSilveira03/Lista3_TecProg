package lista3Funcoes;

import java.util.Scanner;

public class Quest04 {

	public static int somaElementosVetor(int vetor[]) {
		int soma=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			soma += vetor[contador];
		}
		
		return soma;
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
		
		System.out.println("Resposta: " + somaElementosVetor(vetor));
		
		entrada.close();
	}

}
