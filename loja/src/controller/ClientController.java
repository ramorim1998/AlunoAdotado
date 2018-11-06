package controller;

import java.util.ArrayList;

import model.Client;
import service.ClientService;

public class ClientController {
	ClientService cliente;

	public ArrayList<Client> getAll() {
		return cliente.listarAll();
	}

	public Client addCliente(Client cliente) {
		return this.cliente.adicionarClient(cliente);
	}

	public void updateCliente(Client cliente, Long id) {
		this.cliente.atualizarClient(cliente, id);
	}

	public Client getById(Long id) {
		return this.cliente.getById(id);
	}

	public void deletarById(Long id) {
		this.cliente.deleteById(id);
	}
}
