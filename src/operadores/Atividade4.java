package operadores;

import java.util.Scanner;


public class Atividade4 {
	
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite Numero 1: ");
		float n1 = read.nextFloat();
		
		System.out.println("Digite Numero 2: ");
		float n2 = read.nextFloat();
		
		System.out.println("Digite Numero 3: ");
		float n3 = read.nextFloat();
		
		System.out.println("Digite Numero 4: ");
		float n4 = read.nextFloat();
		
		
		float diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + diferenca);
		
		read.close();
	}

}
