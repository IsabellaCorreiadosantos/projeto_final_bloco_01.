package projeto_final_bloco_01;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.model.Carrinho;
import projeto_final_bloco_01.model.Livros;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		Carrinho livro = new Carrinho();
	
		
		int opcao;
		String seuNome;
		int senha;
	    Scanner leia = new Scanner(System.in);
while (true) {
			
			System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Loja de livros online                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("             Escolha uma opção                       ");
			System.out.println("                                                     ");
			System.out.println("            1 - cadastrar cliente                    ");
			System.out.println("            2 - listar clientes                      ");
			System.out.println("            3 - comprar livro                        ");
			System.out.println("            4 - verificar meu carrinho               ");
			System.out.println("            0 - sair                                 ");
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
					System.out.println(Cores.TEXT_WHITE + " cadastre-se!\n\n");
				
					System.out.println("Digite seu nome: ");
					seuNome = leia.next();
					System.out.println("Digite sua senha: ");
					leia.skip("\\R?");
					senha = leia.nextInt();
				
				
				
			case 2: 
				
			case 3:
				System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************************************");
				System.out.println("                                                                              ");
				System.out.println("               Livros disponiveis no momento                                  ");
				System.out.println("                                                                              ");
				System.out.println("******************************************************************************");
				System.out.println("                                                                              ");
				System.out.println("            1- A Sombra do Vento- Carlos Ruiz Zafón      |R$ 50.00            ");
				System.out.println("            2- A Revolução dos Bichos - George Orwell    |R$ 65.00            ");
				System.out.println("            3- O Código Da Vinci - Dan Brown             |R$ 25.00            ");
				System.out.println("            4- 1984 - George Orwell                      |R$ 40.00            ");
				System.out.println("            5- O Alquimista - Paulo Coelho               |R$ 30.00            ");
				System.out.println("                                                                              ");
				System.out.println("******************************************************************************");
				System.out.println(Cores.TEXT_PURPLE + " numero  do livro que você deseja comprar: " );
				
				int livroEscolhido = leia.nextInt();
				
				livro.escolherlivro(livroEscolhido);
				
				break;
				
			case 4:
				
				livro.mostrarCar();
			 break;
			default:
				System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);
				
			}
  		}	
	}
}