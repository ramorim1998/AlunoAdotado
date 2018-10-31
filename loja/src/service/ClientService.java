package service;

import java.util.ArrayList;

import loja.Client;
import repository.ClientRepository;

public class ClientService {
	private ClientRepository client = new ClientRepository();

	public Client adicionarClient(Client client) {
		this.client.adicionarClient(client);
		return client;
	}

	public void removerClient(Client client) {
		this.client.deletarClient(client);
	}

	public void atualizarClient(Client client, Long id) {
		this.client.updateClient(client, id);
	}

	public ArrayList<Client> listarAll() {
		return this.client.readAll(null);
	}
}
