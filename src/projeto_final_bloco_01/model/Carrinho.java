package projeto_final_bloco_01.model;

import java.util.ArrayList;


import projeto_final_bloco_01.Menu;

public class Carrinho extends Livros {

	private ArrayList<String> LivrosNoCarrinho = new ArrayList<String>();
	
	
	private int opcao;
	private float preco = 0;
	private int ValorTotal;
	
	
	
	@Override
	public void escolherlivro(int livroEscolhido) {
		
		switch (livroEscolhido) {
		case 1:
			this.setNomeL("A Sombra do Vento ");
			this.setPreco(50.00F); 
			this.colocarCar(getNomeL());
			
			break;
		case 2:
			this.setNomeL("A Revolução dos Bichos " );
			this.setPreco(65.00F);
			this.colocarCar(getNomeL());
			break;
		case 3:
			this.setNomeL("O Código Da Vinci " );
			this.setPreco(25.00F);
			this.colocarCar(getNomeL());
			break;
		case 4:
			this.setNomeL("1984 " );
			this.setPreco(40.00F);
			this.colocarCar(getNomeL());
			break;
		case 5:
			this.setNomeL("O Alquimista " );
			this.setPreco(30.00F);
			this.colocarCar(getNomeL());
			break;
		
		}	
		
		
		
		System.out.println("livro no carrinho " + this.getNomeL());
		System.out.printf("Valor total: " + this.getPreco());
		
	}


	public int getOpcao() {
		return opcao;
	}


	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public int getValorTotal() {
		return ValorTotal;
	}


	public void setValorTotal(int valorTotal) {
		ValorTotal = valorTotal;
	}


	@Override
	public void colocarCar(String livro) {
		LivrosNoCarrinho.add(livro);
		
	}
	
	public void mostrarCar() {
		for(String livros :LivrosNoCarrinho) {
			 System.out.println(livros);
			 
		 }
	}

	@Override
	public void colocarCar() {
		
		
	}
	
	

	
	
	
	
	

	
}
