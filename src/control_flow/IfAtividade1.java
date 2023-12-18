package control_flow;

import java.util.Scanner;

public class IfAtividade1 {
	

	float n1, n2, n3;
	
	public static void main(String[] args){
		
		Scanner read = new Scanner(System.in);
		
				int n1 = 2, n2 = 4, n3 = 5;
				
				if((n1 + n2) < n3) {
					System.out.println("A soma é menor que o número 3");
				}
				
				if((n1 + n2) == n3 ){
					System.out.println("A soma é igual ao número 3.");
				}
				
				if((n1 + n2) > n3)
					System.out.println("A soma é maior que  o número 3.");
				
				read.close();
	
		}
		
	}
