package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetAtividade3 {
	
public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		
		Set<Integer> numberSet = new HashSet<>();
		
		System.out.println("Digite com números inteiros sem repetição");
		
		for(int indice=0; indice<10; indice++) {
		System.out.println("Entre com os 10 números: ");
		int leitor = read.nextInt();
		numberSet.add(leitor); 
		}
		
		System.out.println("Lista dos número inseridos");
		Iterator<Integer> Interador= numberSet.iterator();
		while(Interador.hasNext()) {
			System.out.println(Interador.next());
		}
		read.close();
		
	}

}
