package VetoreseMatrizes;

import java.util.Scanner;

public class VetoresAtividade1 {
	
	public static void main(String[] args) {

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero, posicao = -1;
		Scanner read = new Scanner(System.in);

		System.out.println("Escolha um número de 1 a 10 e mostraremos sua posição:");
		numero = read.nextInt();

		for (int contador = 0; contador < vetor.length; contador++) {
			if (vetor[contador] == numero) {
				posicao = contador;
			}
		}
		if (posicao != -1) {
			System.out.println("O número" + numero + "está localizado na posição: " + posicao);
		} else {
			System.out.println("O número" + numero + "não foi encontrado!");
		}

		read.close();
	}

}
