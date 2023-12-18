package operadores;

import java.util.Scanner;

public class Atividade2 {
	
public static void main(String[] args) {

	Scanner read = new Scanner(System.in);
	
	System.out.println("Entre com Nota 1: ");
	float nota1 = read.nextFloat();
	
	System.out.println("Entre com Nota 2: ");
	float nota2 = read.nextFloat();
	
	System.out.println("Entre com Nota 3: ");
	float nota3 = read.nextFloat();
	
	System.out.println("Entre com Nota 4: ");
	float nota4 = read.nextFloat();
	
	
	float mediaFinal = (nota1 + nota2 + nota3 + nota4) /4;
	
	System.out.println("Media final: " + mediaFinal);
	
	read.close();
}

}
