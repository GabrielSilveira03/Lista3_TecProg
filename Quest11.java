package lista3Funcoes;

import java.util.Scanner;

public class Quest11 {

	public static int[] descompactarVetor(int vetor[]) {
		int tamanho=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			if(contador%2!=0 && contador>0) {
				tamanho += vetor[contador];
			}
		}
		int vetorsaida[] = new int[tamanho];
		int posicao=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			if(contador%2!=0) {
				for (int contador1 = 0; contador1 < vetor[contador]; contador1++) {
					vetorsaida[posicao] = vetor[contador-1];
					posicao++;
				}
			}
		}
		
		return vetorsaida;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe de que tamanho será o vetor:");
		int tamanho = entrada.nextInt();
		
		int vetor[] = new int[tamanho];
		for (int contador = 0; contador < tamanho; contador++) {
			System.out.println("Informe o número do vetor(necessário ser um vetor compactado) na posição " + contador + ":");
			vetor[contador] = entrada.nextInt();
		}
		
		for (int contador = 0; contador < descompactarVetor(vetor).length; contador++) {
			System.out.print(descompactarVetor(vetor)[contador] + " ");
		}
		
		
		entrada.close();

	}

}
