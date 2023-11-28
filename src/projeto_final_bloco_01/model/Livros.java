package projeto_final_bloco_01.model;

public abstract class Livros {
	
	protected String nomeL;
	protected int preco;
	
	

	
	public abstract void colocarCar();
	
	public abstract void escolherlivro(int livrosEscolhido);
	
	public String getNomeL() {
		return nomeL;
	}
	public void setNomeL(String livro) {
		this.nomeL = livro;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}

	public void colocarCar(String livro) {
		
		
	}
	
	
	
		
	

	
	
}
