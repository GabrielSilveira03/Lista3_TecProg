package lista3Funcoes;

import java.util.Scanner;

public class Quest12 {

	public static char[] criptografarVetor(String vetor) {
		String criptografia = "%*(-+@#123456789{}!&$?:";
		char resultado[] = new char[vetor.length()];
		char vetcripto[] = new char[criptografia.length()];
		char vetentrada[] = new char[vetor.length()];
		vetor.getChars(0, vetor.length(), vetentrada, 0);
		criptografia.getChars(0, criptografia.length(), vetcripto, 0);
		
		for (int contador = 0; contador < vetentrada.length; contador++) {
			if(vetentrada[contador] == 'a') {
				resultado[contador] = vetcripto[0];
			} else if(vetentrada[contador] == 'b'){
				resultado[contador] = vetcripto[1];
			} else if(vetentrada[contador] == 'c'){
				resultado[contador] = vetcripto[2];
			} else if(vetentrada[contador] == 'd'){
				resultado[contador] = vetcripto[3];
			} else if(vetentrada[contador] == 'e'){
				resultado[contador] = vetcripto[4];
			} else if(vetentrada[contador] == 'f'){
				resultado[contador] = vetcripto[5];
			} else if(vetentrada[contador] == 'g'){
				resultado[contador] = vetcripto[6];
			} else if(vetentrada[contador] == 'h'){
				resultado[contador] = vetcripto[7];
			} else if(vetentrada[contador] == 'i'){
				resultado[contador] = vetcripto[8];
			} else if(vetentrada[contador] == 'j'){
				resultado[contador] = vetcripto[9];
			} else if(vetentrada[contador] == 'l'){
				resultado[contador] = vetcripto[10];
			} else if(vetentrada[contador] == 'm'){
				resultado[contador] = vetcripto[11];
			} else if(vetentrada[contador] == 'n'){
				resultado[contador] = vetcripto[12];
			} else if(vetentrada[contador] == 'o'){
				resultado[contador] = vetcripto[13];
			} else if(vetentrada[contador] == 'p'){
				resultado[contador] = vetcripto[14];
			} else if(vetentrada[contador] == 'q'){
				resultado[contador] = vetcripto[15];
			} else if(vetentrada[contador] == 'r'){
				resultado[contador] = vetcripto[16];
			} else if(vetentrada[contador] == 's'){
				resultado[contador] = vetcripto[17];
			} else if(vetentrada[contador] == 't'){
				resultado[contador] = vetcripto[18];
			} else if(vetentrada[contador] == 'u'){
				resultado[contador] = vetcripto[19];
			} else if(vetentrada[contador] == 'v'){
				resultado[contador] = vetcripto[20];
			} else if(vetentrada[contador] == 'x'){
				resultado[contador] = vetcripto[21];
			} else if(vetentrada[contador] == 'z'){
				resultado[contador] = vetcripto[22];
			}
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a frase que deseja criptografar:");
		String vetor = entrada.nextLine();

		for (int contador = 0; contador < criptografarVetor(vetor).length; contador++) {
			System.out.print(criptografarVetor(vetor)[contador] + " ");
		}
		
		entrada.close();
	}

}
