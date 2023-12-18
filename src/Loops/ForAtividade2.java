package Loops;

import java.util.Scanner;

public class ForAtividade2 {
	
public static void main(String[] args) {
		
		int pares=0, impares=0, contador;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com 10 números inteiros: ");
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.println("\nDigite o " + contador + "º n: ");
			int numero = read.nextInt(); 
			
			if(numero%2 == 0) {
				pares++;
			}else {
				impares++;
			}
		
		}
	

	
		read.close();
		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("\nTotal de números ímpares: " + impares);
	}

}
