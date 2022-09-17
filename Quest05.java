package lista3Funcoes;

import java.util.Scanner;

public class Quest05 {

	public static int[] juntarVetor(int vetor1[],int vetor2[]) {
		int juncao[] = new int[vetor1.length+vetor2.length];
		for (int contador1 = 0; contador1 < vetor1.length; contador1++) {
			juncao[contador1] = vetor1[contador1];
		}
		for (int contador2 = 0; contador2 < vetor2.length; contador2++) {
			juncao[contador2+vetor1.length] = vetor2[contador2];
		}
		return juncao;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe de que tamanho será o vetor 1:");
		int tamanho1 = entrada.nextInt();
		System.out.println("Informe de que tamanho será o vetor 2:");
		int tamanho2 = entrada.nextInt();
		
		int vetor1[] = new int[tamanho1];
		for (int contador = 0; contador < tamanho1; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + " do vetor 1:");
			vetor1[contador] = entrada.nextInt();
		}
		
		int vetor2[] = new int[tamanho2];
		for (int contador = 0; contador < tamanho2; contador++) {
			System.out.println("Informe o número do vetor na posição " + contador + " do vetor 2:");
			vetor2[contador] = entrada.nextInt();
		}
		
		System.out.println("Resposta: ");
		for (int contador = 0; contador < vetor1.length+vetor2.length; contador++) {
			System.out.print(juntarVetor(vetor1, vetor2)[contador] + " ");
		}
		
		entrada.close();
	}

}
