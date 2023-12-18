package operadores;

import java.util.Scanner;

public class Atividade3 {
	
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite Salario Bruto: ");
		float salarioBruto = read.nextFloat();
		
		System.out.println("Digite Adicional Noturno: ");
		float adicionalNoturno = read.nextFloat();
		
		System.out.println("Digite Hora Extra: ");
		float horaExtra = read.nextFloat();
		
		System.out.println("Digite Desconto: ");
		float desconto = read.nextFloat();
		
		
		float salarioLiquido = salarioBruto + adicionalNoturno +(horaExtra * 5) - desconto;
		
		System.out.println("Salário Líquido: " + salarioLiquido);
		
		read.close();
	}

}

