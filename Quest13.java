package lista3Funcoes;

import java.util.Scanner;

public class Quest13 {

	public static char[] descriptografarVetor(String vetor) {
		String descriptografia = "abcdefghijlmnopqrstuvxz";
//		String criptografia = "%*(-+@#123456789{}!&$?:";
		char resultado[] = new char[vetor.length()];
		char vetdescripto[] = new char[descriptografia.length()];
		char vetentrada[] = new char[vetor.length()];
		vetor.getChars(0, vetor.length(), vetentrada, 0);
		descriptografia.getChars(0, descriptografia.length(), vetdescripto, 0);
		
		for (int contador = 0; contador < vetentrada.length; contador++) {
			if(vetentrada[contador] == '%') {
				resultado[contador] = vetdescripto[0];
			} else if(vetentrada[contador] == '*'){
				resultado[contador] = vetdescripto[1];
			} else if(vetentrada[contador] == '('){
				resultado[contador] = vetdescripto[2];
			} else if(vetentrada[contador] == '-'){
				resultado[contador] = vetdescripto[3];
			} else if(vetentrada[contador] == '+'){
				resultado[contador] = vetdescripto[4];
			} else if(vetentrada[contador] == '@'){
				resultado[contador] = vetdescripto[5];
			} else if(vetentrada[contador] == '#'){
				resultado[contador] = vetdescripto[6];
			} else if(vetentrada[contador] == '1'){
				resultado[contador] = vetdescripto[7];
			} else if(vetentrada[contador] == '2'){
				resultado[contador] = vetdescripto[8];
			} else if(vetentrada[contador] == '3'){
				resultado[contador] = vetdescripto[9];
			} else if(vetentrada[contador] == '4'){
				resultado[contador] = vetdescripto[10];
			} else if(vetentrada[contador] == '5'){
				resultado[contador] = vetdescripto[11];
			} else if(vetentrada[contador] == '6'){
				resultado[contador] = vetdescripto[12];
			} else if(vetentrada[contador] == '7'){
				resultado[contador] = vetdescripto[13];
			} else if(vetentrada[contador] == '8'){
				resultado[contador] = vetdescripto[14];
			} else if(vetentrada[contador] == '9'){
				resultado[contador] = vetdescripto[15];
			} else if(vetentrada[contador] == '{'){
				resultado[contador] = vetdescripto[16];
			} else if(vetentrada[contador] == '}'){
				resultado[contador] = vetdescripto[17];
			} else if(vetentrada[contador] == '!'){
				resultado[contador] = vetdescripto[18];
			} else if(vetentrada[contador] == '&'){
				resultado[contador] = vetdescripto[19];
			} else if(vetentrada[contador] == '$'){
				resultado[contador] = vetdescripto[20];
			} else if(vetentrada[contador] == '?'){
				resultado[contador] = vetdescripto[21];
			} else if(vetentrada[contador] == ':'){
				resultado[contador] = vetdescripto[22];
			}
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a frase que deseja descriptografar:");
		String mensagem = entrada.nextLine();
		
		for (int contador = 0; contador < descriptografarVetor(mensagem).length; contador++) {
			System.out.print(descriptografarVetor(mensagem)[contador] + " ");
		}
		
		entrada.close();
	}

}
