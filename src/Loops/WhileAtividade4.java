package Loops;

import java.util.Scanner;

public class WhileAtividade4 {
	
public static void main(String[] args) {
		
		int idade, genero, soma=0, categoria=0, back=0, front=0, mobile=0, fullstack=0, cont=0, media=0;
		String continuar ="S";
		
		Scanner read = new Scanner(System.in);
		
		while (continuar.equalsIgnoreCase("S")) {
			System.out.println("Digite sua idade: ");
            idade = read.nextInt();
            
            System.out.println("Digite seu gênero (\n1 – Mulher Cis\n 2 - Homem Cis\n 3 - Não Binário\n 4 - Mulher Trans\n 5 - Homem Trans\n 6 - Outros)");
            genero = read.nextInt();
             while(genero < 1 || genero >6) {
            	System.out.println("Digite seu gênero (\n1 – Mulher Cis\n 2 - Homem Cis\n 3 - Não Binário\n 4 - Mulher Trans\n 5 - Homem Trans\n 6 - Outros)");
                genero = read.nextInt();
             }
            
            System.out.println("Digite sua categoria: ");
            System.out.println("(1-Back/2-Front/3-Mobile/4-FullStack)");
            categoria = read.nextInt();
            while (categoria < 1 || categoria > 4) {
				System.out.println("Digite a categoria..");
				System.out.println("(1-Back/2-Front/3-Mobile/4-Full): ");
				categoria = read.nextInt();
			}
            
            if (categoria == 1) {
            	back++;
            }
            if (categoria == 2 && genero == 2) {
        	   front++;
           }
           if (categoria == 3 && genero == 1 && idade > 40) {
        	   fullstack++;   
           }
           
           cont++;
           soma += idade;
           
           read.nextLine();
            System.out.println("Deseja continuar? (S/N)?");
            continuar = read.nextLine();
		}
		
		media = soma / cont;
        
        
        System.out.println("\nTotal de pessoas desenvolverodas Backend: " + back);
        System.out.println("\nTotal de pessoas desenvolverodas Frontend: " + front);
        System.out.println("\nTotal de pessoas desenvolverodas Mobile maiores de 40 anos: " + mobile);
        System.out.println("\nTotal de pessoas desenvolverodas Fullstack menores de 30anos: " + fullstack);
        System.out.println("\nTotal de pessoas que responderam essa pesquisa: " + cont);
        System.out.println("\nA média de idade das pessoas que responderam a pesquisa é: " + media);
        }

}
