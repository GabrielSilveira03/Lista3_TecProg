package lista3Funcoes;

import java.util.Scanner;

public class Quest08 {

	public static int somaElementosVetor(int vetor[]) {
		int soma=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			soma += vetor[contador];
		}
		
		return soma;
	}
	
	public static int[] priorizarVetor(int vetor[]) {
		int vetoraux[] = new int[vetor.length];
		float media=0;
		int contador1=1;
		for (int contador = 0; contador < vetor.length; contador++) {
			if((somaElementosVetor(vetoraux)+vetor[contador])/(float)(contador1) > media) {
				media = (somaElementosVetor(vetoraux)+vetor[contador])/(float)(contador1);
				vetoraux[contador1-1]=vetor[contador];  
				contador1++;
			}
		}
		
		int vetorsaida[] = new int[contador1-1];
		for (int contador = 0; contador < vetorsaida.length; contador++) {
			vetorsaida[contador] = vetoraux[contador];
		}
		
		return vetorsaida;
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
		
		System.out.println("Resposta: ");
		for (int contador = 0; contador < priorizarVetor(vetor).length; contador++) {
			System.out.print(priorizarVetor(vetor)[contador] + " ");
		}
		
		entrada.close();
	}
}
