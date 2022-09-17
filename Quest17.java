package lista3Funcoes;

import java.util.Scanner;

public class Quest17 {

	public static int somaElementosVetor(int vetor[]) {
		int soma=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			soma += vetor[contador];
		}
		
		return soma;
	}
	
	public static int[] explosaoVetor(int vetor[]) {
		int vetorsaida[] = new int[somaElementosVetor(vetor)];
		int indice=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			for (int contador2 = 0; contador2 < vetor[contador]; contador2++) {
				vetorsaida[indice] = vetor[contador];
				indice++;
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
			System.out.println("Informe o número do vetor na posição " + contador + ":");
			vetor[contador] = entrada.nextInt();
		}
		
		System.out.println("Resposta: ");
		for (int contador = 0; contador < explosaoVetor(vetor).length; contador++) {
			System.out.print(explosaoVetor(vetor)[contador] + " ");
		}
		
		entrada.close();

	}

}
