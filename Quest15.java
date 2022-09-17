package lista3Funcoes;

import java.util.Scanner;

public class Quest15 {

	public static int[] complementarVetor(int vetor1[],int vetor2[]) {
		int vetorsaida[] = new int[vetor1.length];
		for (int contador = 0; contador < vetor1.length; contador++) {
			vetorsaida[contador] = 10-(vetor1[contador]+vetor2[contador]); 
		}
		
		return vetorsaida;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe de que tamanho serão os dois vetores:");
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

		for (int contador = 0; contador < vetor1.length; contador++) {
			System.out.print(complementarVetor(vetor1, vetor2)[contador] + " ");
		}
		
		entrada.close();
	}

}
