package lista3Funcoes;

import java.util.Scanner;

public class Quest07 {

	public static int inverterVetor(int vetor1[],int vetor2[]){
		int menorvetor=0;
		if(vetor1.length<=vetor2.length) {
			menorvetor = vetor1.length;
		} else {
			menorvetor = vetor2.length;
		}
		int vetoraux[] = new int[menorvetor];
		for (int contador = 0; contador < vetoraux.length; contador++) {
			vetoraux[contador] = vetor1[contador];
		}
		for (int contador = 0; contador < vetoraux.length; contador++) {
			vetor1[contador] = vetor2[contador];
		}
		for (int contador = 0; contador < vetoraux.length; contador++) {
			vetor2[contador] = vetoraux[contador];
		}
		
		return menorvetor;
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
		
		int tamanho = inverterVetor(vetor1,vetor2);
		
		System.out.println("Resposta: ");
		System.out.println("\nVetor1:");
		for (int contador = 0; contador < tamanho; contador++) {
			System.out.print(vetor1[contador] + " ");
		}
		System.out.println("\nVetor2:");
		for (int contador = 0; contador < tamanho; contador++) {
			System.out.print(vetor2[contador] + " ");
		}
		
		entrada.close();
		
	}

}
