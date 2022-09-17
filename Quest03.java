package lista3Funcoes;

import java.util.Scanner;

public class Quest03 {

	public static void separaVetor(int vetor[]) {
		int posicaomin=0,posicaomax=(vetor.length-1);
		int vetoraux[] = new int[vetor.length];
		for (int contador = 0; contador < vetor.length; contador++) {
			vetoraux[contador] = vetor[contador];
		}
		for (int contador1 = 0; contador1 < vetor.length; contador1++) {
			if(vetoraux[contador1]<0) {
				vetor[posicaomin]=vetoraux[contador1];
				posicaomin++;
			}else{
				if(vetoraux[contador1]>=0) {
					vetor[posicaomax]=vetoraux[contador1];
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
		
		separaVetor(vetor);
		
		System.out.println("Resposta: ");
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.print((vetor)[contador] + " ");
		}
		
		entrada.close();

	}

}
