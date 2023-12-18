package Loops;

import java.util.Scanner;

public class WhileAtividade3 {
	
public static void main(String[] args) {
		
		int maiorDe=0, menorDe=0;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com a sua Idade:  ");
		int idade = read.nextInt();
		
		while(idade >= 0) {
			if(idade < 21) {
				menorDe++;
			}else if(idade < 50) {
				maiorDe++;
			}
			System.out.println("Digite uma idade novamente: ");
			idade = read.nextInt();
		}
		
		
		System.out.println("Total de pessoas menores de 21 anos: " + menorDe);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorDe);
	}

}
