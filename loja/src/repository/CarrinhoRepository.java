package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Carrinho;
import model.Produto;

public class CarrinhoRepository {
	private List<Carrinho> carrinhos = new ArrayList<Carrinho>();

	public Carrinho addCarrinho(Carrinho carrinho) {
		carrinhos.add(carrinho);
		return carrinho;
	}

	public Carrinho updateCarrinho(Long id, Carrinho carrinho) {
		for (int i = 0; i < carrinhos.size(); i++) {
			if (carrinhos.get(i).getId() == id) {
				Carrinho carrinhoAtual = carrinhos.get(i);
				if (carrinhoAtual.getId() == carrinho.getId()) {
					carrinhos.add(i, carrinho);
					break;
				}
			}
		}
		return carrinho;
	}

	public void deleteCarrinho(Carrinho carrinho) {
		for (int i = 0; i < carrinhos.size(); i++) {
			Carrinho carrinhoAtual = carrinhos.get(i);
			if (carrinhoAtual.equals(carrinho)) {
				carrinhos.remove(i);
			}
		}
	}

	public List<Carrinho> readAll(Carrinho carrinho) {
		return this.carrinhos;
	}

	public HashMap<Long, Produto> addProduto(Carrinho carrinho, Produto produt) {
		if (carrinhos.contains(carrinho)) {
			carrinho.setLista(produt);

		}
		return null;
	}

	public Produto listaKdaClient(Carrinho carrinhos, Long cliente) {
		return carrinhos.getLista(cliente);
	}

	public Carrinho getById(Long id) {
		for (int i = 0; i < carrinhos.size(); i++) {
			if (carrinhos.get(i).getId() == id) {
				return this.carrinhos.get(i);
			}
		}
		return this.carrinhos.get(-1);
	}

	public void deleteById(Long id) {
		for (int i = 0; i < carrinhos.size(); i++) {
			if (carrinhos.get(i).getId() == id) {
				carrinhos.remove(i);
			}

		}
	}
}