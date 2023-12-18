package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueueFila {
    public static void main(String[] args) {
    	
        Queue<String> bankLine = new LinkedList<>();
        Scanner read = new Scanner(System.in);
        int op;

        do {
        	System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            
            op = read.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do Cliente:");
                    String clientName = read.nextLine();
                    bankLine.add(clientName);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                    
                case 2:
                	if (bankLine.isEmpty()) {
                	System.out.println("A fila está vazia.");
                	} else {
                		System.out.println("Clientes na fila:");
                		for (String cliente : bankLine) {
                            System.out.println(cliente);
                		}
                        }
                    break;
                case 3:
                	if (bankLine.isEmpty()) {
                		System.out.println("A fila está vazia.");
                	} else {
                		String callClient = bankLine.poll();
                		System.out.println("Cliente chamado: " + callClient);
                	}
            break;
                    
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                
            }
        } while (op != 0);

        read.close();

        } 
    }
    


