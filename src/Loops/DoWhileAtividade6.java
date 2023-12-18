package Loops;

import java.util.Scanner;

public class DoWhileAtividade6 {
	
	public static void main(String[] args) {

		int numero = 0, c = 0, multi = 0;
		float media = 0;
		Scanner read = new Scanner(System.in);

		do {
			System.out.println("\nDigite um número diferente de 0: ");
			numero = read.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				multi += numero;
				c++;
			}

		} while (numero != 0);
		
		if(c > 0) {
			media = (float)multi / c;
			System.out.println("\nA média de todos os números múltiplos de 3 é " + media);
		}

		System.out.println("\nObrigado por participar");
		
		read.close();

	}

}
