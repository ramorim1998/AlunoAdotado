package repository;

import java.util.ArrayList;

import model.Client;

public class ClientRepository {
	private ArrayList<Client> clientes = new ArrayList<Client>();
	private Long idSequence = 0L;

	public Client adicionarClient(Client client) {
		client.setId(idSequence);
		clientes.add(client);
		this.incSequenceClient();
		return client;
	}

	public Client updateClient(Client client, Long id) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getId() == id) {
				Client clientAtual = clientes.get(i);
				if (clientAtual.equals(client)) {
					clientes.add(i, client);
					break;
				}
			}
		}
		return client;
	}

	public void deletarClient(Client client) {
		for (int i = 0; i < clientes.size(); i++) {
			Client clientAtual = clientes.get(i);
			if (clientAtual.equals(client)) {
				clientes.remove(i);
			}
		}
	}

	public ArrayList<Client> readAll(Client client) {
		return this.clientes;
	}

	private void incSequenceClient() {
		this.idSequence++;
	}
	
	public Client getById(Long id) {
		for (int i = 0; i < clientes.size(); i++) {
			if(this.clientes.get(i).getId() == id) {
				return this.clientes.get(i);
			}
		}
		return this.clientes.get(-1);
	}
	
	public void deleteById(Long id) {
		for (int i = 0; i < clientes.size(); i++) {
			if(this.clientes.get(i).getId() == id) {
				clientes.remove(i);
			}
		}
	}

	@Override
	public String toString() {
		return "ClientRepository [clientes=" + clientes + ", idSequence=" + idSequence + "]";
	}

}
