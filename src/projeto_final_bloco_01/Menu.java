package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int opcao;
		String titulo,autor;
	    double preco;
	    Scanner leia = new Scanner(System.in);
while (true) {
			
			System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Loja de livros online                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("             Qual livro você deseja                  ");
			System.out.println("                                                     ");
			System.out.println("            1 - titulo do livro                      ");
			System.out.println("            2 - qual autor do livro                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_PURPLE + " titulo do livro: ");
				titulo = leia.next();
				break;
			case 2: 
				System.out.println(Cores.TEXT_PURPLE + "qual autor do livro: ");
				autor = leia.next();
				break;
				
				
				}
			
		

			}
	
		}
	}
