package operadores;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String [] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite salario: ");
		double salario = read.nextDouble();
		
		System.out.println("Digite abono: ");
		double abono = read.nextDouble();
		
		double novoSalario = salario + abono;
		
		System.out.println("Novo Salario: " + novoSalario);
		
		read.close();
	}
	
}
