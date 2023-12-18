package Loops;

import java.util.Scanner;

public class DoWhileAtividade5 {
	
public static void main(String[] args) {
		
		int numero, soma=0;
		
		Scanner read = new Scanner(System.in);
		
		do {
		System.out.println("\nEntre com um número: ");
		numero = read.nextInt();
		if(numero > 0) {
			soma += numero; }
		}while(numero!=0); 
		
		System.out.println("\nA soma dos números positivos é: " + soma);
		
		read.close();
			
		}

}
