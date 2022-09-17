package lista3Funcoes;

import java.util.Scanner;

public class Quest19 {

	public static void agruparVetor(int vetor[], int numero) {
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.print(vetor[contador] + " ");
			if((contador+1) % numero == 0 || contador == 0) {
				System.out.println();
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

		System.out.println("Informe o númeor de agrupamento desejado:");
		int agrupamento = entrada.nextInt();
		
		agruparVetor(vetor, agrupamento);
		
		entrada.close();
	}

}
