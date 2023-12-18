package control_flow;

import java.util.Scanner;

public class IfAtividade2 {
	
public static void main(String[] args){
		
		int n1;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número");
		n1 = read.nextInt();
		
		float diferenca = (n1%2);
		
		if(n1 >= 0 && diferenca == 0 ) {
			System.out.println("\nO número " + n1 + "é positivo e par");
		}
		if(n1 >= 0 && diferenca != 0 ) {
			System.out.println("\nO número " + n1 + "é positivo e impar");
		}
		if(n1 <= 0 && diferenca == 0 ) {
			System.out.println("\nO número " + n1 + "é negativo e par");
		}
		if(n1 <= 0 && diferenca != 0 ) {
			System.out.println("\nO número " + n1 + "é negativo e impar");
		}
		read.close();
		
				
	
		}
}
