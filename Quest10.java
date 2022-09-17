package lista3Funcoes;

import java.util.Scanner;

public class Quest10 {

	public static int[] compactarVetor(int vetor[]) {
		int tamanhovetsaida=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			if(contador>0) {
				if (vetor[contador]!=vetor[contador-1]) {
					tamanhovetsaida++;
				}
			}
		}
		tamanhovetsaida = (tamanhovetsaida+1)*2;
		int vetorsaida[] = new int[tamanhovetsaida];
		int quantidade=1,indice=0;
		for (int contador = 0; contador < vetor.length; contador++) {
			if(contador>0) {
				if(vetor[contador] != vetor[contador-1]) {
					if(contador<vetor.length-1) { 
						indice+=2;
						vetorsaida[indice] = vetor[contador];
						vetorsaida[indice-1] = quantidade;
						quantidade=1;
					} else {
						indice+=2;
						vetorsaida[indice] = vetor[contador];
						vetorsaida[indice-1] = quantidade;
						quantidade=1;
						indice++;
						vetorsaida[indice] = quantidade;
					}
				} else {
					if(contador == vetor.length-1) {
						indice++;
						quantidade++;
						vetorsaida[indice] = quantidade;
					}
					quantidade++;
				}
			} else {
				vetorsaida[indice] = vetor[contador];
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
			System.out.println("Informe o número do vetor(de zero e uns) na posição " + contador + ":");
			vetor[contador] = entrada.nextInt();
		}
		
		for (int contador = 0; contador < compactarVetor(vetor).length; contador++) {
			System.out.print(compactarVetor(vetor)[contador] + " ");
		}
		
		
		entrada.close();
	}
}
