package lista3Funcoes;

import java.util.Scanner;

public class Quest06 {

	public static int[] inverterVetor(int vetor[]) {
		int vetorInvertido[] = new int[vetor.length];
		for (int contador = 0; contador < vetorInvertido.length; contador++) {
			vetorInvertido[contador] = vetor[(vetor.length-1)-contador];
		}
		
		return vetorInvertido;
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
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.print(inverterVetor(vetor)[contador] + " ");
		}
		
		entrada.close();
	}

}
