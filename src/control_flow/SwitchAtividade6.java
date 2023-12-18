package control_flow;

import java.util.Scanner;

public class SwitchAtividade6 {
	
	public static void main(String[] args) {
		
		String nome; int cargo; float salario;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n\t Cargo");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		System.out.println("\nDigite seu nome: ");
		nome = read.nextLine();
		System.out.println("\nDigite o código do Cargo: ");
		cargo = read.nextInt();
		System.out.println("\nDigite Salário: ");
		salario = read.nextFloat();	  
		
		switch(cargo) {
		case 1: 
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: " + cargo + 
					"\nNovo Salário: " + (salario + (10 * 1000 / 100) ));
			break;
		case 2: 
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: " + cargo + 
					"\nNovo Salário: " + (salario + (7 * 1000 / 100) ));
			break;
		case 3: 
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: " + cargo + 
					"\nNovo Salário: " + (salario + (9 * 1000 / 100) ));
			break;
		case 4: 
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: " + cargo + 
					"\nNovo Salário: " + (salario + (6 * 1000 / 100) ));
			break;
		case 5: 
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: " + cargo + 
					"\nNovo Salário: " + (salario + (5 * 1000 / 100) ));
			break;
		case 6: 
			System.out.println("Nome do Colaborador: " + nome + "\nCargo: " + cargo + 
					"\nNovo Salário: " + (salario + (8 * 1000 / 100) ));
			break;
		}
		read.close();
	}

}
