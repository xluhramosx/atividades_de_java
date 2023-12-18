package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListAtividade1 {
	
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		ArrayList<String> colorList = new ArrayList<>();
		
		int cor;
		
		for (cor = 0; cor < 5; cor++) {
			System.out.println("Digite a" +(cor + 1) + "ª cor: ");
			String color = read.nextLine();
			colorList.add(color);
		}
		
		read.close();
			System.out.println("Listar todas as cores: ");
			for(String color: colorList) {
				System.out.println(color);
			}
			
			Collections.sort(colorList);
			
			System.out.println("Ordenar as cores: ");
			for (String color: colorList) {
			System.out.println(color);
			}
			
		}

}
