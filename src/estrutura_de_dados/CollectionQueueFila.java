package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueueFila {
    public static void main(String[] args) {
    	
        Queue<String> bankLine = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while(opcao !=0 ) {
            
            
            System.out.println("\n\tMenu");
            System.out.println("1: Adicionar Cliente");
            System.out.println("2: Listar Clientes");
            System.out.println("3: Chamar Cliente");
            System.out.println("0: Sair");

            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Cliente" + bankLine);
                    break;
                case 2:
                	System.out.println("Listar Clientes" + bankLine);
                    break;
                case 3:
                	System.out.println("Chamar Cliente" + bankLine);
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } 
    }
    
}

