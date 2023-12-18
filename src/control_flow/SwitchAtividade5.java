package control_flow;

import java.util.Scanner;

public class SwitchAtividade5 {
	
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int produto,quantidade;
		
		System.out.println("\n\t Codigo do Produto");
		System.out.println("1 - Cachorro Quente");
		System.out.println("2 - X-Salada");
		System.out.println("3 - X-Bacon");
		System.out.println("4 - Bauru");
		System.out.println("5 - Refrigerante");
		System.out.println("6 - Suco de Laranja");
		System.out.println("\nDigite a sua opção: ");
		System.out.println("\nDigite a quantidade: ");
		
		produto = read.nextInt();
		quantidade = read.nextInt();
		
		switch(produto) {
		case 1:
			System.out.println("Produto: " + produto + "\nValor Total" + (quantidade * 10) );
			break;
		case 2:
			System.out.println("Produto: " + produto + "\nValor Total" + (quantidade * 15) );
			break;
		case 3:
			System.out.println("Produto: " + produto + "\nValor Total" + (quantidade * 18) );
			break;
		case 4:
			System.out.println("Produto: " + produto + "\nValor Total" + (quantidade * 12) );
			break;
		case 5:
			System.out.println("Produto: " + produto + "\nValor Total" + (quantidade * 8) );
			break;
		case 6:
			System.out.println("Produto: " + produto + "\nValor Total: " + (quantidade * 13) );
			break;
		}
		
		read.close();
	}

}
