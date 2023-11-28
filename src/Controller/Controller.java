package Controller;

import java.util.ArrayList;

import projeto_final_bloco_01.model.Cliente;
import projeto_final_bloco_01.model.Repository;

public class Controller implements Repository{

	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	
	@Override
	public void listarTodas() {
		for (var cliente : listaClientes) {
			System.out.println(cliente.getNome());
		}
		
	}


	@Override
	public void cadastrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	
	
}
