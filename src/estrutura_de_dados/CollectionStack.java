package estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack {
	
	public static void main(String[] args) {
		
		Stack<String> bookStack = new Stack<String>();
		Scanner read = new Scanner(System.in);
		int i;
		
		do {
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.print("Escolha uma opção: ");

            i = read.nextInt();
            read.nextLine();
            
            switch (i) {
            case 1:
                System.out.print("Digite o nome do livro a ser adicionado: ");
                String newBook = read.nextLine();
                bookStack.push(newBook);
                System.out.println("Livro adicionado com sucesso!");
                break;

            case 2:
                if (bookStack.isEmpty()) {
                    System.out.println("A pilha está vazia. Nenhum livro para listar.");
                } else {
                    System.out.println("Livros na pilha:");
                    for (String livro : bookStack) {
                        System.out.println(livro);
                    }
                }
                break;

            case 3:
                if (bookStack.isEmpty()) {
                    System.out.println("A pilha está vazia. Nenhum livro para retirar.");
                } else {
                    String livroRetirado = bookStack.pop();
                    System.out.println("Livro retirado: " + livroRetirado);
                }
                break;

            case 0:
                System.out.println("Programa finalizado.");
                break;
                
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
            }
		} while (i != 0);

        read.close();
            
	}
}
