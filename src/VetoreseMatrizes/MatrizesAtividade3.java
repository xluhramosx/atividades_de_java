package VetoreseMatrizes;

import java.util.Scanner;

public class MatrizesAtividade3 {
	
public static void main(String[] args) {
		
		int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int diagonalPrincipal,diagonalSecundaria, somaPrincipal=0, somaSecundaria=0, indice;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nElementos da Diagonal Principal:");
		for(indice = 0; indice <3; indice++) {
			System.out.println(matriz[indice][indice] + " ");
		}
		
		System.out.println("\nElementos da Diagonal Secundária:");
		for(indice = 0; indice <3; indice++) {
			System.out.println(matriz[indice][2 - indice] + " ");
		}
		
		for(indice = 0; indice <3; indice++) {
			somaPrincipal += matriz[indice][indice];
		}
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
		
		for(indice = 0; indice <3; indice++) {
			somaSecundaria += matriz[indice][2 - indice];
		}
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
		
		
		read.close();
	}

}
