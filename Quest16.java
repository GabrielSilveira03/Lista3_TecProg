package lista3Funcoes;

import java.util.Scanner;

public class Quest16 {

	public static void polarizarVetor(int vetor[]) {
		int posicaomin=0,posicaomax=(vetor.length-1);
		int vetoraux[] = new int[vetor.length];
		for (int contador = 0; contador < vetor.length; contador++) {
			vetoraux[contador] = vetor[contador];
		}
		for (int contador = 0; contador < vetoraux.length; contador++) {
			if(vetoraux[contador]%2!=0) {
				vetor[posicaomin] = vetoraux[contador];
				posicaomin++;
			} else {
				if(vetoraux[contador]%2==0 || vetoraux[contador]==0) {
					vetor[posicaomax] = vetoraux[contador];
					posicaomax--;
				}
			}
		}
		
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
		
		polarizarVetor(vetor);
		
		System.out.println("Resposta: ");
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.print((vetor)[contador] + " ");
		}

		
		entrada.close();
	}

}
