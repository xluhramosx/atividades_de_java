package control_flow;

import java.util.Scanner;

public class IfAtividade4 {
	
	public static void main(String[] args) {
		
	    String primeiraPalavra, segundaPalavra, terceiraPalavra;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com a primeira palavra: ");
		primeiraPalavra = read.nextLine();
		System.out.println("Entre com a segunda palavra: ");
		segundaPalavra = read.nextLine();
		System.out.println("Entre com a terceira palavra: ");
		terceiraPalavra = read.nextLine();
		
		if (primeiraPalavra.equals("Vertebrado") && segundaPalavra.equals("Ave") && terceiraPalavra.equals("Carnivoro")) {
			System.out.println("Águia");
		}else if (primeiraPalavra.equals("Vertebrado") && segundaPalavra.equals("Ave") && terceiraPalavra.equals("Onívoro")) {
		    System.out.println("Pomba");
		}else if (primeiraPalavra.equals("Vertebrado") && segundaPalavra.equals("Mamifero") && terceiraPalavra.equals("Onívoro")) {
		    System.out.println("Homem");
		}else if (primeiraPalavra.equals("Vertebrado") && segundaPalavra.equals("Mamifero") && terceiraPalavra.equals("Herbivero")) {
		    System.out.println("Vaca");
		}else if (primeiraPalavra.equals("Invertebrado") && segundaPalavra.equals("Hematofago") && terceiraPalavra.equals("Onívoro")) {
		    System.out.println("Pomba");
		}else if (primeiraPalavra.equals("Invertebrado") && segundaPalavra.equals("Inseto") && terceiraPalavra.equals("Hematofago")) {
		    System.out.println("Pulga");
		}else if (primeiraPalavra.equals("Invertebrado") && segundaPalavra.equals("Inseto") && terceiraPalavra.equals("Herbivero")) {
		    System.out.println("Lagarta");
		}else if (primeiraPalavra.equals("Invertebrado") && segundaPalavra.equals("Anelideo") && terceiraPalavra.equals("Hematofago")) {
		    System.out.println("Sanguessuga");
		}else if (primeiraPalavra.equals("Vertebrado") && segundaPalavra.equals("Anelideo") && terceiraPalavra.equals("Onívoro")) {
		    System.out.println("Minhoca");
		}else {
		    System.out.println("Palavras-chave não correspondem a nenhum animal conhecido.");
				   
		}
		read.close();
	}

}
