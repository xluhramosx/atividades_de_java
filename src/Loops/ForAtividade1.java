package Loops;

import java.util.Scanner;

public class ForAtividade1 {
	
public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo:");
		int primeiroNumero = read.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		int segundoNumero = read.nextInt();
		int contador;
		
		read.close();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("\nO intervalo é invalido:");
		}else {
		
		for(contador = primeiroNumero; contador < segundoNumero; contador++) {
			if(contador%3 == 0 && contador%5 ==0) {
				System.out.println(contador + "é múltiplo de 3 e 5.");
		}
		}
		
		}
	}

}
