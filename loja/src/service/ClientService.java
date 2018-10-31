package service;

import java.util.ArrayList;

import loja.Client;
import repository.ClientRepository;

public class ClientService {
	private ClientRepository client = new ClientRepository();

	public Client addClient(Client client) {
		this.client.AddClient(client);
		return client;
	}

	public void removeClient(Client client) {
		this.client.deleteClient(client);
	}

	public void attClient(Client client) {
		this.client.updateClient(client);
	}

	public ArrayList<Client> listAll() {
		return this.client.readAll(null);
	}
}
