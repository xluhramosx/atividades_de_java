package control_flow;

import java.util.Scanner;

public class IfAtividade3 {
	
public static void main(String[] args){
		
		String nome; int idade; boolean doacao;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = read.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = read.nextInt();
		
		System.out.println("É sua primeira doação?: ");
		doacao = read.nextBoolean();
		
		if(idade >= 18 && idade <= 69 && !doacao) {
			System.out.println(nome + "está apta para doar sangue!");
		}else {
			System.out.println(nome + "não está apto para doar sangue!");
		}
		read.close();
	}


}
