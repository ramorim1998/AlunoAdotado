package repository;

import java.util.ArrayList;
import loja.Client;

public class ClientRepository {
	private ArrayList<Client> clientes = new ArrayList<Client>();
	private Long idSequence = 0L;

	public Client AddClient(Client client) {
		client.setId(idSequence);
		clientes.add(client);
		this.incSequenceClient();
		return client;
	}

	public Client updateClient(Client client) {
		for (int i = 0; i < clientes.size(); i++) {
			Client clientAtual = clientes.get(i);
			if (clientAtual.equals(client)) {
				clientes.add(i, client);
				break;
			}
		}
		return client;
	}

	public void deleteClient(Client client) {
		for (int i = 0; i < clientes.size(); i++) {
			Client clientAtual = clientes.get(i);
			if (clientAtual.equals(client)) {
				clientes.remove(i);
			}
		}
	}
	
	public ArrayList<Client> readAll (Client client){
		return this.clientes;
	}

	private void incSequenceClient() {
		this.idSequence++;
	}

	@Override
	public String toString() {
		return "ClientRepository [clientes=" + clientes + ", idSequence=" + idSequence + "]";
	}
	
}
