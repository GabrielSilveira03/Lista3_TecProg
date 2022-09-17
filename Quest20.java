package lista3Funcoes;

import java.util.Scanner;

public class Quest20 {

	public static int[] diferencaVetor(int vetor1[],int vetor2[]) {
		int vetoraux[] = new int[vetor1.length];
		int posicao=0,contador2=0;
		for (int contador = 0; contador < vetor1.length; contador++) {
			contador2=0;
			for (int contador1 = 0; contador1 < vetor1.length; contador1++) {
				if(vetor1[contador] != vetor2[contador1]) {
					contador2++;
				}
			}
			
			if(contador2 == vetor1.length) {
				vetoraux[posicao] = vetor1[contador];
				posicao++;
			}
		}
		int vetorsaida[] = new int[posicao];
		for (int contador = 0; contador < posicao; contador++) {
			vetorsaida[contador] = vetoraux[contador];
		}
		
		return vetorsaida;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe de que tamanho serão o vetores:");
		int tamanho = entrada.nextInt();

		int vetor1[] = new int[tamanho];
		for (int contador = 0; contador < tamanho; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + " do vetor 1:");
			vetor1[contador] = entrada.nextInt();
		}
		
		int vetor2[] = new int[tamanho];
		for (int contador = 0; contador < tamanho; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + " do vetor 2:");
			vetor2[contador] = entrada.nextInt();
		}
		
		for (int contador = 0; contador < diferencaVetor(vetor1, vetor2).length; contador++) {
			System.out.print(diferencaVetor(vetor1, vetor2)[contador] + " ");
		}
		
		entrada.close();
	}

}
