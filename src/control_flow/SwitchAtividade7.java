package control_flow;

import java.util.Scanner;

public class SwitchAtividade7 {
	
	public static void main(String[] args) {
		float numero1,numero2;
		int codigo;
		
		 Scanner read = new Scanner(System.in);
		 
		 System.out.println("\n\t Escolha a Operação");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Divisão");
			System.out.println("4 - Multiplicação");
			System.out.println("\n\t Digite o Código da Operação");
			System.out.println("\n\t Digite o primeiro número");
			System.out.println("\n\t Digite o segundo número");
			
			codigo = read.nextInt();
			numero1 = read.nextInt();
			numero2 = read.nextInt();
			
			switch(codigo) {
			case 1: 
				System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2) );
				break;
			case 2: 
				System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2) );
				break;
			case 3: 
				System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2) );
				break;
			case 4: 
				System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2) );
				break;
			    default:
				System.out.println("\nOperação Inválida!!!");
				read.close();
			}
			
			}

}
