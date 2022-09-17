package lista3Funcoes;

import java.util.Scanner;

public class Quest18 {

	public static int[] organizarVetor(int vetor[]) {
		int vetorsaida[] = new int[vetor.length];
		int posicao=0,aux=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			aux=vetor[contador];
			for (int contador1 = 0; contador1 < vetor.length; contador1++) {
				if(vetor[contador1] == aux && vetor[contador1]!=0) {
					vetorsaida[posicao] = vetor[contador1];
					vetor[contador1]=0;
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
			System.out.println("Informe o número do vetor na posição " + contador + ":");
			vetor[contador] = entrada.nextInt();
		}
		
		System.out.println("Resposta: ");
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.print(organizarVetor(vetor) + " ");
		}
		
		entrada.close();
	}

}
