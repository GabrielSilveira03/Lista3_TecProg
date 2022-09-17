package lista3Funcoes;

import java.util.Scanner;

public class Quest14 {

	public static void contagemCaracter(String mensagem) {
		int quantidade=0;
		char vetor[] = new char[mensagem.length()];
		mensagem.getChars(0, mensagem.length(), vetor, 0);
		char vetaux[] = new char[mensagem.length()];
		for (int contador = 0; contador < vetaux.length; contador++) {
			vetaux[contador] = vetor[contador];
		}
		
		for (int contador = 0; contador < vetor.length; contador++) {
			quantidade=0;
			for (int contador1 = 0; contador1 < vetor.length; contador1++) {
				if( vetor[contador] == vetaux[contador1] && vetaux[contador1] != '0') {
					quantidade++;
					vetaux[contador1] = '0';
				}
			}
			if(quantidade>0) {
				System.out.print(vetor[contador] + " = " + quantidade + " - ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		String mensagem = new String();
		System.out.println("Informe a string que deseja contar seus caracteres:");
		mensagem = entrada.nextLine();
		
		contagemCaracter(mensagem);
		
		entrada.close();
	}

}
